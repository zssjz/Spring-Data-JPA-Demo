## Spring Data JPA Demo

本示例仅对`Spring Data JPA`的映射关系作出简单示例。
---

## 工程目录
对不存在文件的包进行合并
```
    src
    |-- main.java.com.jason.data
    |   |-- config
    |   |-- ManyToMany
    |   |   |-- model
    |   |   |-- repository
    |   |   |-- serivce
    |   |       |-- impl
    |   |-- ManyToOne
    |   |   |-- model
    |   |   |-- repository
    |   |   |-- serivce
    |   |       |-- impl
    |   |-- OneToOne
    |       |-- model
    |       |-- repository
    |       |-- serivce
    |           |-- impl
    |-- test.java.com.jason.data
        |-- ManyToMany.service.impl
        |-- ManyToOne.service.impl
        |-- OneToOne.service.impl
```
---

## OneToOne

描述实体`UserDO`和`AccountDO`的一对一的关联关系；例如：一个用户只能拥有一个账号。
---

## ManyToOne

描述实体`CityDO`和`NationDO`的多对一的关联关系；例如：`华盛顿`和`纽约`只属于`美国`。
---

## ManyToMany
描述实体`ClientDO`和`BankDO`的多对多的关联关系；例如：银行A拥有客户甲乙丙，银行B拥有客户甲乙丁。
---
