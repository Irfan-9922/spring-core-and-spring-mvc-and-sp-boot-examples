/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import java.util.Iterator;

import List.CustomArrayList;

/**
 * NAME:shaikh irfan
 *
 * DATE:4:17:08 pm
 *TIME:06-Aug-2017
 *TAGS:
 */
public class studentDetails {
	/**
	 * @param no
	 * @param phno
	 * @param name
	 * @param addrs
	 */
	public studentDetails(int no, int phno, String name, String addrs) {
		super();
		this.no = no;
		this.phno = phno;
		this.name = name;
		this.addrs = addrs;
	}
	private int no;
	private int phno;
	private String name;
	private String addrs;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "studentDetails [no=" + no + ", phno=" + phno + ", name=" + name + ", addrs=" + addrs + "]";
	}
}
