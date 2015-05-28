package app.sample.servlet;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * HTTP リクエストの情報を取得する
 * ・HTTP リクエストの情報は、 HttpServletRequest から取得できる。
 * ・クエリパラメータは、 getParameter() メソッドで取得できる。
 * ・リクエストボディは、 getReader() メソッドで取得した BufferedReader から取得できる。
 *   ・リクエストボディの取得は、 getInputStream() メソッドでも取得可能。
 *   ・どちらか一方を先に呼び出した場合、他方のメソッドは使えなくなる（IllegalStateException がスローされる）。
 * ・これら以外にも、 HTTP ヘッダーやクライアントの情報（IP アドレスなど）も、 HttpServletRequest から取得できる。
 */

public class RequestParameterServlet extends HttpServlet {

	private static final long serialVersionUID = 2058177311205454099L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		String queryParam = req.getParameter("queryParameter");
		String userAgent = req.getHeader("User-Agent");
		System.out.println("queryParam=" + queryParam);
		System.out.println("User-userAgent=" + userAgent);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		// ServletInputStream sis = req.getInputStream();
		// byte[] bytes = new byte[1024]; // バイトの配列を用意する
		// int len = (sis.readLine(bytes, 0, 1024)); // 一行読み出し（URLには改行符号は入らない）
		// String is = "";
		// for (int i = 0; i < len; i++) { // これを文字列に変換（上８ビットはゼロ）
		// is = is + (char) bytes[i];
		// }
		// System.out.println("is=" + is);

		try (BufferedReader br = req.getReader()) {
			br.lines().forEach(System.out::println);
		}

	}
}
