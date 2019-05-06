package com.xiaofei.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.xiaofei.po.MyUser;
@Repository("myUserDao")
@Mapper
public interface MyUserDao {
	public List<MyUser> selectUserByIf(MyUser myUser);
	public List<MyUser> selectUserByChoose(MyUser myUser);
	public List<MyUser> selectUserByTrim(MyUser myUser);
	public List<MyUser> selectUserByWhere(MyUser myUser);
	public int updateUserBySet(MyUser myUser);
	public List<MyUser> selectUserByForeach(List<Integer> listId);
	public List<MyUser> selectUserByBind(MyUser myUser);
}
