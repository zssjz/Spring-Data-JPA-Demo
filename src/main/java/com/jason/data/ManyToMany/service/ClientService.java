package com.jason.data.ManyToMany.service;

import com.jason.data.ManyToMany.model.ClientDO;

import java.util.List;

public interface ClientService {

    /**
     * 新增/修改客户信息
     * @param clientDO
     * @return
     */
    ClientDO saveClient(ClientDO clientDO);

    /**
     * 删除客户信息
     * @param clientId
     */
    void deleteClient(String clientId);

    /**
     * 查询
     * @param clientId
     * @return
     */
    ClientDO findClient(String clientId);

    /**
     * 查询
     * @param clientDO
     * @return
     */
    ClientDO findClient(ClientDO clientDO);

    /**
     * 查询列表
     * @param clientDO
     * @return
     */
    List<ClientDO> findClientList(ClientDO clientDO);
}
