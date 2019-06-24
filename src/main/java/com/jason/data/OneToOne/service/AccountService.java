package com.jason.data.OneToOne.service;

import com.jason.data.OneToOne.model.AccountDO;

import java.util.List;

/**
 * AccountDO
 */
public interface AccountService {

    /**
     * 注册及修改账号
     * @param accountDO
     * @return
     */
    AccountDO saveAccount(AccountDO accountDO);

    /**
     * 通过accountId删除AccountDO
     * @param accountId
     */
    void deleteAccount(String accountId);

    /**
     * 通过id获取AccountDO
     * @param accountId
     * @return
     */
    AccountDO queryAccount(String accountId);

    /**
     * 获取一组符合条件的AccountDO
     * @param accountDO
     * @return
     */
    List<AccountDO> queryAccountList(AccountDO accountDO);
}
