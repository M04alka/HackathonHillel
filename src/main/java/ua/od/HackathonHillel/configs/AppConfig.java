package ua.od.HackathonHillel.configs;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.servlets.CrossOriginFilter;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

public class AppConfig {

   /*   public HandlerList getHandlersConfig() {
        HandlerList handlers = new HandlerList();
        handlers.addHandler(getServletHandler());
        return handlers;
    }


    private Handler getServletHandler() {
        ServletContextHandler servletsHandler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        servletsHandler.setContextPath("/");
        servletsHandler.addServlet(new ServletHolder(new ServletContainer(getResourceConfig())), "/rest/*");
        FilterHolder holder = new FilterHolder(new CrossOriginFilter());
        holder.setInitParameter(CrossOriginFilter.ALLOWED_METHODS_PARAM, "GET,POST,HEAD,OPTIONS");
        servletsHandler.addFilter(holder, "/rest/*", EnumSet.of(DispatcherType.REQUEST));
        return servletsHandler;
    }


    private ResourceConfig getResourceConfig() {
        return new ResourceConfig() {{
            packages("ua/od/game");
            register(new AbstractBinder() {
                protected void configure () {

                }
            });
        }};
    }
  private ServletContextHandler getServletHandler() {
        ServletContextHandler servletsContextHandler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        servletsContextHandler.setContextPath("/");
        ServletHolder servletHolder = servletsContextHandler.addServlet(ServletContainer.class, "/rest/*");
        servletsContextHandler.addServlet(servletHolder,"/rest/*");
        return  servletsContextHandler;
    }
*/

}
