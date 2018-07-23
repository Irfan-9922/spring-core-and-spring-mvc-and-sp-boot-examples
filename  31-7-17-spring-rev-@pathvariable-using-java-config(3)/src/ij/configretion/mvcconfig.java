/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package ij.configretion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * NAME:shaikh irfan
 *
 * DATE:11:25:38 am
 *TIME:31-Jul-2017
 *TAGS:
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.ij.controller"})
public class mvcconfig extends WebMvcConfigurerAdapter{
@Bean
public InternalResourceViewResolver r(){
	InternalResourceViewResolver rr=new InternalResourceViewResolver();
	rr.setPrefix("/WEB-INF/pages/");
	rr.setSuffix(".jsp");
	return rr;
	
}
}
