package com.jason.data.ManyToMany.service.impl;

import com.jason.data.DataApplication;
import com.jason.data.ManyToMany.model.BankDO;
import com.jason.data.ManyToMany.model.ClientDO;
import com.jason.data.ManyToMany.repository.ClientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataApplication.class)
public class ClientServiceImplTest {

    @Autowired
    private ClientRepository repository;

    @Test
    public void saveClient() {
        // 创建客户信息
        ClientDO jason = new ClientDO();
        jason.setClientName("clark");

        // 创建银行信息；命名使用了中国人民银行简称
        BankDO PBOC = new BankDO();
        PBOC.setBankName("中国人民银行");
        PBOC.setBankType("中央银行");

        BankDO citibank = new BankDO();
        citibank.setBankName("花旗银行");
        citibank.setBankType("商业银行");

        // 建立关系
        Set<BankDO> bank = new HashSet<>();
        bank.add(PBOC);
        bank.add(citibank);

        Set<ClientDO> client = new HashSet<>();
        client.add(jason);

        jason.setBankDO(bank);
        PBOC.setClientDO(client);
        citibank.setClientDO(client);

        // 保存
        ClientDO clientDO = repository.save(jason);
        System.out.println(clientDO);
    }

    @Test
    public void deleteClient() {
        repository.deleteById("402880e86b89f4be016b89f4d2800000");
    }

    @Test
    public void findClient() {
        Optional<ClientDO> optional = repository.findById("402880e86b89f4be016b89f4d2800000");
        System.out.println(optional);
    }

    @Test
    public void findClient1() {
    }

    @Test
    public void findClientList() {
        List<ClientDO> list = repository.findAll();
        System.out.println(list);
    }
}