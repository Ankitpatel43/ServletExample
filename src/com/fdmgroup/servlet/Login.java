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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   User u = new User();
	   
	   UserDao udao = UserDao.getInstance();
	   
	  u = udao.findByUserName(request.getParameter("uname"));
	  
	 
	  String username = request.getParameter("uname");
	  String password = request.getParameter("pass");
	  System.out.println("Hello1");
	  PrintWriter out = response.getWriter();
	  
	  if( udao.findByUserName(request.getParameter("uname"))== null){
		  out.println("<html>");
			out.println("<head><title>not exist</title></head>");
	  }
	  
	  else{
		  if(u.getUsername().equals(username) && u.getPassword().equals(password)){
				 
			    out.println("<html>");
				out.println("<head><title>" +u.getFirstname()+ "</title></head>");
				out.println("<body>"
						+"</body>"+ "</html>"
						);
			  
		  }
	  }
	  
	  
	 
//	   List<User> alluser = new ArrayList<User>();
//	   PrintWriter out = response.getWriter();
//		
//	   
//	   
//	   
//	   for(User unique : alluser){
//		   
//		   if(!unique.getUsername().equals(u)){
//			   out.println("<html>");
//				out.println("<head><title>Not exit</title></head>");
//				out.println("<body>"
//						+ "</body>"+ "</html>"
//						);
//		   }
//		   
//		   else{
//			   if(u.getPassword().equals(unique.getPassword())){
//				   
//				   System.out.println("correct username and password");
//			   }
//		   }
//	   }
	  
	  
		
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
