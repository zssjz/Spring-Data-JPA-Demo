package com.jason.data.OneToOne.service.impl;

import com.jason.data.OneToOne.model.AccountDO;
import com.jason.data.OneToOne.repository.AccountRepository;
import com.jason.data.OneToOne.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public AccountDO saveAccount(AccountDO accountDO) {
        return null;
    }

    @Override
    public void deleteAccount(String accountId) {

    }

    @Override
    public AccountDO queryAccount(String accountId) {
        return null;
    }

    @Override
    public List<AccountDO> queryAccountList(AccountDO accountDO) {
        return null;
    }
}
