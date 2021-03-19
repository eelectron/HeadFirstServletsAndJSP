package com.example;
import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent event){
		System.out.println("Context initiaized");
		ServletContext sc = event.getServletContext();
		String breed = sc.getInitParameter("breed");
		Dog d = new Dog(breed);
		sc.setAttribute("dog", d);
	}

	public void contextDestroyed(ServletContextEvent event){
		System.out.println("Context destroyed");
	}
}