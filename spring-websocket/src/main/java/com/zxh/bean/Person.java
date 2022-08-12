package com.zxh.bean;

import com.zxh.ZxhValue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Person implements InitializingBean, ApplicationContextAware {

	private String name;
	private BeanFactory IOC;
	private Integer age;
	@ZxhValue("testtt")
	private String desc;
	@Autowired
	private Cat cat;
	@Value("${ACSvcPort}")
	private String dd;
	public Person(String zxh, int i) {
		this.name = zxh;
		this.age = i;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", IOC=" + IOC +
				", age=" + age +
				", desc='" + desc + '\'' +
				", cat=" + cat +
				", dd='" + dd + '\'' +
				'}';
	}

	public Person() {
		this.name = "zxh";
		this.age = 20;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.name="ttest";
		this.age=16;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.IOC=applicationContext;
	}
}
