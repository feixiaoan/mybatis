package com.xiaofei.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.xiaofei.po.Person;
import com.xiaofei.pojo.SelectPersonById;
@Repository("personDao")
@Mapper
public interface PersonDao {
	public Person selectPersonById1(Integer id);
	public Person selectPersonById2(Integer id);
	public SelectPersonById selectPersonById3(Integer id);
	
}
