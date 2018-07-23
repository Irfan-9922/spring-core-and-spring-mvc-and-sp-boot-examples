/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.nt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * NAME:shaikh irfan
 *
 * DATE:1:51:52 pm
 *TIME:19-Jul-2017
 *TAGS:
 */
@Controller
public class welcome {

	 @RequestMapping(value="string",method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("msg", "Spring MVC Java Config Example");
        return "index";
	}
}
