package com.xiaofei.service;

import java.util.List;
import com.xiaofei.po.MyUser;
public interface UserService {
	public MyUser selectUserById(Integer id);
	public List<MyUser> selectAllUser();
	public int addUser(MyUser myUser);
	public int updateUser(MyUser myUser);
	public int deleteUser(Integer id);
	
}
