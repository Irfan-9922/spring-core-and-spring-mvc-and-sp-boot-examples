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
public class adress8 {
	private String city;
	private String zipcode;
	
	/**
	 * @param city
	 * @param zipcode
	 */


	@Override
	public String toString() {
		return "adress [city=" + city + ", zipcode=" + zipcode + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
