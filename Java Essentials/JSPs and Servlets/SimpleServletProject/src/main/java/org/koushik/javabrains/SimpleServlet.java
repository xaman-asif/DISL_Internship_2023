package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method.");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello in HTML</h3>");
		
		String username = request.getParameter("userName");
		HttpSession session = request.getSession();
		
		ServletContext context = request.getServletContext();
		
		if (username != "" && username != null) {
			session.setAttribute("savedUserName", username);
			context.setAttribute("savedUserName", username);
		}
		
		writer.println("Username: " + username);
		writer.println("Session Parameter: " + (String) session.getAttribute("savedUserName"));
		writer.println("Context Parameter: " + (String) context.getAttribute("savedUserName"));
		
	}

}
