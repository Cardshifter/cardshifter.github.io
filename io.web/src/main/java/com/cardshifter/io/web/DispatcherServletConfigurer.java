package com.cardshifter.io.web;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.web.servlet.DispatcherServlet;


public class DispatcherServletConfigurer implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DispatcherServlet) {
            ((DispatcherServlet) bean).setThrowExceptionIfNoHandlerFound(true);
        }
        return bean;
   }

	@Override
   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
       return bean;
   }

}
