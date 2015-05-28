package app.sample.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet 初期化時にパラメータを渡す
 * web.xml の <servlet> タグ内で、 <init-param> タグを設定すると、 Servlet 初期化時に任意のパラメータを渡すことができる。
 * Servlet 側は、 ServletConfig を受け取る init() メソッドをオーバーライドすることで、このパラメータを受取ることができる。
 */

public class InitParamServlet extends HttpServlet {

	private static final long serialVersionUID = 4763877122873891263L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		String hoge = config.getInitParameter("hoge");
		System.out.println("hoge=" + hoge);
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) {
	}
}
