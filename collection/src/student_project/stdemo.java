/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package student_project;

import java.util.TreeSet;

/**
 * NAME:shaikh irfan
 *
 * DATE:1:22:22 pm
 *TIME:07-Aug-2017
 *TAGS:
 */
public class stdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubstudent_using_Compariabl d=new student_using_Compariabl("irfan", "jalil", "latur", 12, 9922);
		student_using_Compariabl d1=new student_using_Compariabl("irfan", "jalil", "hyd", 12, 9922);
		student_using_Compariabl d2=new student_using_Compariabl("nisar", "jalil", "pune", 90, 8763);
		student_using_Compariabl d3=new student_using_Compariabl("rahul", "mahdu", "latur", 983, 1263);
		//TreeSet t=new TreeSet<>();
		TreeSet t=new TreeSet<>();
		t.add(d1);
		t.add(d2);
		t.add(d3);
		System.out.println("using compariable");
		System.out.println(t);
		
		System.out.println("============================");
		TreeSet t1=new TreeSet<>(new mycompretor1());
		t1.add(d1);
		t1.add(d2);
		t1.add(d3);
		System.out.println(t1);
		

	}

}
