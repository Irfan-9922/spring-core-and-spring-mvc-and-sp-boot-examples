package com.ij;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class challeng {
	@RequestMapping(value="/d", method=RequestMethod.GET)
	public String name(){
		
		return "adm";
	}
	/*@RequestMapping(value="/admin", method = RequestMethod.POST)
	public ModelAndView demo(@RequestParam Map<String,String> var) {
         String name=var.get("name");
         String fname=var.get("fname");
         String phno=var.get("phno");
		ModelAndView model = new ModelAndView("sucess");
         model.addObject("msg","hello"+var);
		return model;
	}*/
	@RequestMapping(value="/admin", method = RequestMethod.POST)
	public ModelAndView demo(@RequestParam(value="name", defaultValue="dhsiiing")String name ,@RequestParam("fname")String fname,@RequestParam("phno") String phno) {
        
		ModelAndView model = new ModelAndView("sucess");
         model.addObject("msg","hello"+name+"your informination"+phno+"wiss be saved");
		return model;
	}

}
