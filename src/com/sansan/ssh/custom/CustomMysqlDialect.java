package com.sansan.ssh.custom;

import org.hibernate.dialect.MySQL5Dialect;

public class CustomMysqlDialect extends MySQL5Dialect{
	public String getTableTypeString() {
        return " ENGINE=MyISAM DEFAULT CHARSET=utf8";
    }
}
