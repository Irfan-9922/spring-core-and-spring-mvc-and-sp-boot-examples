/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.adress5;
import com.ij.student5;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:08:29 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class test {

	
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/cfgs/spring-config5.xml");
		adress5 g=(adress5) ctx.getBean("dd");
		System.out.println(g);
		
		
	}
}
