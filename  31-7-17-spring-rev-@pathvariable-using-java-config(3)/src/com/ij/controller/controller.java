/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * NAME:shaikh irfan
 *
 * DATE:11:21:58 am
 *TIME:31-Jul-2017
 *TAGS:
 */
@Controller
public class controller {
	@RequestMapping("/r/{name}")
	public ModelAndView m(@PathVariable("name") String name){
		
		ModelAndView m1=new ModelAndView("hello");
		m1.addObject("msg","welcome"+name);
		return m1;
	}

}
