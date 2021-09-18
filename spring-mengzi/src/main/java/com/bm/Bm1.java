package com.bm;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author baimeng
 * @Date 2021/9/13 11:50
 **/
@Component
//@Scope("prototype")
public class Bm1 extends Person implements InitializingBean {

	@Autowired
	private Person bm2;

	@Override
	public void afterPropertiesSet() throws Exception {
		this.name = "单例";
	}
}
