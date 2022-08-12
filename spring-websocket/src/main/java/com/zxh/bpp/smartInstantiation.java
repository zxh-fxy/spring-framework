package com.zxh.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
@Component
public class smartInstantiation implements SmartInstantiationAwareBeanPostProcessor {
	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("predictBeanType"+"-----------"+beanName);
		return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
	}

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("determineCandidateConstructors"+"-----------"+beanName);
		return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return SmartInstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("getEarlyBeanReference"+"-----------"+beanName);
		return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
	}
}
