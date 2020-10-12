package com.dongchanglei.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: dcl
 * @Date: 2020/09/19/2:43 下午
 * @Description:
 */
@ComponentScan("com.dongchanglei")
public class MainStart {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MainStart.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHi();

	}
}
