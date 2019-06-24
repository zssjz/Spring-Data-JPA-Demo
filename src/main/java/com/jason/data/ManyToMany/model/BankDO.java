package com.jason.data.ManyToMany.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "financial_bank")
@org.hibernate.annotations.Table(appliesTo = "financial_bank", comment = "银行信息表")
public class BankDO {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String bankId;

    @Column(name = "BANK_NAME", columnDefinition = "VARCHAR(32) NOT NULL COMMENT '银行名称'")
    private String bankName;

    @Column(name = "BANK_TYPE",columnDefinition = "VARCHAR(16) NOT NULL COMMENT '银行类型'")
    private String bankType;

    @ManyToMany(mappedBy = "bankDO")
    private Set<ClientDO> clientDO;

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public Set<ClientDO> getClientDO() {
        return clientDO;
    }

    public void setClientDO(Set<ClientDO> clientDO) {
        this.clientDO = clientDO;
    }

    @Override
    public String toString() {
        return "BankDO{" +
                "bankId='" + bankId + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankType='" + bankType + '\'' +
                '}';
    }
}
