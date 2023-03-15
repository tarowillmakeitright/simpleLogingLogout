package chap06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSample02
 */
public class ServletSample02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSample02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//文字化け
		req.setCharacterEncoding("UTF-8");
		//引数の設定　
		String data = req.getParameter("DATA");

		res.setContentType("text/html; charset=UTF-8");

		//HTMLの道を表示しますよ。
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>サンプル02</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("送信データ：" + data);
		out.println("</body>");
		out.println("</html>");
	}

}
