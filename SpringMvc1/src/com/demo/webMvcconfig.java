/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * NAME:shaikh irfan
 *
 * DATE:1:52:43 pm
 *TIME:19-Jul-2017
 *TAGS:
 */
@EnableWebMvc
@Configuration

@ComponentScan({"com"})
public class webMvcconfig extends WebMvcConfigurerAdapter{
	@Bean
	public InternalResourceViewResolver res(){
		InternalResourceViewResolver re=new InternalResourceViewResolver();
		re.setPrefix("/WEB-INF/pages/");
		re.setSuffix(".jsp");
		return re;
	}
	

}
