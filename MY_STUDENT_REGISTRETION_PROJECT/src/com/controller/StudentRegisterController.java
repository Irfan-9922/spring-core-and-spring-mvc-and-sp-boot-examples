/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.StudentInfo;

/**
 * NAME:shaikh irfan
 *
 * DATE:3:27:24 am
 *TIME:12-Aug-2017
 *TAGS:
 */
@Controller
public class StudentRegisterController {
	@RequestMapping("homepage")
	public String homePage(){
		return "Homepage";
	}

	@ModelAttribute
	public void d(Model m){
		m.addAttribute("msg","welcome to the era of spring");
		
	}
	@RequestMapping("register")
	public String s(){
		return "Registretion_form";
	}
	@RequestMapping("demo")
	public ModelAndView register(@Valid @ModelAttribute("stinfo") StudentInfo info,BindingResult res){
		if(res.hasErrors()){
			ModelAndView m=new ModelAndView("Registretion_form");
			return m;
		}
		ModelAndView m=new ModelAndView("SucessResult");
		m.addObject(info);
		return m;
		
	}

}
