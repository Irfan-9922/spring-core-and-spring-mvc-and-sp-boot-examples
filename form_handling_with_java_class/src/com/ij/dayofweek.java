package com.ij;

import java.util.Calendar;
import java.util.spi.CalendarNameProvider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class dayofweek extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		int dayof=cal.get(cal.DAY_OF_WEEK);
		if(dayof==1){
			response.getWriter().write("web site shuld not work in this day");
		
		return false;
	}
		return true;
		}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
System.out.println("enterd it in post handle()");

	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enterd it in after complition()");
	}

}
