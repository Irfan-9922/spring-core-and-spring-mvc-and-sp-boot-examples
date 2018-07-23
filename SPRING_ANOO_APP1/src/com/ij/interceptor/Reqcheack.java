/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * NAME:shaikh irfan
 *
 * DATE:12:57:09 pm
 *TIME:18-Jul-2017
 *TAGS:
 */
public class Reqcheack  extends HandlerInterceptorAdapter{
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Calendar c=Calendar.getInstance();
		long l=c.get(Calendar.HOUR_OF_DAY);
		if(l<=12){
			System.out.println("time is not stared");
			//response.getWriter().write("web site shuld not work in this day");
			response.sendRedirect("error.jsp");
		
			return false;
		}
		
			
		return true;
		}
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		response.getWriter().write("this web site can acces only in biteen 9 am to 12 pm");
		
	}
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		response.getWriter().write("this web site can acces only in biteen 9 am to 12 pm");
		
	}
         
		
	}


