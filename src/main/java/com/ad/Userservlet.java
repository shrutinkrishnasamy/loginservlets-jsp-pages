package com.ad;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Userservlet
 */
@WebServlet("/Userservlet")
public class Userservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*
		 HttpSession session = request.getSession();
		 String user=(String)session.getAttribute("email");
		*/
		
		Cookie[] c = request.getCookies();
		String user1 = c[0].getValue().toString();
				
				
		out.print("<html><body>");
		out.print("<h1> welcome to user page </h1>");
	    //  out.print("<h1>"+user+"</h1>");
	      out.print("<h1>"+user1+"</h1>");
		out.print("</body></html>");
		
		
	}

}
