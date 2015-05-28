package app.sample.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet のインスタンスがいつ生成されて、いつ破棄されるのか
 * ・Servlet は、最初に URL にアクセスされたタイミングでインスタンスが生成される。
 *   ・このとき、 init() メソッドがコールバックされる。
 * ・一度生成された Servlet のインスタンスは、破棄されることなく使いまわされる。
 *   ・このとき、インスタンスを使用するスレッドは毎回異なる。
 *   ・よって、 Servlet を実装するときは、スレッドセーフにしなければならない。
 * ・一定時間 Servlet にアクセスが無かったり、サーバーが停止するときに Servlet のインスタンスは破棄される。
 *   ・このとき、 destroy() メソッドがコールバックされる。
 */

public class LifeCycleServlet extends HttpServlet {

	private static final long serialVersionUID = -8863214505858736766L;

	@Override
	public void init() throws ServletException {
		System.out.println("init() : hash=" + this.hashCode());
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("doGet() : hash=" + this.hashCode());
	}

	@Override
	public void destroy() {
		System.out.println("destroy() : hash=" + this.hashCode());
	}
}
