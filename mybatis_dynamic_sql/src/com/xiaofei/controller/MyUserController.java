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
		//ʹ��ifԪ�ؽ��в�ѯ
		MyUser myUser = new MyUser();
		myUser.setUname("��");
		myUser.setUsex("Ů");
		List<MyUser> listUser1 = myUserDao.selectUserByIf(myUser);
		System.out.println("ifԪ��==========================");
		for(MyUser myUser1 : listUser1) {
			System.out.println(myUser1);
		}
		//ʹ��chooseԪ�ؽ��в�ѯ
		MyUser myChoose = new MyUser();
		myChoose.setUname("");
		myChoose.setUsex("");
		List<MyUser> listUser2 = myUserDao.selectUserByChoose(myChoose);
		System.out.println("chooseԪ��=========================");
		for(MyUser myUser2 : listUser2) {
			System.out.println(myUser2);
		}
		//ʹ��trimԪ�ؽ��в�ѯ
		List<MyUser> listUser3 = myUserDao.selectUserByTrim(myUser);
		System.out.println("trimԪ��=============================");
		for(MyUser myUser3 : listUser3) {
			System.out.println(myUser3);
		}
		//ʹ��whereԪ�ؽ��в�ѯ
		List<MyUser> listUser4 = myUserDao.selectUserByWhere(myUser);
		System.out.println("whereԪ��=============================");
		for(MyUser myUser4 : listUser4) {
			System.out.println(myUser4);
		}
		//ʹ��setԪ���޸�һ���û�
		MyUser setUser = new MyUser();
		setUser.setUid(1);
		setUser.setUname("С��");
		int setup = myUserDao.updateUserBySet(setUser);
		System.out.println("setԪ���޸���" + setup + "����¼");
		System.out.println("========================================");
		//ʹ��foreachԪ�ز�ѯ�û���Ϣ
		List<Integer> listId = new ArrayList<Integer>();
		listId.add(34);
		listId.add(34);
		List<MyUser> listUser5 = myUserDao.selectUserByForeach(listId);
		System.out.println("foreachԪ��====================");
		for(MyUser myUser5 : listUser5) {
			System.out.println(myUser5);
		}
		//ʹ��bing��Ԫ�ز�ѯ�û���Ϣ
		MyUser bindUser = new MyUser();
		bindUser.setUname("С");
		List<MyUser> listUser6 = myUserDao.selectUserByBind(bindUser);
		System.out.println("bindԪ��=====================");
		for(MyUser myUser6 : listUser6) {
			System.out.println(myUser6);
		}
	}
}
