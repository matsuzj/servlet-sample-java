package app.sample.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * アプリケーション起動・終了時に処理を実行する
 * ServletContextListneer を実装したクラスを作成し、 <listener> タグを使って web.xml に登録する。
 * アプリケーション起動・終了時に、 contextInitialized() と contextDestroyed() がそれぞれ呼ばれる。
 * <contex-param> タグを web.xml に記述することで、 ServletContextEvent から値を取得することができる。
 */
public class WebAppListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		String value = (String) event.getServletContext().getInitParameter(
				"hoge");
		System.out.println("contextInitialized() hoge=" + value);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("contextDestroyed()");
	}
}
