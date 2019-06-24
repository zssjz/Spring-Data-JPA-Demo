package com.jason.data.config;

import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.stereotype.Component;

/**
 * 设置数据库引擎及字符集
 */
@Component
public class MySQL5TableConfig extends MySQL5Dialect {

    @Override
    public String getTableTypeString() {
//        return super.getTableTypeString();
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
