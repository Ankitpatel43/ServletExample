package com.fdmgroup.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayDayServlet
 */
@WebServlet("/showDay")
public class DisplayDayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayDayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		//Date time =cal.getTime();
		int day =cal.get(Calendar.DAY_OF_WEEK);
		
		if(day ==1 )
			day=7;
		else
			day--;
		
		
		request.setAttribute("dayOfTheWeek", day);
		RequestDispatcher rd = request.getRequestDispatcher("showDay.jsp");
		rd.forward(request, response);
		
	}

}
