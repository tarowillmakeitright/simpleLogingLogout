package chap16;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Login;
import model.Logout;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		//ここであくしょんをとる。start.jsp 
		String action = req.getParameter("ACTION");

		String page = null;

		//ここでログインをとる。
		if (action.equals("LOGIN")) {
			Login login = new Login();
				//ログイン成功　True
			if (login.execute(req) == true) {
				page = "./chap16/success.jsp";
				//ログイン失敗　
			} else {
				page = "./chap16/start.jsp";
			}
			//Logout.javaからログアウトが送られてきたら、ここを実行します。
		} else if (action.equals("LOGOUT")) {
			Logout logout = new Logout();
			//ログアウトの実行をお願いします。
			logout.execute(req);
			//ページをここに飛ばします。
			page = "./chap16/start.jsp";
		}
		//指定したページにフォワードしてください。
		RequestDispatcher rd = req.getRequestDispatcher(page);
		rd.forward(req, res);
	}

}
