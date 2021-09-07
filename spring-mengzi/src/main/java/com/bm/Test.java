package com.bm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author baimeng
 * @Date 2021/9/6 15:16
 **/
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.bm.configuration");
		Person bean = context.getBean(Person.class);

		System.out.println(bean);

	}
}
