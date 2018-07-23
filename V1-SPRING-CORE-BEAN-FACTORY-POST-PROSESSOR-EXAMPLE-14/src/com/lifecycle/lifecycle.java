/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * NAME:shaikh irfan
 *
 * TIME:9:42:54 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class lifecycle implements BeanPostProcessor{

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("post processor after initiliztion.......3"+arg1);
	
		return arg0;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("post processor befor initiliztion.......1"+arg1);
		return arg0;
	}

}
