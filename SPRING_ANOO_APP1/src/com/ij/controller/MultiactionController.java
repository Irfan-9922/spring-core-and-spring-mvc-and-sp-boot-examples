/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ij.edito.propertyeditor;

import bean.classes.student;

/**
 * NAME:shaikh irfan
 *
 * DATE:12:23:54 pm
 *TIME:18-Jul-2017
 *TAGS:"this is the simple app to cheak my knowldege
 */
@Controller
public class MultiactionController {
	@RequestMapping(value="welcome")
	public ModelAndView first(){
		ModelAndView s=new ModelAndView("welcome","msg","welcome");
		return s;
	}
	@InitBinder
	public void ge(WebDataBinder we){
		we.registerCustomEditor(String.class,"name" ,new propertyeditor());
	}
	@RequestMapping(value="result",method=RequestMethod.POST)
	public ModelAndView result(@ModelAttribute("res") student ss ){
		
		ModelAndView v=new ModelAndView("result");
		return v;
		
	}

}
