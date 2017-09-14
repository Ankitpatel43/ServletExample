package com.fdmgroup.listener;

import java.util.Vector;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.fdmgroup.model.User;

/**
 * Application Lifecycle Listener implementation class UserCounterListener
 *
 */
@WebListener
public class UserCounterListener implements HttpSessionAttributeListener {

	Vector<User> users = new Vector<>();

	/**
	 * Default constructor.
	 */
	public UserCounterListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub

		HttpSession session = e.getSession();

		if (e.getName().equals("currentUser") && !users.contains(e.getValue())) {

			users.addElement((User) e.getValue());
			session.getServletContext().setAttribute("userCount", users.size());
		}
	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub
		HttpSession session = e.getSession();

		if (e.getName().equals("currentUser") ) {

			users.remove(e.getValue());
			session.getServletContext().setAttribute("userCount", users.size());
		}
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

}
