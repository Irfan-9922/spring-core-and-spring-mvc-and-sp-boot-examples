/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package SET;

import java.util.HashSet;
import java.util.Set;

/**
 * NAME:shaikh irfan
 *
 * DATE:12:30:26 pm
 *TIME:06-Aug-2017
 *TAGS:
 */
public class findDuplicate_using_two_way {
	public static void main(String[] args) {

     String s[]={"1","2","1","0","0"};
     String s1[]={"1","2","1","0","0"};
     
    /* for(int i=0;i<s.length;i++)
     {
    	 for(int j=i+1;j<s.length;j++){
    		if(s[i].equals(s[j])){
    			System.out.println(s[j]);
    			//
    		}
    	 }
    	 System.out.println("uniq element"+s[i]);
    	
     }*/
	
	Set<String> k=new HashSet<String>();
	for(String p:s1)
		if(k.add(p)==false){
			System.out.println("duplicarte elememt:::"+p);
		}
	System.out.println("uniq elememt::"+k);

}
}
