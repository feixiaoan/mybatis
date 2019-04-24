package com.xiaofei.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xiaofei.po.MyUser;

public class Test {

	public static void main(String[] args) {
		try {
			//读取配置文件mybatis-config.xml
			InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
			//根据配置文件构建SqlSessionFactory
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
			//通过SqlSessionFactory创建SqlSession
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			MyUser myUser = sqlSession.selectOne("com.xiaofei.mapper.UserMapper.selectUserById", 1);
			System.out.println(myUser);
			//添加一个用户
			MyUser addmu = new MyUser();
			addmu.setUname("张三");
			addmu.setUsex("男");
			sqlSession.insert("com.xiaofei.mapper.UserMapper.addUser", addmu);
			//修改用户
			MyUser updateUser = new MyUser();
			updateUser.setUid(1);
			updateUser.setUname("李四");
			updateUser.setUsex("女");
			sqlSession.update("com.xiaofei.mapper.UserMapper.updateUser", updateUser);
			//删除一个用户
			sqlSession.delete("com.xiaofei.mapper.UserMapper.deleteUser", 3);
			//查询所有用户
			List<MyUser> list = sqlSession.selectList("com.xiaofei.mapper.UserMapper.selectAllUser");
			for(MyUser myUser1 : list) {
				System.out.println(myUser1);
			}
			//提交事务
			sqlSession.commit();
			//关闭sqlSession
			sqlSession.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
