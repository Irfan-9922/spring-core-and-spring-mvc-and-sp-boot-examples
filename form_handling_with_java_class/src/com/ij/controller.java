package com.ij;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomCollectionEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public ModelAndView demo(student ss,BindingResult res){
		
	
		ModelAndView f=new ModelAndView("demo","command",new student());
		return f;
		
		
		
	}
	/*@InitBinder
	public void chang(WebDataBinder web){
		SimpleDateFormat sdf=new SimpleDateFormat("yy**mm**dd");
		web.registerCustomEditor(Date.class,"dob",new CustomDateEditor(sdf, false));
		web.registerCustomEditor(String.class,"name",new studentEditor());
		
		
	}*/
	@ModelAttribute
	public void addcommanobject(Model m){
		m.addAttribute("h","welcome to gontur college");
	}
	@RequestMapping(value="/show",method=RequestMethod.POST)
	public ModelAndView ret(@Valid @ModelAttribute ("ss")student sss,BindingResult res){
		
		if(res.hasErrors()){
			ModelAndView v=new ModelAndView("demo");
		return v;
		}
		ModelAndView v=new ModelAndView("form");
		//System.out.println("your vale is++++:"+ss.getName()+""+ss.getDob()+""+ss.getAdre().getCountery()+"");


		return v;
		}
	

}
