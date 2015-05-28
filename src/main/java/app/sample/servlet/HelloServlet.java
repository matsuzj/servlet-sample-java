package app.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * web.xml を使った基本的な方法で Servlet を実装する。
 * ・Servlet は、 HttpServlet クラスを継承したクラスを作成する。
 * ・リクエストのあった URL と実行する Servlet のマッピングは、 web.xml に記述する。
 *   ・<servlet> タグを使って、 Servlet クラスを宣言する。
 *   ・<servlet-mapping> タグを使って、 Servlet と URL をマッピングする。
 * ・HttpServlet クラスが持つ do***() メソッドをオーバーライドすると、 Servlet の URL に送られてきた HTTP リクエストを受け取ることができる。
 *   ・*** の部分は、 HTTP で定義されているメソッド（GET, POST, PUT, DELETE など）が対応している。
 *   ・オーバーライドしていない HTTP メソッドでリクエストが飛んでくると、 HttpServlet のデフォルトの実装が 405 - Method Not Allowed を返すようになっている。
 */

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = -1345429167607578119L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter writer = response.getWriter()) {
			writer.println("<h1>Hello Servlet!!</h1>");
		}
	}
}
