package com.meng.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.meng.common.User;
import com.meng.dao.UserDao;
import com.meng.service.ConsumerServie;
import com.meng.service.ProviderSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @author <a href="mailto:mengqingcai@zuozh.com">mengqingcai</a>
 * @Date Create on 2018/5/4
 * @since version1.0 Copyright 2015 ZZJR All Rights Reserved.
 */
@Service
public class ConsumerServieImpl implements ConsumerServie {

    @Autowired
    ProviderSevice providerSevice;

    @Autowired
    UserDao userDao;

    @Override
    @Transactional
    @TxTransaction(isStart = true)
    public void lcnDemo() {
        User user = new User();
        user.setName("尼古拉斯·赵五");
        userDao.insertUser(user);
        providerSevice.lcndemo();
        //int a = 100 / 0;
    }
}
