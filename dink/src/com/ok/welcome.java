/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ok;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * NAME:shaikh irfan
 *
 * DATE:4:32:52 pm
 *TIME:10-Aug-2017
 *TAGS:
 */
@Controller
public class welcome {
	@RequestMapping("one")
	public String dis(){
		return "first";
	}
	@RequestMapping(value="form2",method=RequestMethod.POST)
	public ModelAndView g(@RequestParam("name") String name,@RequestParam("fname") String fname,@RequestParam("phno")
	String phno){
		ModelAndView m=new ModelAndView("second");
		m.addObject("msg","welcome"+name);
		return m;
	}

}
