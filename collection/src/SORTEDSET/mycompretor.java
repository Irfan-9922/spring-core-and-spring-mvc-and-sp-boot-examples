/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package SORTEDSET;

import java.util.Comparator;

/**
 * NAME:shaikh irfan
 *
 * DATE:12:20:05 pm
 *TIME:07-Aug-2017
 *TAGS:
 */
public class mycompretor implements Comparator{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

      employee id1=(employee) o1;
      employee id2=(employee) o2;
      int f=id1.id;
      int g=id2.id;
      String w=id1.name;
      String x=id2.name;
     
      
		/*if(c<d){
			return +1;
		}
		else if(c>d){
			return -1;
			
		}*/
		return +1;
	}

}
