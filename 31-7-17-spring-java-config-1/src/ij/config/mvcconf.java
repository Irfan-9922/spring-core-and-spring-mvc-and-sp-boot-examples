/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package ij.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * NAME:shaikh irfan
 *
 * DATE:10:03:43 am
 *TIME:31-Jul-2017
 *TAGS:
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.ij"})
public class mvcconf extends WebMvcConfigurerAdapter{
  @Bean
	public InternalResourceViewResolver re(){
		InternalResourceViewResolver r=new InternalResourceViewResolver();
		r.setPrefix("/WEB-INF/page/");
		r.setSuffix(".jsp");
		return r;
	}
}

/*@EnableWebMvc
@Configuration
@ComponentScan({"com.ij"})
//@ComponentScan("{com.ij}")
public class mvcconf extends WebMvcConfigurerAdapter{
	@Bean
	public InternalResourceViewResolver res(){
		InternalResourceViewResolver re=new InternalResourceViewResolver();
		re.setPrefix("/WEB-INF/page/");
		re.setSuffix(".jsp");
		return re;
	}
}*/