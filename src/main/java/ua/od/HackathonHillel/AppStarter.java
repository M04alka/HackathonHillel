package ua.od.HackathonHillel;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;


public class AppStarter {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);

        ServletContextHandler ctx = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        ctx.setContextPath("/");
        server.setHandler(ctx);
        ServletHolder serHol = ctx.addServlet(ServletContainer.class, "/rest/*");
        server.start();
        server.join();

    }

}
