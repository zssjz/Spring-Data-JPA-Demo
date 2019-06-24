package com.jason.data.OneToOne.service.impl;

import com.jason.data.DataApplication;
import com.jason.data.OneToOne.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataApplication.class)
public class UserServiceImplTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void saveUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void queryUserInfo() {
    }

    @Test
    public void queryUserList() {
    }
}