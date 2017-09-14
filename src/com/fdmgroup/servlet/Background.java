package com.fdmgroup.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Background
 */
@WebServlet("/backcolor")
public class Background extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Background() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
          String name = request.getParameter("name");
		String Background = request.getParameter("bgcolor");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(Background !=null)
		{		
			Cookie cookie  = new Cookie( Background,name);
			response.addCookie(cookie);
		RequestDispatcher rd = request.getRequestDispatcher("color.jsp");
		rd.forward(request, response);
		}
	}

}
