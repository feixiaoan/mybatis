package com.xiaofei.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.xiaofei.po.MyUser;

@Repository("userDao")
@Mapper
/*
 * ʹ��spring�Զ�ɨ��mybatis�Ľӿڲ�װ�䣨spring��ָ���������б�
 * @Mapperע���ע�Ľӿ��Զ�װ��Ϊmybatis��ӳ��ӿڣ�
 */
public interface UserDao {
	/*
	 * �ӿڷ�����ӦSQLӳ���ļ�UserMapper.xml�е�id
	 */
	public MyUser selectUserById(Integer id);
	public List<MyUser> selectAllUser(Map<String, Object> param);
	public int addUser(MyUser myUser);
	public int updateUser(MyUser myUser);
	public int deleteUser(Integer id);
}
