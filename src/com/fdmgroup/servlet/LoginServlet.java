package com.fdmgroup.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/handleLogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserDao udao = UserDao.getInstance();
		
		User user = udao.findByUserName(username);
		
		if(user !=null && user.getPassword().equals(password)){
			
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", user);
			session.setMaxInactiveInterval(300);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/welcome.jsp");
			
			rd.forward(request,response);
		}
		
		else{
			
			request.setAttribute("errorMsg","The username or password is wrong!" );
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/login.jsp");
			rd.forward(request,response);
		}
	}

}
