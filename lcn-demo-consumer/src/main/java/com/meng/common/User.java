package com.meng.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @Description:User 实体类
 * @Date Create on 2018-05-04 14:08:06
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     *
     */
    private String name;

    /**
     * 分页对象
     */

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}

