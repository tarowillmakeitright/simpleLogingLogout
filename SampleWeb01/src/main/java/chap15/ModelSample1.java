package chap15;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ModelSample1 {
	public void add(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");

		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2);
		int result = x + y;

		HttpSession session = request.getSession(true);
		session.setAttribute("result", result);
	}

}
