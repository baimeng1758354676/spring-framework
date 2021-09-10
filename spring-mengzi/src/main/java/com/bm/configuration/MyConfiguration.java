package com.bm.configuration;

import com.bm.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author baimeng
 * @Date 2021/9/6 15:23
 **/

@Configuration
public class MyConfiguration {

//	@Bean({"person1","person2"})
//	public Person person() {
//		return new Person();
//	}


	@Bean("bm")
	public Person bm1() {
//		System.out.println("生成单例bean");
		return new Person("single", 2);
	}


	//	@Scope("prototype")
	@Bean("bm")
	public Person bm() {
//		System.out.println("生成原型bean");
		return new Person("prototype", 1);
	}


}
