/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.student3;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:08:29 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class test {

	
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/cfgs/spring-config3.xml");
		student3 s=(student3) ctx.getBean("demo");
		((AbstractApplicationContext)ctx).registerShutdownHook();
		System.out.println(s);
		
		
	}
}
