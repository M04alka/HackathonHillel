package ua.od.HackathonHillel.configs;

import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class AppConfig {

    public HandlerList getHandlersConfig() {
        HandlerList handlers = new HandlerList();
        handlers.addHandler(getServletHandler());
        return handlers;
    }

    private ServletContextHandler getServletHandler() {
        ServletContextHandler servletsContextHandler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        servletsContextHandler.setContextPath("/");
        //ServletHolder servletHolder = servletsContextHandler.addServlet(ServletContainer.class, "/rest/*");
       // servletsContextHandler.addServlet(servletHolder,"/rest/*");
        return  servletsContextHandler;
    }


}
