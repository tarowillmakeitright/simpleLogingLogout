package chap07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSample05
 */
public class ServletSample05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSample05() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		ServletContext context = config.getServletContext();

		String data1 = context.getInitParameter("DATA01");
		String data2 = config.getInitParameter("DATA02");
		String data3 = context.getInitParameter("DATA03");
		String data4 = config.getInitParameter("DATA04");

		res.setContentType("text/html; charset=UTF-8");

		//パラメータ　データを設定する箱
		//初期化パラメータ　　Servlet起動時に使用するデータをあらかじめ設定しておくパラメータ
		//設定方法　パラメータ名　（名前）とパラメータ値（値）のセットでデータを設定する。
		// web.xmlに接続URL　ユーザー名　パスワードを初期化することで一括管理一括変更できる。
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>サンプル05</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("コンテキスト初期化パラメータ：" + data1 + "<br>");
		out.println("Servlet初期化パラメータ：" + data2 + "<br>");
		out.println("コンテキスト初期化パラメータ：" + data3 + "<br>");
		out.println("Servlet初期化パラメータ：" + data4 + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
