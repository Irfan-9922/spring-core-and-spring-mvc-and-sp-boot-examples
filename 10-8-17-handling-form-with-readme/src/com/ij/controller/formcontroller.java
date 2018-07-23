/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * NAME:shaikh irfan
 *
 * DATE:2:00:04 pm
 *TIME:10-Aug-2017
 *TAGS:
 */
@Controller
public class formcontroller {
	@RequestMapping("/form1")
	public String show(){
		return "form1";
	}
	@RequestMapping(value="/form2",method=RequestMethod.POST)
	public ModelAndView r(@RequestParam("name") String name,@RequestParam("fname") String fname,@RequestParam("phno") String phno){
ModelAndView m=new ModelAndView("form2");
m.addObject("msg","welcome"+name);
		return m;
	}
	@RequestMapping(value="/form3",method=RequestMethod.POST)
	public ModelAndView f(@RequestParam("email") String email,
			@RequestParam("password") String password)
	{
		ModelAndView m=new ModelAndView("form3");
		m.addObject("msg","your password is "+password);
		return m;
		
	}
}
