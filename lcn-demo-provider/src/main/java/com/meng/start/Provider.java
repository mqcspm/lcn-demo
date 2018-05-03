package com.meng.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Description:
 *
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @Date Create on 2018/5/3
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:provider.xml");
        context.start();
        System.in.read();
    }
}
