package chap06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSample04
 */
public class ServletSample04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSample04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");

		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>サンプル04</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("サーバ名：" + req.getServerName() + "<br>");
		out.println("サーバ名のポート番号：" + req.getServerPort() + "<br>");
		out.println("メソッド：" + req.getMethod() + "<br>");
		out.println("コンテキスト・ルートからのパス：" + req.getRequestURI() + "<br>");
		out.println("コンテキストパス名：" + req.getContextPath() + "<br>");
		out.println("Servletパス名：" + req.getServletPath() + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
