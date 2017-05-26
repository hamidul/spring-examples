package com.proliferay.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * @author hamidul.islam
 * 
 * 
 *         Historically, servlets like DispatcherServlet have been configured in
 *         a web.xml file with Servlet Container 3.0 we can configure Dispatcher
 *         Servlet in Java class
 * 
 *         This class configure the Dispatcher Servlet
 * 
 *         In a Servlet 3.0 environment, the container (for example tomcat)
 *         looks for any classes in the classpath that implement the
 *         javax.servlet.ServletContainerInitializer interface; if any are
 *         found, they’re used to configure the servlet container.
 * 
 *         Spring has class SpringServletContainerInitializer which implements
 *         javax.servlet.ServletContainerInitializer This class (i.e,
 *         SpringServletContainerInitializer) looks for any class that
 *         implements WebApplicationInitializer and delegates to them for
 *         configuration. Spring provides
 *         AbstractAnnotationConfigDispatcherServletInitializer class which
 *         implements WebApplicationInitializer
 * 
 *         Therefore HelloWebAppInitializer class will be automatically
 *         discovered when its deployed in Servlet container 3
 */
public class HelloWebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {
	
	/**
	 * Under the covers, AbstractAnnotationConfigDispatcherServletInitializer creates 
	 * both a DispatcherServlet and a ContextLoaderListener. The @Configuration 
	 * classes returned from getServletConfigClasses() will define beans for DispatcherServlet’s
	 *  application context. Meanwhile, the @Configuration class’s returned getRootConfigClasses() 
	 *  will be used to configure the application context created by ContextLoaderListener.
	 */
	
	
	/**
	 * In Spring web applications, there’s often another application context. 
	 * This other application context is created by ContextLoaderListener
	 * 
	 * ContextLoaderListener is expected to load the other beans in your application. These beans are typically the 
	 * middle-tier and data-tier components that drive the back end of the application.
	 * 
	 * 
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	/**
	 * When DispatcherServlet starts up, it creates a Spring application context
	 * and starts loading it with beans declared in the configuration files or
	 * classes that it’s given. With the getServletConfigClasses() method. 
	 * DispatcherServlet is expected to load beans containing web components 
	 * such as controllers, view resolvers, and handler mappings
	 * 
	 * Here beans will be loaded from WebConfig class by DispatcherServlet 
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}
	
	/**
	 * getServletMappings(), identifies one or more paths that 
	 * DispatcherServlet will be mapped to. In this case, it’s mapped to /, indicating that it 
	 * will be the application’s default servlet. It will handle all requests coming into the application.
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
