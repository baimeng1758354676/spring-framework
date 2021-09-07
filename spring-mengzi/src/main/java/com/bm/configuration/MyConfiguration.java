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

	@Bean
	public Person person() {
		return new Person();
	}

}
