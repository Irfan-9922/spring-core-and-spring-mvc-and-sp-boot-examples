/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:33:51 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class adress6 {
	private String city;
	private String zipcode;
	

	/**
	 * @param city
	 * @param zipcode
	 */
	public adress6(String city, String zipcode) {
		super();
		this.city = city;
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "adress [city=" + city + ", zipcode=" + zipcode + "]";
	}

}
