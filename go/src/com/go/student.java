/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.go;

import java.util.ArrayList;
import java.util.Date;

/**
 * NAME:shaikh irfan
 *
 * DATE:6:12:33 pm
 *TIME:10-Aug-2017
 *TAGS:
 */
public class student {
private String name;
private String fname;
private int phno;
private Date date;
private ArrayList<String> studentSkills;
private Adress adre;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public Adress getAdre() {
	return adre;
}
public void setAdre(Adress adre) {
	this.adre = adre;
}
public ArrayList<String> getStudentSkills() {
	return studentSkills;
}
public void setStudentSkills(ArrayList<String> studentSkills) {
	this.studentSkills = studentSkills;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "student [name=" + name + ", fname=" + fname + ", phno=" + phno + ", date=" + date + ", studentSkills="
			+ studentSkills + ", adre=" + adre + "]";
}
}
