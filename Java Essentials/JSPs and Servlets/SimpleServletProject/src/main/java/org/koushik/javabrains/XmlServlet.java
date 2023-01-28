package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("Hello User: " + username + " Name: " + fullName);
		
		String prof = request.getParameter("prof");
		out.println("Your profession is: " + prof);
		
		String[] locations = request.getParameterValues("location");
		out.println("Your are at: " + locations.length + " place(s)");
		
		for (int i=0; i < locations.length; i++) {
			out.println(locations[i]);
		}
	}
	
}
