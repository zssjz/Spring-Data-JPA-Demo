package com.jason.data.OneToOne.service.impl;

import com.jason.data.OneToOne.model.UserDO;
import com.jason.data.OneToOne.repository.UserRepository;
import com.jason.data.OneToOne.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDO saveUser(UserDO userDO) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public UserDO queryUserInfo(String userId) {
        return null;
    }

    @Override
    public List<UserDO> queryUserList(UserDO userDO) {
        return null;
    }
}
