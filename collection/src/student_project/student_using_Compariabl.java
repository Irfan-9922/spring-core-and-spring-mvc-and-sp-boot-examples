/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package student_project;

/**
 * NAME:shaikh irfan
 *
 * DATE:1:13:40 pm
 *TIME:07-Aug-2017
 *TAGS:
 */
public class student_using_Compariabl implements Comparable {

	private String name;
	String fname;
	String adress;
	 int no;int phno;
	/**
	 * @param name
	 * @param fname
	 * @param adress
	 * @param no
	 * @param phno
	 */
	public student_using_Compariabl(String name, String fname, String adress, int no, int phno) {
		super();
		this.name = name;
		this.fname = fname;
		this.adress = adress;
		this.no = no;
		this.phno = phno;
	}
	
	@Override
	public String toString() {
		return "student_using_Compariabl [name=" + name + ", fname=" + fname + ", adress=" + adress + ", no=" + no
				+ ", phno=" + phno + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int id1=this.no;
		student_using_Compariabl e=(student_using_Compariabl) o;
		int id2=e.no;
		if(id1>id2){
			return +1;
		}
		else if(id1<id2){
			return -1;
		}
		else {
			return 0;
		}
	}

}
