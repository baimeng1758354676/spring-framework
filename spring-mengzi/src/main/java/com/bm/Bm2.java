package com.bm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author baimeng
 * @Date 2021/9/13 11:51
 **/
@Component
//@Scope("prototype")
public class Bm2 extends Person {

	@Autowired
	private Person bm1;

}
