/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * NAME:shaikh irfan
 *
 * DATE:1:29:06 pm
 *TIME:10-Aug-2017
 *TAGS:
 */
/*@Controller
public class dhoom {

	@RequestMapping(value="/demo.htm", method=RequestMethod.GET)
	public String formpage(){
		return "welcome";
	}
	@RequestMapping(value="/click1.htm")
	public ModelAndView d(@RequestParam("name") String name,@RequestParam("add") String add){
		ModelAndView m=new ModelAndView("sucess");
		m.addObject("msg","detail you have submitted:::"+name+"and you r address:"+add);
		return m;
		
	}
}
*/
@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("welcome");

		return model;
	}
	
	//@RequestMapping("/submitAdmissionForm.html")
	//public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name, @RequestParam("studentHobby") String hobby) {

//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);

//		return model;
//	}

	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {

		String name = reqPar.get("studentName");
		String hobby = reqPar.get("hobby");

		ModelAndView model = new ModelAndView("success");
		model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);

		return model;
	}
}