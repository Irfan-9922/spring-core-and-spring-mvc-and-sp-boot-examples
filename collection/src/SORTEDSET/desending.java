/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package SORTEDSET;

import java.util.Comparator;

/**
 * NAME:shaikh irfan
 *
 * DATE:10:13:40 am
 *TIME:07-Aug-2017
 *TAGS:
 */
public class desending implements Comparator{

	

	public int compare(Object o1, Object o2) {
		
		String k=o1.toString();
		String l= o2.toString();
		int i=k.length();
		int j=l.length();
		
		// TODO Auto-generated method stub
		
			if(i<j){
				return +1;
			}
			else if(i>j){
				return -1;
			}
			else
				return -k.compareTo(l);
		
	}

}
