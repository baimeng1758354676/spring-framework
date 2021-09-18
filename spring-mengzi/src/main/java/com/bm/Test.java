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

		ApplicationContext context = new AnnotationConfigApplicationContext("com.bm");
		Person bean = (Person) context.getBean("bm1");


		System.out.println(String.format("data:%s,address:%s", bean, Integer.toHexString(bean.hashCode())));

//		Object bm = context.getBean("bm");
//		System.out.println(String.format("data:%s,address:%s", bm, Integer.toHexString(bm.hashCode())));


	}
}
