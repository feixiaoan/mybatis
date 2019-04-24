package com.xiaofei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.controller.UserController;

public class testController {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		UserController userController = (UserController) applicationContext.getBean("userController");
		userController.test();
	}
}
