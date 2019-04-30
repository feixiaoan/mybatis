package com.xiaofei.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.xiaofei.po.MyUser;

@Repository("userDao")
@Mapper
/*
 * 使用spring自动扫描mybatis的接口并装配（spring将指定包中所有被
 * @Mapper注解标注的接口自动装配为mybatis的映射接口）
 */
public interface UserDao {
	/*
	 * 接口方法对应SQL映射文件UserMapper.xml中的id
	 */
	public MyUser selectUserById(Integer id);
	public List<MyUser> selectAllUser(Map<String, Object> param);
	public int addUser(MyUser myUser);
	public int updateUser(MyUser myUser);
	public int deleteUser(Integer id);
}
