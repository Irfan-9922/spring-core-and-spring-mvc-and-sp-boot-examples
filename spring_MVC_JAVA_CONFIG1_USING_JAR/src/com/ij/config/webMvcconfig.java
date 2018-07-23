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
import org.springframework.web.servlet.view.JstlView;

/**
 * NAME:shaikh irfan
 *
 * DATE:11:16:08 am
 *TIME:19-Jul-2017
 *TAGS:
 */
/*@EnableWebMvc
@Configuration
@ComponentScan({"com.ij"})
public class webMvcconfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public InternalResourceViewResolver viewR(){
    	InternalResourceViewResolver view = new InternalResourceViewResolver();
      // .viewResolve viewResolver.setViewClass(JstlView.class);
    	view.setPrefix("/WEB-INF/views/");
    	view.setSuffix(".jsp");
        return view;
    }
}*/

@EnableWebMvc
@Configuration
@ComponentScan({"com.ij"})
//@ComponentScan("{com.ij}")
public class webMvcconfig extends WebMvcConfigurerAdapter{
	@Bean
	public InternalResourceViewResolver res(){
		InternalResourceViewResolver re=new InternalResourceViewResolver();
		re.setPrefix("/WEB-INF/views/");
		re.setSuffix(".jsp");
		return re;
	}
}