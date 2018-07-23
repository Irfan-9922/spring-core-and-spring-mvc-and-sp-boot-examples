/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package SORTEDSET;

/**
 * NAME:shaikh irfan
 *
 * DATE:11:51:26 am
 *TIME:07-Aug-2017
 *TAGS:
 */
public  class employee implements Comparable{
	public int id;
	public String name;

	/**
	 * @param id
	 * @param name
	 */
	public employee(int id, String name) {
	
		this.id = id;
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		String id1=this.name;
		employee e=(employee) o;
		String id2=e.name;
		int d=id1.length();
		int f=id2.length();
		return id1.compareTo(id2);
		/*if(d>f){    //70  20
		return -1;
		
		}
		else if(d<f){
			return +1;
		}
		else
		{
			return id1.compareTo(id2);
		}
	}*/
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	
}
