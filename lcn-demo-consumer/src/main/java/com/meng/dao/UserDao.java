package com.meng.dao;


import com.meng.common.User;

import java.util.List;

/**
 * Description:User Dao接口
 *
 * @Date Create on 2018-05-04 14:08:06
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
public interface UserDao {

	/**
	 * 将数据插入到数据库
	 *
	 * @param user
	 * @return 返回成功新增的个数
	 */
	int insertUser(User user);

	/**
	 * 根据ID删除数据
	 *
	 * @param id
	 * @return 返回成功删除记录的个数
	 */
	int deleteUserById(Long id);

	/**
	 * 根据ID修改数据
	 *
	 * @param id
	 * @return 返回成功修改记录的个数
	 */
	int updateUserById(User user);

	/**
	 * 根据ID查询数据
	 *
	 * @param id
	 * @return 返回成功查询记录
	 */
	User selectUserById(Long id);

	/**
	 * 根据条件查询数据
	 * 
	 * @param user
	 * @return 返回查询的记录列表
	 */
	List<User> selectUserListByCond(User user);

	/**
	 * 根据条件查询数据的条数
	 * 
	 * @param user
	 * @return 返回查询的记录条数
	 */
	 Integer selectUserCntByCond(User user);

}

