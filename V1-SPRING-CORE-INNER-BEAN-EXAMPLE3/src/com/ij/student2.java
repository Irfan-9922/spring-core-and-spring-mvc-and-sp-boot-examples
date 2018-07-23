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
public class student2 {
	private String name;
	private int phno;
	private adress2 add1;
	private adress2 add2;
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
	
	@Override
	public String toString() {
		return "student1 [name=" + name + ", phno=" + phno + ", add1=" + add1 + ", add2=" + add2 + "]";
	}
	public adress2 getAdd1() {
		return add1;
	}
	public void setAdd1(adress2 add1) {
		this.add1 = add1;
	}
	public adress2 getAdd2() {
		return add2;
	}
	public void setAdd2(adress2 add2) {
		this.add2 = add2;
	}
	
}
