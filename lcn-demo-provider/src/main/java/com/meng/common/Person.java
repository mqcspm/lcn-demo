package com.meng.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import java.io.Serializable;
/**
* @Description:Person 实体类
 *
 * @Date Create on 2018-05-04 10:43:43
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
	/**
	*主键id
	*/
	private Long id;

	/**
	*姓名
	*/
	private String name;

	/**
	*分页对象
	*/

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

}

