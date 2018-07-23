package com.ij;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class student {
	@Size(min=2,max=10)
	private String name;

	private long phno;
	@Past
	private Date dob;


	private Adress adre;

	
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Adress getAdre() {
		return adre;
	}
	public void setAdre(Adress adre) {
		this.adre = adre;
	}
	
	@Override
	public String toString() {
		return "student [name=" + name + ", phno=" + phno + ", dob=" + dob + ", adre=" + adre + ", ce="  + ", st";
	}
	
	
}
