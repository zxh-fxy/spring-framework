package com.zxh.app;

import com.zxh.bean.Person;
import com.zxh.config.MainConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
	public static void main(String[] args) {
		BeanFactory app = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = app.getBean(Person.class);
		Person bean2 = app.getBean(Person.class);
		Boolean a= bean==bean2;
		System.out.println("--------------------------------------------------------");
		System.out.println(app.getBean(Person.class).toString());
	}
}
