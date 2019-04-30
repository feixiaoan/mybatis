package com.xiaofei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xiaofei.dao.PersonDao;
import com.xiaofei.po.Person;
import com.xiaofei.pojo.SelectPersonById;
@Controller
public class OneToOneController {
	@Autowired
	private PersonDao personDao;
	public void test() {
		Person person1 = personDao.selectPersonById1(1);
		System.out.println(person1);
		System.out.println("======================");
		Person person2 = personDao.selectPersonById2(1);
		System.out.println(person2);
		System.out.println("======================");
		SelectPersonById person3 = personDao.selectPersonById3(1);
		System.out.println(person3);
	}
}
