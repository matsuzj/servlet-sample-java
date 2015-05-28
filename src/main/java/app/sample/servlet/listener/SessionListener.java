package app.sample.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * セッションの作成・終了時に処理を実行する
 * HttpSessionListener を実装したクラスを作成して、 <listener> タグを使って web.xml に登録する。
 * セッションの作成と削除のときに、 sessionCreated() と sessionDestroyed() がそれぞれ呼ばれる。
 * 引数の HttpSessionEvent から、対象の HttpSession オブジェクトを取得できる。
 */
public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.printf("sessionCreated() id=%s%n", event.getSession()
				.getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.printf("sessionDestroyed() id=%s%n", event.getSession()
				.getId());
	}
}
