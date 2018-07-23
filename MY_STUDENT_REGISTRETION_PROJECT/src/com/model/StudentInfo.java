/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import com.beans.ContactDetail;
import com.beans.StudentName;
import com.beans.stadd;

/**
 * NAME:shaikh irfan
 *
 * DATE:3:18:14 am
 *TIME:12-Aug-2017
 *TAGS:
 */
//javax.el.PropertyNotFoundException: Property 'StudentName' not found on type com.model.StudentInfo
public class StudentInfo {
	private ContactDetail ctd;
	private stadd stadr;
	private StudentName st;
	public ContactDetail getCtd() {
		return ctd;
	}
	public void setCtd(ContactDetail ctd) {
		this.ctd = ctd;
	}
	
	public StudentName getSt() {
		return st;
	}
	public void setSt(StudentName st) {
		this.st = st;
	}
	public stadd getStadr() {
		return stadr;
	}
	public void setStadr(stadd stadr) {
		this.stadr = stadr;
	}
	
	
	
}
