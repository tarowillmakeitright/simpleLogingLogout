package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Logout {
	public void execute(HttpServletRequest req) {
		//セッションオブジェクトを取得
		HttpSession session = req.getSession(false);
		//セッションオブジェくとがあった場合は
		if (session != null) {
			//セッションオブジェクとを発生します。
			session.invalidate();
		}
	}
}
