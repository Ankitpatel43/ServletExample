package com.fdmgroup.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayCountriesServlet
 */
@WebServlet("/showCountries")
public class DisplayCountriesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCountriesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 List<String> countries = new ArrayList<>();
		 
		 countries.add("Canada");
		 countries.add("Japan");
		 countries.add("Brazil");
		 countries.add("Venezuela");
		 countries.add("Costarica");
		 
		 HttpSession session = request.getSession();
		 session.setAttribute("countries", countries);
		 
		 RequestDispatcher rd = request.getRequestDispatcher("showCountries.jsp");
		 rd.forward(request, response);
		
	}

}
