/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.student6;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:08:29 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class test {

	
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/cfgs/spring-config6.xml");
		student6 s=(student6) ctx.getBean("demo");
		System.out.println(s);
		
		
		student6 s1=(student6) ctx.getBean("demo");
		System.out.println(s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		
		
	}
}
