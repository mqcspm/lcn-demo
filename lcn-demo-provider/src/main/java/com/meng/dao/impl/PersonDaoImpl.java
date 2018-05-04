package com.meng.dao.impl;

import java.util.List;

import com.meng.common.Person;
import com.meng.dao.PersonDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Description:Person Dao实现类
 *
 * @Date Create on 2018-05-04 10:43:43
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
@Repository
public class PersonDaoImpl extends SqlSessionDaoSupport implements PersonDao {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public int insertPerson(Person person){
		return getSqlSession().insert("Person.insertPerson", person);
	}

	@Override
	public int deletePersonById(Long id){
		return getSqlSession().delete("Person.deletePersonById", id);
	}

	@Override
	public int updatePersonById(Person person){
		return getSqlSession().update("Person.updatePersonById", person);
	}

	@Override
	public Person selectPersonById(Long id){
		return getSqlSession().selectOne("Person.selectPersonById", id);
	}

	@Override
	public List<Person> selectPersonListByCond(Person person){
		return getSqlSession().selectList("Person.selectPersonListByCond", person);
	}

	@Override
	public Integer selectPersonCntByCond(Person person){
		return getSqlSession().selectOne("Person.selectPersonCntByCond", person);
	}

}

