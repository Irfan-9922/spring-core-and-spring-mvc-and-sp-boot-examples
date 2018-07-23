package com.ij.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demo {
	@RequestMapping(value="hello")
	public String demo(){
		return "hello";
		
	}
	@RequestMapping(value="show")
	public ModelAndView ret(@RequestParam("name,add") String name,String add){
		/*ArrayList al=new ArrayList();
		System.out.println(name);
		al.add("irfan");
		al.add("patel");
		al.add("faradapur");*/

Map<String,String> d=new HashMap<>();
d.put("name", name);
d.put("add", add);
ArrayList ll=new ArrayList();
  ll.add(name);
  ll.add(add);
		
		
		return new ModelAndView("data", "d", ll);
		
	}

}
