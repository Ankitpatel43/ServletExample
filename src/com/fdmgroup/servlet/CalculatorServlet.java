package com.fdmgroup.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
// @WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("In the initialization of the servlet phase!");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(getInitParameter("defNum1"));
		int num2 = Integer.parseInt(getInitParameter("defNum2"));

		if (!request.getParameter("num1").equals(""))
			num1 = Integer.parseInt(request.getParameter("num1"));

		if (!request.getParameter("num2").equals(""))
			num1 = Integer.parseInt(request.getParameter("num2"));

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Addition</title></head>");
		out.println("<body><p>Sum of the two numbers <em>" + num1 + "</em> and <em>" + num2 + "</em> is: <em>"
				+ (num1 + num2) + "</em></p></body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
