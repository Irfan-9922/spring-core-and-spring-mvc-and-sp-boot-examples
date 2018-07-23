/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * NAME:shaikh irfan
 *
 * TIME:9:42:54 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class lifecycle implements DisposableBean,InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this method will be from after property set......2");
		
	}
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this method will be from after destroy......90");
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	

}
