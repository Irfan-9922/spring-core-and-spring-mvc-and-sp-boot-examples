package com.ij;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Adress {
	private parent p;
	@NotNull
	private String countery;
	 @Size(min=2)
	private String state;
	 @Size(min=2,max=4)
	private int zipcode;
	public String getCountery() {
		return countery;
	}
	public void setCountery(String countery) {
		this.countery = countery;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Adress [countery=" + countery + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	public parent getP() {
		return p;
	}
	public void setP(parent p) {
		this.p = p;
	}

}
