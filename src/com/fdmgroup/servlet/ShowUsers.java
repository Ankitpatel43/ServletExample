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
 * Servlet implementation class ShowUsers
 */
@WebServlet("/display")
public class ShowUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<User> users  = new ArrayList<User>();
		
		UserDao udao = UserDao.getInstance();
		users=udao.findAll();
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>All users</title></head>");
		out.println("<body>"
				+ "<table border='1'>"
				+ "<thread>"
				+ "<th>ID</th>"
				+ "<th>password</th>"
				+ "<th>FirstName</th>"
				+ "<th>LastName</th>"
                +"</thread>"			 
			 
				);
		
		for(User user : users){
			
			out.println("<tr>"
					+ "<td>" +user.getUserid()+"</td>"
					+ "<td>" +user.getPassword()+"</td>"
					+ "<td>" +user.getFirstname()+"</td>"
					+ "<td>" +user.getLastname()+"</td>"
					+ "</tr>");
			
		}
		
		
	 out.println("</table>"
	 		+ "</body>"
	 		+ "</html>");
	 
	//	User u = new User();
		
			
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
