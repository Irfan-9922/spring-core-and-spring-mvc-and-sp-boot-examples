/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package SORTEDSET;

import java.util.TreeSet;

/**
 * NAME:shaikh irfan
 *
 * DATE:10:08:04 am
 *TIME:07-Aug-2017
 *TAGS:
 */
public class comparibleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet<>(new desending());
		t.add(12);
		t.add(4);
		t.add(91);
		t.add(11);
		t.add(89);
		t.add(new StringBuffer("demo"));
		t.add(new StringBuffer("gimomm"));
		t.add(new StringBuffer("lomo"));
		System.out.println(t);

	}

}
