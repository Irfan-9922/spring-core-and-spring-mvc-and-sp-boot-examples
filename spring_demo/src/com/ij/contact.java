/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

/**
 * NAME:shaikh irfan
 *
 * DATE:2:59:54 am
 *TIME:12-Aug-2017
 *TAGS:
 */
public class contact {
	private String name;
	private long phno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "contact [name=" + name + ", phno=" + phno + "]";
	}
	/**
	 * @param name
	 * @param phno
	 */
	public contact(){
		
	}

}
