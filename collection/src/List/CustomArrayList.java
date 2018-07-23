/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package List;

import java.util.Arrays;

/**
 * NAME:shaikh irfan
 *
 * DATE:2:17:50 pm TIME:06-Aug-2017 TAGS:
 */
public class CustomArrayList<T> {
	// creat arrayObject
	public Object[] element;

	// define the size
	public int size;

	// write the method for add element
	public void add(T t) {
		// check wheater size is full or no if full the size then increase te
		// size of array
		if (element == null) {
			// for default size
			element = new Object[2];
		}
		// if the element is more than size then increase the capacity
		else if (size == element.length - 1) {
			int news = element.length* 2 / 2 + 1;
			// copy all the element into that
			element = Arrays.copyOf(element, news);
		}
		element[size++] = t;
		
	}

	/*
	 * the following method is used to dispaly the element here idex ix playing
	 * very importent roll
	 */
	public Object get(int index) {
		return element[index];
	}
	/*
	 * this method is used to cleare all the list object
	 */
	public void clear() {
		element = null;
		size = 0;
	}
	/*
	 * this method finds the object in the given location
	 * @see java.lang.Object#toString()
	 */
	public int indexOf(Object o){
   for(int i=0;i<size;i++)
      if(o.equals(element[i])){
    	  return i;
			
		}
   return -1;
	}
	public int size(){
		return size;
	}
	public Object remove(Object o){
	for(int i=0;i<size;i++)
		if(o.equals(element[i]))
		{
			element[i]="";
			
		}
		return element[size];
	}
	public void display(){
		for(int i=0;i<size;i++){
			System.out.println(element[i]);
		}
	}
	@Override
	public String toString() {
		return "CustomArrayList [element=" + Arrays.toString(element) + ", size=" + size + "]";
	}
	

}
