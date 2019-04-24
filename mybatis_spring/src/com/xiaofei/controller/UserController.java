package com.xiaofei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xiaofei.po.MyUser;
import com.xiaofei.service.UserService;

@Controller("userController")
public class UserController {
	@Autowired
	private UserService userService;
	public void test() {
		//查询一个用户
		MyUser auser = userService.selectUserById(1);
		System.out.println(auser);
		System.out.println("=================");
		//添加一个用户
		MyUser addmu = new MyUser();
		addmu.setUname("小飞");
		addmu.setUsex("男");
		int add = userService.addUser(addmu);
		System.out.println("添加了" + add + "条记录");
		System.out.println("=================");
		//修改一个用户
		MyUser upUser = new MyUser();
		upUser.setUid(1);
		upUser.setUname("小九九");
		upUser.setUsex("男");
		int update = userService.updateUser(upUser);
		System.out.println("修改了" + update + "条记录");
		System.out.println("=================");
		//删除一个用户
		int delete = userService.deleteUser(2);
		System.out.println("删除了" + delete + "条记录");
		System.out.println("=================");
		//查询所有用户
		List<MyUser> list = userService.selectAllUser();
		for(MyUser mu : list) {
			System.out.println(mu);
		}
	}
}
