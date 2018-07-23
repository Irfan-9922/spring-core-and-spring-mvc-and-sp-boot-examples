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
public class student3 {
	private String name;
	private int phno;
	private adress3 dd;
	private adress3 com;
	
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
	public adress3 getDd() {
		return dd;
	}
	public void setDd(adress3 dd) {
		this.dd = dd;
	}
	@Override
	public String toString() {
		return "student3 [name=" + name + ", phno=" + phno + ", dd=" + dd + ", com=" + com + "]";
	}

	public adress3 getCom() {
		return com;
	}
	public void setCom(adress3 com) {
		this.com = com;
	}
	
}
