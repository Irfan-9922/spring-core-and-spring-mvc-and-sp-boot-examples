/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import List.CustomArrayList;

/**
 * NAME:shaikh irfan
 *
 * DATE:7:56:01 pm
 *TIME:06-Aug-2017
 *TAGS:
 */
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		//CustomArrayList<studentDetails> s=new CustomArrayList<>();
		studentDetails d=new studentDetails(1, 2240, "irfan", "latur");
		studentDetails d1=new studentDetails(2, 2200, "jim", "mumbai");
		studentDetails d2=new studentDetails(3, 3300, "kim", "pine");
		studentDetails d3=new studentDetails(4, 4300, "sai", "hyd");
		studentDetails d4=new studentDetails(6, 9232, "prasad", "tel");
		studentDetails d6=new studentDetails(7, 9434, "man", "aur");
		

		s.add(d);
		s.add(d1);
		
		s.add(d2);
		s.add(d3);
		s.add(d4);
		s.add(d6);
		
		
		s.remove(d1 );
		/**
		 * itreting by using iterator
		 *//*
	Iterator itr=s.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
		*/
		/*
		 * by using for each loop
		 */
/*for(Object dd:s){
	System.out.println(dd);
}*/
		Object[] l=s.toArray();

for(int i=0;i<l.length;i++){
	System.out.println(l[i]);
}

	}

}
