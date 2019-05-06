package com.xiaofei.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mysql.jdbc.MySQLConnection;
import com.xiaofei.dao.MyUserDao;
import com.xiaofei.po.MyUser;

@Controller
public class MyUserController {
	@Autowired
	private MyUserDao myUserDao;
	public void test() {
		//使用if元素进行查询
		MyUser myUser = new MyUser();
		myUser.setUname("张");
		myUser.setUsex("女");
		List<MyUser> listUser1 = myUserDao.selectUserByIf(myUser);
		System.out.println("if元素==========================");
		for(MyUser myUser1 : listUser1) {
			System.out.println(myUser1);
		}
		//使用choose元素进行查询
		MyUser myChoose = new MyUser();
		myChoose.setUname("");
		myChoose.setUsex("");
		List<MyUser> listUser2 = myUserDao.selectUserByChoose(myChoose);
		System.out.println("choose元素=========================");
		for(MyUser myUser2 : listUser2) {
			System.out.println(myUser2);
		}
		//使用trim元素进行查询
		List<MyUser> listUser3 = myUserDao.selectUserByTrim(myUser);
		System.out.println("trim元素=============================");
		for(MyUser myUser3 : listUser3) {
			System.out.println(myUser3);
		}
		//使用where元素进行查询
		List<MyUser> listUser4 = myUserDao.selectUserByWhere(myUser);
		System.out.println("where元素=============================");
		for(MyUser myUser4 : listUser4) {
			System.out.println(myUser4);
		}
		//使用set元素修改一个用户
		MyUser setUser = new MyUser();
		setUser.setUid(1);
		setUser.setUname("小明");
		int setup = myUserDao.updateUserBySet(setUser);
		System.out.println("set元素修改了" + setup + "条记录");
		System.out.println("========================================");
		//使用foreach元素查询用户信息
		List<Integer> listId = new ArrayList<Integer>();
		listId.add(34);
		listId.add(34);
		List<MyUser> listUser5 = myUserDao.selectUserByForeach(listId);
		System.out.println("foreach元素====================");
		for(MyUser myUser5 : listUser5) {
			System.out.println(myUser5);
		}
		//使用bing的元素查询用户信息
		MyUser bindUser = new MyUser();
		bindUser.setUname("小");
		List<MyUser> listUser6 = myUserDao.selectUserByBind(bindUser);
		System.out.println("bind元素=====================");
		for(MyUser myUser6 : listUser6) {
			System.out.println(myUser6);
		}
	}
}
