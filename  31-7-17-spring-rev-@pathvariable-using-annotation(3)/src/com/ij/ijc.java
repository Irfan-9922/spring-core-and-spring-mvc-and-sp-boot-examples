/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * NAME:shaikh irfan
 *
 * DATE:10:43:48 am
 *TIME:31-Jul-2017
 *TAGS:
 */
@Controller
public class ijc {
	@RequestMapping("/i")
	public ModelAndView m( String name){

ModelAndView m1=new ModelAndView("welcome1");
m1.addObject("msg","hello world");
		
		return m1;
		
	}

}
