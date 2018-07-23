/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.go;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.remoting.caucho.SimpleHessianServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	@InitBinder
	public void bind(WebDataBinder bind){
		SimpleDateFormat d=new SimpleDateFormat("yy**mm**dd");
		bind.registerCustomEditor(Date.class, "date",new CustomDateEditor(d, false));
		bind.registerCustomEditor(Date.class, "date",new stname());
		System.out.println(bind.getDisallowedFields());
	}
	
	@ModelAttribute
	public void comman(Model m){
		m.addAttribute("he","welcome to java wprld");
	}
	@RequestMapping(value="form2",method=RequestMethod.POST)
	public ModelAndView g(@ModelAttribute("st") student st ,BindingResult res){
		if(res.hasErrors()){
			ModelAndView f=new ModelAndView("first");
			f.addObject(st);
			return f;
		}
		ModelAndView m=new ModelAndView("second");
		//m.addObject("msg","welcome"+name);
		return m;
	}

}
