/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:08:07 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class student1 {
	private String name;
	private int phno;
	private adress dd;
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
	public adress getDd() {
		return dd;
	}
	public void setDd(adress dd) {
		this.dd = dd;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", phno=" + phno + ", dd=" + dd + "]";
	}
	
}
