/**@COPYRIGHTS ALL RIGHTS ARE RESERVED

 * 
 */
package com.ij.edito;

import java.beans.PropertyEditorSupport;

/**
 * NAME:shaikh irfan
 *
 * DATE:3:06:17 pm
 *TIME:18-Jul-2017
 *TAGS:
 */
public class propertyeditor extends PropertyEditorSupport{
	/**
	 * 
	 */
	
	
	/* (non-Javadoc)
	 * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	 */
	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(name.contains("mr.")|| name.contains("mrs"))
		setValue(name);
		else
			name="miss"+name;
	setValue(name);
	}

}
