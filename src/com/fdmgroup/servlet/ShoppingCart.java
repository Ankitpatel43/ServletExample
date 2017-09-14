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
 * Servlet implementation class ShoppingCart
 */
@WebServlet("/cart")
public class ShoppingCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String quantity = request.getParameter("quantity");
		String addCookie = request.getParameter("addCookie");
		String listCookie = request.getParameter("listCookie");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(addCookie != null){
			Cookie cookie  = new Cookie(name, quantity);
			response.addCookie(cookie);
			RequestDispatcher rd = request.getRequestDispatcher("shoppingCart.jsp");
			rd.forward(request, response);
			
		}
		
		
		if(listCookie !=null){
			Cookie[] cookies = request.getCookies();
			
			for (Cookie cookie : cookies) {
				
				out.print("<B>"+cookie.getName() + "----" + cookie.getValue() + "</B></BR>");
			}
			
			out.close();
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
