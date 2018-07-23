package com.ij.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
@Controller
public class control {

@RequestMapping(value={"welcome","demo"})
	protected ModelAndView handleRequestInternal() throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("HelloPage", "message","welcome irfan");
	}
@RequestMapping(value="hi")
protected ModelAndView handleRequestInternal1(HttpServletRequest req1, HttpServletResponse res1) throws Exception {
	// TODO Auto-generated method stub
	return new ModelAndView("HelloPage", "message","hi");
}
}
