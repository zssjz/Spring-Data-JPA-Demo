package com.jason.data.OneToOne.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户信息
 */
@Table(name = "base_user")
@Entity
@org.hibernate.annotations.Table(appliesTo = "base_user", comment = "用户信息表")
public class UserDO {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "USER_ID", length = 32)
    private String userId;

    @Column(name = "NICKNAME", columnDefinition = "VARCHAR(32) NOT NULL COMMENT '昵称'")
    private String nickname;

    @Column(name = "AGE", columnDefinition = "TINYINT DEFAULT NULL COMMENT '年龄'")
    private Integer age;

    @Column(name = "SEX", columnDefinition = "CHAR(2) DEFAULT NULL COMMENT '性别'")
    private String sex;

    @OneToOne(mappedBy = "userDO")
    private AccountDO accountDO;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public AccountDO getAccountDO() {
        return accountDO;
    }

    public void setAccountDO(AccountDO accountDO) {
        this.accountDO = accountDO;
    }
}
