package com.xiaofei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.controller.MyUserController;

public class TestController {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		MyUserController oto = (MyUserController) applicationContext.getBean("myUserController");
		oto.test();
	}
}
