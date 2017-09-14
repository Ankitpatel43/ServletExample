package com.fdmgroup.filter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fdmgroup.utility.AppLogger;

/**
 * Servlet Filter implementation class LogginFilter
 */
@WebFilter("/*")
public class LoggingFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoggingFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		AppLogger.getSysLogger().info("Getting out of logging filter!!");
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		HttpServletRequest httpReq = (HttpServletRequest) request;
		String ip = httpReq.getRemoteAddr();
		AppLogger.getSysLogger().info(ip + "-------#####" + LocalDate.now() + "------######" + LocalTime.now()
				+ "----####" + httpReq.getServletPath());
		
		

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub

		AppLogger.getSysLogger().info("System logging statred !");
	}

}
