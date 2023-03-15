package chap09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionSample01
 */
public class SessionSample01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionSample01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int count = 0;

		HttpSession session = req.getSession();

		if (session.isNew() == true || session.getAttribute("COUNT") == null) {
			session.setAttribute("COUNT", count);
		}

		count = (Integer)session.getAttribute("COUNT");
		count++;
		session.setAttribute("COUNT", count);

		res.setContentType("text/html; charset=UTF-8");

		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>セッション・サンプル01</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("カウント値：" + count + "<br>");
		out.println("<a href='./sessionsample01'>カウントアップ</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
