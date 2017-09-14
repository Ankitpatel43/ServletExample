package com.fdmgroup.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class ShowOnlyUser
 */
@WebServlet("/ShowOnlyUser")
public class ShowOnlyUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowOnlyUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        
		
		User user1  = new User();
		
		UserDao udao = UserDao.getInstance();
		
		
		
		user1=udao.findByUserName(request.getParameter("userName"));
		
		
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>All users</title></head>");
		out.println("<body>"
				+ user1 + "</body>"+ "</html>"
				);
		
			
		
			 		
			 		
		
		
		
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
