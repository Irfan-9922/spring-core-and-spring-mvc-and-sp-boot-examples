/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * NAME:shaikh irfan
 *
 * DATE:11:43:25 am
 *TIME:31-Jul-2017
 *TAGS:
 */
@Controller
public class controller1 {
	@RequestMapping(value="/frist.htm" ,method=RequestMethod.GET)
	public String ere(){
		return "frist";
		
	}
	@RequestMapping(value="/sec.htm", method=RequestMethod.POST)
	public ModelAndView h(){
		ModelAndView m=new ModelAndView("demo");
	//	m.addObject("msg","welcome to goa");
		return m;
		
	}

}
