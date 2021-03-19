package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTest extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test context attributes set by listener");
		out.println("<br>");
		Dog dog = (Dog)getServletContext().getAttribute("dog");
		out.println("Dog's breed : " + dog);
	}
}