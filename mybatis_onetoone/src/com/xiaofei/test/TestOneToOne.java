package com.xiaofei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.controller.OneToOneController;

public class TestOneToOne {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		OneToOneController oto = (OneToOneController) applicationContext.getBean("oneToOneController");
		oto.test();
	}
}
