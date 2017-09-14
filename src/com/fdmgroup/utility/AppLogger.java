package com.fdmgroup.utility;

import org.apache.log4j.Logger;

public class AppLogger {

	private static Logger sysLogger = null;
	private static Logger userLogger = null;
	private static AppLogger appLogger = null;
	private AppLogger() {
		super();
		sysLogger = Logger.getLogger("sysLogger");
		userLogger = Logger.getLogger("userLogger");
		// TODO Auto-generated constructor stub
	}

	

	public static Logger getSysLogger() {

		if (sysLogger == null)

			appLogger = new AppLogger();

		return sysLogger;
	}

	public static Logger getUserLogger() {

		if (userLogger == null)

			appLogger = new AppLogger();

		return userLogger;
	}
}
