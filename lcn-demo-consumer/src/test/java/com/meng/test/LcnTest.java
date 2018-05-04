package com.meng.test;

import com.meng.service.ProviderSevice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Description:
 *
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @Date Create on 2018/5/4
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
@ContextConfiguration(locations = "classpath*:test-consumer.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class LcnTest {

    @Autowired
    ProviderSevice  providerSevice;

    @Test
    public void invokeDubbo() throws IOException {
        providerSevice.lcndemo();
        System.in.read();
    }
}
