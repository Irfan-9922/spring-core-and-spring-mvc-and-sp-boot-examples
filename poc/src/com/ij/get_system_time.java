/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import java.util.Calendar;

/**
 * NAME:shaikh irfan
 *
 * DATE:1:02:31 pm
 *TIME:18-Jul-2017
 *TAGS:
 */
public class get_system_time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t=System.currentTimeMillis();
		System.out.println(t);
	Calendar c=Calendar.getInstance();
	long l=c.get(Calendar.HOUR_OF_DAY);
	if(l<=12){
		System.out.println("good morning");
	}
	else{
		System.out.println("god night");
	}
		

	}

}
