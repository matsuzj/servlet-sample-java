package app.sample.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AnnotatedListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("AnnotatedListener.contextInitialized()");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}
}
