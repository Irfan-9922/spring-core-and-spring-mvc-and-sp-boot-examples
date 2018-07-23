/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * NAME:shaikh irfan
 *
 * DATE:9:59:35 am
 *TIME:31-Jul-2017
 *TAGS:
 */
@Controller
public class javaconfig {
	@RequestMapping("i")
	public String demo(){
		return "welcome";
	}

}
