/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * NAME:shaikh irfan
 *
 * DATE:6:26:59 pm
 *TIME:09-Aug-2017
 *TAGS:
 */
public class cont extends AbstractController{

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		return new ModelAndView("welcome", "msg","this is welcome page");
	}

}
