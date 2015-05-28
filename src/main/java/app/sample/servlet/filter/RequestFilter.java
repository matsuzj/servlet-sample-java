package app.sample.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * リクエストの前後で処理を挟む
 * Filter を実装したクラスを作成して、 <filter> タグで web.xml に登録する。
 * <filter-mapping> タグで、フィルターを適用する URL パターンをマッピングする。
 * URL パターンにマッチするリクエストがあると、 doFilter() メソッドが実行される。
 * FilterChain#doFilter() メソッドで、次の処理へ進むことができる（呼ばなくても良い）。
 */

/*
 * リクエストの前後で処理を挟む
 * Filter を実装したクラスを作成して、 <filter> タグで web.xml に登録する。
 * <filter-mapping> タグで、フィルターを適用する URL パターンをマッピングする。
 * URL パターンにマッチするリクエストがあると、 doFilter() メソッドが実行される。
 * FilterChain#doFilter() メソッドで、次の処理へ進むことができる（呼ばなくても良い）。
 */

public class RequestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("RequestFilter before");
		chain.doFilter(request, response);
		System.out.println("RequestFilter after");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}
}
