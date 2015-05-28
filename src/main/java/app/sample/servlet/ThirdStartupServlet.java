package app.sample.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/*
 * サーバー起動時に Servlet の初期化処理を実行する
 * ・web.xml の <servlet> タグ内で、 <load-on-startup> タグを設定することで、サーバー起動時に Servlet の初期化処理を実行させることができる。
 * ・このとき、 <load-on-startup> タグで指定した順序で Servlet の初期化処理が実行される。
 */

public class ThirdStartupServlet extends HttpServlet {

	private static final long serialVersionUID = 8197766105989087351L;

	@Override
	public void init() throws ServletException {
		System.out.println("ThirdStartupServlet.init()");
	}
}
