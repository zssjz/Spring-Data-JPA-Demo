package com.jason.data.ManyToMany.service;

import com.jason.data.ManyToMany.model.BankDO;

public interface BankService {

    /**
     * 查询银行信息
     * @param bankId
     * @return
     */
    BankDO findBank(String bankId);

    /**
     * 查询银行列表
     * @param bankDO
     * @return
     */
    BankDO findBankList(BankDO bankDO);

    /**
     * 添加银行信息
     * @param bankDO
     * @return
     */
    BankDO saveBank(BankDO bankDO);

    /**
     * 删除
     * @param bankId
     */
    void deleteBank(String bankId);
}
