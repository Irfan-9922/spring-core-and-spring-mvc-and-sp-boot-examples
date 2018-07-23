/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.beans;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

/**
 * NAME:shaikh irfan
 *
 * DATE:3:20:15 am
 *TIME:12-Aug-2017
 *TAGS:
 */
public class ContactDetail {
	@Size(min=2,message="please enter proper mobile number")
	private long mobleno;
	private long landlineno;
	
	private String email;
	private Date d;  
	public long getMobleno() {
		return mobleno;
	}
	public void setMobleno(long mobleno) {
		this.mobleno = mobleno;
	}
	public long getLandlineno() {
		return landlineno;
	}
	public void setLandlineno(long landlineno) {
		this.landlineno = landlineno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	

}
