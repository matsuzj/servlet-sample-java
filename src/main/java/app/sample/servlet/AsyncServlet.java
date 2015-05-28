package app.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 下記エラーにて動作確認できていない
 * 非同期処理を実装する場合は、 Servlet の定義に <asyncasync-supported> を追加して true を指定する。
 * もし Servlet の処理の前に Filter が処理を挟む場合は、その Filter にも async-supported を設定する必要がある。
 * request.startAsync() で AsyncContext のインスタンスを取得する。
 * AsyncContext#start(Runnable) で、非同期処理を開始する。
 * 非同期処理中に HttpServletRequest や HttpServletResponse を取得したい場合は、 AsyncContext から取得する。
 * 非同期処理が完了したら、 AsyncContext#complete() メソッドを実行して非同期処理が完了したことをコンテナに知らせる（知らせないとタイムアウトまで待つことになる）。
 */

public class AsyncServlet extends HttpServlet {

	private static final long serialVersionUID = -1070729601036705179L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		System.out.println("AsyncServlet start.");

		AsyncContext ctx = req.startAsync();

		ctx.addListener(new AsyncListenerImpl());

		ctx.start(() -> {
			try (PrintWriter pw = ctx.getResponse().getWriter()) {
				Thread.sleep(5000);
				System.out.println("async process.");
				pw.println("<h1>Async Process</h1>");
			} catch (IOException | InterruptedException ex) {
				ex.printStackTrace();
			} finally {
				ctx.complete();
			}
		});

		resp.getWriter().println("<h1>AsyncServlet</h1>");

		System.out.println("AsyncServlet end.");
	}

	private static class AsyncListenerImpl implements AsyncListener {

		@Override
		public void onStartAsync(AsyncEvent event) throws IOException {
			System.out.println("onStartAsync");
		}

		@Override
		public void onComplete(AsyncEvent event) throws IOException {
			System.out.println("onComplete");
		}

		@Override
		public void onTimeout(AsyncEvent event) throws IOException {
			System.out.println("onTimeout");
		}

		@Override
		public void onError(AsyncEvent event) throws IOException {
			System.out.println("onError");
		}
	}
}
