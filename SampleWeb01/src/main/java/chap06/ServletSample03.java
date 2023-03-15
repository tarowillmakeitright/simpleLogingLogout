package chap06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSample03
 */
public class ServletSample03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSample03() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//HTMLで設定したメタタグとおなじになるように設定してください。
		req.setCharacterEncoding("UTF-8");
		//この部分はHTMLから送られてきたデータを取得する。
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");

		res.setContentType("text/html; charset=UTF-8");

		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>サンプル03</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("名前：" + name + "<br>");
		out.println("性別：" + gender + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
