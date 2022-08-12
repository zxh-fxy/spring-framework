package com.zxh.bpp;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MergeBeandefinition implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("postProcessMergedBeanDefinition"+"-----------"+beanName);
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		System.out.println("resetBeanDefinition"+"-----------"+beanName);
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
