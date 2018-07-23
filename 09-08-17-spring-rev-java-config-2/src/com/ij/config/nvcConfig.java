/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * NAME:shaikh irfan
 *
 * DATE:7:04:42 pm
 *TIME:09-Aug-2017
 *TAGS:
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.ij.controller"})
public class nvcConfig extends WebMvcConfigurerAdapter{
 
	@Bean
	public InternalResourceViewResolver re(){
		InternalResourceViewResolver r=new InternalResourceViewResolver();
		r.setPrefix("/WEB-INF/pages/");
		r.setSuffix(".jsp");
		return r;
	}
}
