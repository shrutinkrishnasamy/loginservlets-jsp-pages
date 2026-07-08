package com.kce;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email =request.getParameter("email");
		String password=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(email.equalsIgnoreCase("admin@kce")) {
			// RequestDispatcher rd = request.getRequestDispatcher("Adminservlet");
			// rd.forward(request, response);
			
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
		}
		else  {
			//session----------
			/* HttpSession session = request.getSession();
			String userdata[] = email.split("@");
			session.setAttribute("email", userdata[0]);
			*/
			
			String userdata[] = email.split("@");
			Cookie c = new Cookie("email", userdata[0]);
			response.addCookie(c);
			
			// RequestDispatcher rd = request.getRequestDispatcher("Userservlet");
			// rd.forward(request, response);
			
			RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
			rd.forward(request, response);
		}
		
	}

}
