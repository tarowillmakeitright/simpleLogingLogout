package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.DBConnection;
import dao.UserDAO;

public class Login {
	//ログインできているかできていないかを判断するメソッドを作ります。
	//boolean => login = true can't login = > false;
	public boolean execute(HttpServletRequest req) {
		boolean state = false;
		// １．もし既存のsessionオブジェクトがあればfalseを返す。

		HttpSession session = req.getSession(false);
		//2.　もしセッションオブジェクトがなければいったん破棄　
		//1と2：以前のセッションオブジェクトがのこっていたら消す作業
		//オンラインバンクでよく使われる
		if (session != null) {
			session.invalidate();
		}
		//IDから値を取ります。
		String id = req.getParameter("ID");
		//dbのオブジェクト生成。
		DBConnection db = new DBConnection();

		try {
			//UserDaoを生成します。
			UserDAO dao = new UserDAO(db);
			//userにIdがあったらUserDap.javaで探してもらいます。
			User user = dao.find(id);
			//もしユーザーが「いれば」、ユーザーに対して
			//セッションオブジェクをTrueにしてユーザー名を取得してください。
			//state = true ログインできたよと呼びかけてくれます。
			if (user != null) {
				session = req.getSession(true);
				session.setAttribute("user", user);
				state = true;
			}
		} catch (Exception e) {
			//ログインできてません。と呼びかけます。
			state = false;
		} finally {
			try {
				//ｄｂの切断をここでします。
				db.closeConnect();
			} catch (Exception e) {
				state = false;
			}
		}
		//ログインできていないかどうかをお知らせします。True？False?
		return state;
	}
}
