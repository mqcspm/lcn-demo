package com.meng.dao;

import com.meng.common.Person;

import java.util.List;


/**
 * Description:Person Dao接口
 *
 * @Date Create on 2018-05-04 10:43:43
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
public interface PersonDao {

	/**
	 * 将数据插入到数据库
	 *
	 * @param person
	 * @return 返回成功新增的个数
	 */
	int insertPerson(Person person);

	/**
	 * 根据ID删除数据
	 *
	 * @param id
	 * @return 返回成功删除记录的个数
	 */
	int deletePersonById(Long id);

	/**
	 * 根据ID修改数据
	 *
	 * @param id
	 * @return 返回成功修改记录的个数
	 */
	int updatePersonById(Person person);

	/**
	 * 根据ID查询数据
	 *
	 * @param id
	 * @return 返回成功查询记录
	 */
	Person selectPersonById(Long id);

	/**
	 * 根据条件查询数据
	 * 
	 * @param person
	 * @return 返回查询的记录列表
	 */
	List<Person> selectPersonListByCond(Person person);

	/**
	 * 根据条件查询数据的条数
	 * 
	 * @param person
	 * @return 返回查询的记录条数
	 */
	 Integer selectPersonCntByCond(Person person);

}

