package app.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp-servlet")
public class JspServlet extends HttpServlet {

	private static final long serialVersionUID = -657437093454844032L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("JspServlet.doGet()");
		req.getRequestDispatcher("jsp/hello.jsp").forward(req, resp);
	}
}
