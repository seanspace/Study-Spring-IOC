package com.bin.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProccessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization : " + bean + ", " + beanName);
		if ("car".equals(beanName)) {
			// ...,找到对应的bean之后可以处理.
		}
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessBeforeInitialization : " + arg0 + ", " + arg1);
		
		return arg0;
	}
	

}
