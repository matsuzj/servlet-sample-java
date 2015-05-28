package app.sample.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * <url-pattern> にはワイルドカード * を使用することができる。
 * *.sampleより*が優先される
 */

public class UrlPatternExtensionServlet extends HttpServlet {

	private static final long serialVersionUID = -6658918403734254210L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("UrlPatternExtensionServlet.doGet()");
	}
}
