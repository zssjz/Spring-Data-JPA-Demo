package com.jason.data.ManyToMany.service.impl;

import com.jason.data.ManyToMany.model.ClientDO;
import com.jason.data.ManyToMany.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public ClientDO saveClient(ClientDO clientDO) {
        return null;
    }

    @Override
    public void deleteClient(String clientId) {

    }

    @Override
    public ClientDO findClient(String clientId) {
        return null;
    }

    @Override
    public ClientDO findClient(ClientDO clientDO) {
        return null;
    }

    @Override
    public List<ClientDO> findClientList(ClientDO clientDO) {
        return null;
    }
}
