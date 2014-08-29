package com.pricl.test.core.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.pricl.test.core.Subject;

public class SessionAttributesHolder {

	private static String SESSION_KEY = "sessionkey";

	/**
	 * 
	 * @param request
	 * @param subject
	 */
	public static void setSubject(HttpServletRequest request, Subject subject) {
		HttpSession session = request.getSession();
		session.setAttribute(SESSION_KEY, subject);
	}

	/**
	 * 
	 * @param request
	 * @return
	 */
	public static Subject getSubject(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object object = session.getAttribute(SESSION_KEY);
		if (object == null) {
			return null;
		}
		return (Subject) object;
	}
}
