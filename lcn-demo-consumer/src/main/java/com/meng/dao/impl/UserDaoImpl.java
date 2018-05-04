package com.meng.dao.impl;

import java.util.List;

import com.meng.common.User;
import com.meng.dao.UserDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Description:User Dao实现类
 *
 * @Date Create on 2018-05-04 14:08:06
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public int insertUser(User user){
		return getSqlSession().insert("User.insertUser", user);
	}

	@Override
	public int deleteUserById(Long id){
		return getSqlSession().delete("User.deleteUserById", id);
	}

	@Override
	public int updateUserById(User user){
		return getSqlSession().update("User.updateUserById", user);
	}

	@Override
	public User selectUserById(Long id){
		return getSqlSession().selectOne("User.selectUserById", id);
	}

	@Override
	public List<User> selectUserListByCond(User user){
		return getSqlSession().selectList("User.selectUserListByCond", user);
	}

	@Override
	public Integer selectUserCntByCond(User user){
		return getSqlSession().selectOne("User.selectUserCntByCond", user);
	}

}

