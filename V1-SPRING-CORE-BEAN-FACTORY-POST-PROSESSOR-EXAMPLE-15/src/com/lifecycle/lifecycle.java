/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * NAME:shaikh irfan
 *
 * TIME:9:42:54 am
 *DATE:10-Sep-2017
 *TAGS:
 */
public class lifecycle implements BeanFactoryPostProcessor{

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory bean) throws BeansException {
 	BeanDefinition defination=bean.getBeanDefinition("demo");
 	MutablePropertyValues prop=	defination.getPropertyValues();
 	prop.addPropertyValue("name","bushera");
	}


}
