/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * NAME:shaikh irfan
 *
 * DATE:12:56:51 am
 *TIME:12-Aug-2017
 *TAGS:
 */
@Controller

public class com {

	@RequestMapping("demo")
	public String showpage(){
		return "ww";
	}
	@RequestMapping("result")
	public ModelAndView resultpage(@RequestParam("name") String name,@RequestParam("date") Date d){
		ModelAndView m=new ModelAndView("result1");
	String	result="welcome:"+name+"your registretion date is"+d;
	m.addObject("result",result);
		
		return m;
	}
	@RequestMapping("contactus")
	public ModelAndView showcontact(@ModelAttribute("contact") contact con){
		ModelAndView m=new ModelAndView("contactus");
		contact c=new contact();
		c.setName("irfan");
		c.setPhno(1213121);
		m.addObject("contact",c);
		
		return m;
	}
	

}
