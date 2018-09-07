package com.ibs.clearing.org.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserLoginInterceptor implements HandlerInterceptor {

	private static final long serialVersionUID = -1550787237696376774L;

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception)
			throws Exception {				
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView modelAndView)
			throws Exception {		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		
		String requestUrl = request.getRequestURI();
		if (requestUrl.endsWith("userLogin.html")) {
			return true;
		}
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/Login/userLogin.html?login?=123");	
		return false;
	}
}
