/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import java.util.List;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:08:07 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class student8 {
	/**
	 * @param name
	 * @param phno
	 * @param dd
	 */
	private String name;
	private int phno;
	private List<String> course;
	private adress8 dd;
	private adress8 dd1;
	
	
	
	@Override
	public String toString() {
		return "student8 [name=" + name + ", phno=" + phno + ", course=" + course + ", dd=" + dd + ", dd1=" + dd1 + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPhno() {
		return phno;
	}



	public void setPhno(int phno) {
		this.phno = phno;
	}



	public adress8 getDd() {
		return dd;
	}



	public void setDd(adress8 dd) {
		this.dd = dd;
	}



	public adress8 getDd1() {
		return dd1;
	}



	public void setDd1(adress8 dd1) {
		this.dd1 = dd1;
	}



	public List<String> getCourse() {
		return course;
	}



	public void setCourse(List<String> course) {
		this.course = course;
	}
	
}
