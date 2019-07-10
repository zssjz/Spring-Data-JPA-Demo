package com.jason.data.OneToOne.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

/**
 * 账号信息
 */
@Table(name = "base_account")
@Entity
@org.hibernate.annotations.Table(appliesTo = "base_account", comment = "账号信息表")
public class AccountDO {

    @Id
    @GenericGenerator(name="idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "ACCOUNT_ID", length = 32)
    private String accountId;

    @Column(name = "USERNAME", columnDefinition = "VARCHAR(32) NOT NULL COMMENT '账号'")
    private String username;

    @Column(name = "PASSWORD", columnDefinition = "VARCHAR(128) NOT NULL COMMENT '密码'")
    private String password;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.REFRESH})
    @PrimaryKeyJoinColumn
    private UserDO userDO;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDO getUserDO() {
        return userDO;
    }

    public void setUserDO(UserDO userDO) {
        this.userDO = userDO;
    }

    @Override
    public String toString() {
        return "AccountDO{" +
                "accountId='" + accountId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
//                ", userDO=" + userDO +
                '}';
    }
}
