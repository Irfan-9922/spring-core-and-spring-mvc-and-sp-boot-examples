/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * NAME:shaikh irfan
 *
 * DATE:11:02:17 am
 *TIME:19-Jul-2017
 *TAGS:
 */
@Controller
public class welcome {

	 @RequestMapping(value="s",method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("msg", "Spring MVC Java Config Example");
        return "index";
	}
}
