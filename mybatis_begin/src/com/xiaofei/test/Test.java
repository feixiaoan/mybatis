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
			//��ȡ�����ļ�mybatis-config.xml
			InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
			//���������ļ�����SqlSessionFactory
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
			//ͨ��SqlSessionFactory����SqlSession
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			MyUser myUser = sqlSession.selectOne("com.xiaofei.mapper.UserMapper.selectUserById", 1);
			System.out.println(myUser);
			//���һ���û�
			MyUser addmu = new MyUser();
			addmu.setUname("����");
			addmu.setUsex("��");
			sqlSession.insert("com.xiaofei.mapper.UserMapper.addUser", addmu);
			//�޸��û�
			MyUser updateUser = new MyUser();
			updateUser.setUid(1);
			updateUser.setUname("����");
			updateUser.setUsex("Ů");
			sqlSession.update("com.xiaofei.mapper.UserMapper.updateUser", updateUser);
			//ɾ��һ���û�
			sqlSession.delete("com.xiaofei.mapper.UserMapper.deleteUser", 3);
			//��ѯ�����û�
			List<MyUser> list = sqlSession.selectList("com.xiaofei.mapper.UserMapper.selectAllUser");
			for(MyUser myUser1 : list) {
				System.out.println(myUser1);
			}
			//�ύ����
			sqlSession.commit();
			//�ر�sqlSession
			sqlSession.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
