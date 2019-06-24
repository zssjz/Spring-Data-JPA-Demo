package com.jason.data.OneToOne.service.impl;

import com.jason.data.DataApplication;
import com.jason.data.OneToOne.model.AccountDO;
import com.jason.data.OneToOne.model.UserDO;
import com.jason.data.OneToOne.repository.AccountRepository;
import jdk.nashorn.internal.runtime.options.Option;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataApplication.class)
public class AccountServiceImplTest {

    @Autowired
    private AccountRepository repository;

    @Test
    public void saveAccount() {
        // 创建账号
        AccountDO accountDO = new AccountDO();
        accountDO.setUsername("jason");
        accountDO.setPassword("123456");
        // 创建用户
        UserDO userDO = new UserDO();
        userDO.setNickname("胖子");
        // 关联关系
        accountDO.setUserDO(userDO);
        userDO.setAccountDO(accountDO);
        // 保存
        AccountDO account = repository.save(accountDO);
        System.out.println(account);
    }

    /**
     * 由于设置了级联删除，则两张表的数据都被删除
     */
    @Test
    public void deleteAccount() {
        repository.deleteById("402880fe6b7a6548016b7a6563310000");
    }

    /**
     * getOne方法返回一个代理对象，打印会出现懒加载异常，其他两个方法ok
    */
    @Test
    public void queryAccount() {
//        AccountDO accountDO = repository.getOne("402880fe6b7a6548016b7a6563310000");
//        System.out.println(accountDO);
        Optional<AccountDO> optional = repository.findById("402880fe6b7a6548016b7a6563310000");
        System.out.println(optional);
//        AccountDO accountDO = new AccountDO();
//        accountDO.setAccountId("402880fe6b7a6548016b7a6563310000");
//        Example<AccountDO> example = Example.of(accountDO);
//        Optional<AccountDO> optional = repository.findOne(example);
//        System.out.println(optional);
    }

    @Test
    public void queryAccountList() {
        List<AccountDO> list = repository.findAll();
        System.out.println(list);
    }
}