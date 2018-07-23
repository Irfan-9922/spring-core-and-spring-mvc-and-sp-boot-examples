/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.go;

import java.beans.PropertyEditorSupport;

/**
 * NAME:shaikh irfan
 *
 * DATE:4:59:50 pm
 *TIME:11-Aug-2017
 *TAGS:
 */
public class stname extends PropertyEditorSupport {
/* (non-Javadoc)
 * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
 */
/* (non-Javadoc)
 * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
 */
/* (non-Javadoc)
 * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
 */
@Override
public void setAsText(String date) throws IllegalArgumentException {
	if(date==null||date.equals("")){
		date="12/01/17"+date;
		setValue(date);
	}
	else{
		setValue(date);
	}
}

}
