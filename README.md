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

    描述实体`UserDO`和`AccountDO`的一对一的关联关系；例如：一个用户只能拥有一个账号，一个账号仅匹配一个用户。
---

## ManyToOne

    描述实体`CityDO`和`NationDO`的多对一的关联关系；例如：`华盛顿`和`纽约`只属于`美国`，而`美国`还有其他城市。
---

## ManyToMany
    描述实体`ClientDO`和`BankDO`的多对多的关联关系；例如：银行A拥有客户甲乙丙，银行B拥有客户甲乙丁， 甲既是银行A的客户，也是银行B的客户。
---

## 注意项及说明
- 克隆项目后仅需修改本地数据库连接信息，项目启动时自动创建表结构及相关注释。
- 可能由于个人开发环境差异，运行过程及结果可能存在部分差异。
- 项目所有的操作都在单元测试类中进行，service仅为申明常用方法，在本项目中没有真正使用。
- 该项目建立在`Spring Boot`基础上，打开前请确保已了解最基本的食用方式，以获得最佳口感。
- 该项目目的仅在于相关技术交流与个人能力提升。
