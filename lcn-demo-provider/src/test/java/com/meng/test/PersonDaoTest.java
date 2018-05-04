package com.meng.test;

import com.meng.common.Person;
import com.meng.dao.PersonDao;
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
@ContextConfiguration(locations = "classpath*:test-provider.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonDaoTest {

    @Autowired
    PersonDao personDao;

    @Test
    public void insertTest() throws IOException {
        Person person = new Person();
        person.setId(1L);
        person.setName("张三");
        personDao.insertPerson(person);
    }
}
