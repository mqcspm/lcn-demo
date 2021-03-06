package com.meng.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.meng.common.Person;
import com.meng.dao.PersonDao;
import com.meng.service.ProviderSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @Date Create on 2018/5/3
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
@Service
public class ProviderSeviceImpl implements ProviderSevice {

    @Autowired
    PersonDao personDao;

    @Override
    @Transactional
    @TxTransaction
    public void lcndemo() {
        Person person = new Person();
        person.setName("尼古拉斯·赵四");
        personDao.insertPerson(person);
    }
}
