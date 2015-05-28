package app.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 別の Servlet に処理を委譲する
 * ・request.getRequestDispatcher("<処理を委譲する Servlet のパス>").forward(request, response) で、
 * 指定した Servlet に処理を委譲することができる。これをforwardと呼ぶ。
 * 
 */
public class FromServlet extends HttpServlet {

	private static final long serialVersionUID = -1704987570484132080L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("FromServlet.doGet()");
		req.getRequestDispatcher("/forward/to").forward(req, resp);
	}
}
