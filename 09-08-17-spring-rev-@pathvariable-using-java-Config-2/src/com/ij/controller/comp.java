/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * NAME:shaikh irfan
 *
 * DATE:6:26:59 pm
 *TIME:09-Aug-2017
 *TAGS:
 */
@Controller
public class comp {

	@RequestMapping("/demo/{name}")
public ModelAndView r(@PathVariable("name") String name){
		ModelAndView m=new ModelAndView("welcome1");
		m.addObject("msg","hello"+name);
	return m;
	
}
}
