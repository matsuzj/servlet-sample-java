package app.sample.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * ・request.getSession(boolean) でセッションを取得する。
 *   ・true を渡した場合、セッションが存在しないとセッションが新規に作成される。
 *   ・false を渡した場合、セッションが存在しないと null が返される。
 * ・セッションの ID はブラウザに保存される（普通は Cookie）。
 *   ・ブラウザは、リクエストのたびにこの ID をサーバーに渡す。
 *   ・サーバーは、受け取った ID をもとにクライアントを識別してセッションを管理する。
 * ・session.invalidate() でセッションを破棄できる。
 */
public class SessionServlet extends HttpServlet {

	private static final long serialVersionUID = -5578011570632939221L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		if (this.notExistsSession(req)) {
			this.createSession(req);
		}

		if ("/delete".equals(req.getPathInfo())) {
			this.deleteSession(req);
		} else {
			this.countUp(req);
		}
	}

	private boolean notExistsSession(HttpServletRequest request) {
		return request.getSession(false) == null;
	}

	private void createSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("count", 0);

		System.out.printf("session is created. id=%s%n", session.getId());
	}

	private void deleteSession(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		session.invalidate();

		System.out.printf("session is deleted. id=%s%n", session.getId());
	}

	private void countUp(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		int count = (int) session.getAttribute("count");
		session.setAttribute("count", ++count);

		System.out
				.printf("count up. id=%s, count=%d%n", session.getId(), count);
	}
}
