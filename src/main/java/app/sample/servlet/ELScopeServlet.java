package app.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/el-scope-servlet")
public class ELScopeServlet extends HttpServlet {

	private static final long serialVersionUID = 5390619322489485247L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("hoge", "HOGE");
		req.getSession().setAttribute("fuga", "FUGA");
		req.getServletContext().setAttribute("piyo", "PIYO");

		req.setAttribute("same", "RequestValue");
		req.getSession().setAttribute("same", "SessionValue");
		req.getServletContext().setAttribute("same", "ApplicationValue");

		req.getRequestDispatcher("jsp/el4.jsp").forward(req, resp);
	}
}
