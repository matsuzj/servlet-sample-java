package app.sample.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/annotated")
public class AnnotatedServlet extends HttpServlet {

	private static final long serialVersionUID = -4312060070070284163L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("AnnotatedServlet.doGet()");
	}
}
