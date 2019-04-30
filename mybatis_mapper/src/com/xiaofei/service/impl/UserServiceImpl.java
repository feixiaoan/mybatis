package com.xiaofei.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xiaofei.dao.UserDao;
import com.xiaofei.po.MyUser;
import com.xiaofei.service.UserService;
@Repository("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public MyUser selectUserById(Integer id) {
		return userDao.selectUserById(id);
	}

	@Override
	public List<MyUser> selectAllUser(Map<String, Object> param) {
		return userDao.selectAllUser(param);
	}

	@Override
	public int addUser(MyUser myUser) {
		int result = userDao.addUser(myUser);
		return result;
	}

	@Override
	public int updateUser(MyUser myUser) {
		int result = userDao.updateUser(myUser);
		return result;
	}

	@Override
	public int deleteUser(Integer id) {
		int result = userDao.deleteUser(id);
		return result;
	}

}
