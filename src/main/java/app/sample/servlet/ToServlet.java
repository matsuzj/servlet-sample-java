package app.sample.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 別の Servlet に処理を委譲する
 * ・request.getRequestDispatcher("<処理を委譲する Servlet のパス>").forward(request, response) で、
 * 指定した Servlet に処理を委譲することができる。これをforwardと呼ぶ。
 * 
 */
public class ToServlet extends HttpServlet {

	private static final long serialVersionUID = 5704012116433185640L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("ToServlet.doGet()");
	}
}
