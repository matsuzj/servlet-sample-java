package app.sample.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * スローされた例外ごとにページを指定する
 * <exception-type> タグで、例外ごとにエラーページを指定できる。
 */

public class NullPointerServlet extends HttpServlet {

	private static final long serialVersionUID = -1560511088462220227L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		throw new NullPointerException("NullPointerServlet");
	}
}
