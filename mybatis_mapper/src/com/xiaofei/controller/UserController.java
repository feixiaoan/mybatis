package com.xiaofei.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xiaofei.po.MyUser;
import com.xiaofei.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public void test() {
		/*
		//��ѯһ���û�
		MyUser auser = userService.selectUserById(1);
		System.out.println(auser);
		System.out.println("=================");
		//���һ���û�
		MyUser addmu = new MyUser();
		addmu.setUname("С��");
		addmu.setUsex("��");
		int add = userService.addUser(addmu);
		System.out.println("�����" + add + "����¼");
		System.out.println("=================");
		//�޸�һ���û�
		MyUser upUser = new MyUser();
		upUser.setUid(1);
		upUser.setUname("С�ž�");
		upUser.setUsex("��");
		int update = userService.updateUser(upUser);
		System.out.println("�޸���" + update + "����¼");
		System.out.println("=================");
		//ɾ��һ���û�
		int delete = userService.deleteUser(2);
		System.out.println("ɾ����" + delete + "����¼");
		System.out.println("=================");
		//��ѯ�����û�
		List<MyUser> list = userService.selectAllUser();
		for(MyUser mu : list) {
			System.out.println(mu);
		}
		*/
		//��ѯ����û�
		Map<String, Object> map = new HashMap<>();
		map.put("uname", "С");
		map.put("usex", "��");
		List<MyUser> list = userService.selectAllUser(map);
		for(MyUser myUser : list) {
			System.out.println(myUser);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
