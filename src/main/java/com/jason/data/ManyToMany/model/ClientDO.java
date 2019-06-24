package com.jason.data.ManyToMany.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "financial_client")
@org.hibernate.annotations.Table(appliesTo = "financial_client", comment = "客户信息表")
public class ClientDO {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String clientId;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinTable(name = "financial_relation", joinColumns = @JoinColumn(name = "clientId"), inverseJoinColumns = @JoinColumn(name = "bankId"))
    private Set<BankDO> bankDO;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Set<BankDO> getBankDO() {
        return bankDO;
    }

    public void setBankDO(Set<BankDO> bankDO) {
        this.bankDO = bankDO;
    }

    @Override
    public String toString() {
        return "ClientDO{" +
                "clientId='" + clientId + '\'' +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
