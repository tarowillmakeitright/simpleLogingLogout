package chap15;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ModelSample {
	public void tasu(HttpServletRequest req) {
		//HTMLからのデータを受け取る。
		String data1 = req.getParameter("DATA1");
		String data2 = req.getParameter("DATA2");

		//文字列を数字に変換
		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2);
		int result = x + y;

		//セッションオブジェクトをここで作る。
		HttpSession session = req.getSession(true);
		session.setAttribute("result", result);
	}
}
