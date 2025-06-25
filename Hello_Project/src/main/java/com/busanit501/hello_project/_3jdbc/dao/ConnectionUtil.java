package com.busanit501.hello_project._3jdbc.dao;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


import java.sql.Connection;
import java.sql.SQLException;

public enum ConnectionUtil {
    INSTANCE;
    private HikariDataSource ds;
    ConnectionUtil() {
        // 1, 히카리 이용하기 위한 객체 도구 필요함.
        HikariConfig config = new HikariConfig();
        // 2, 어느 디비 서버에 연결 할지, 정보 등록,
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("webuser");
        config.setPassword("webuser");
        //3. 옵션 설정, 캐시, 크기 , 제한량,
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        ds = new HikariDataSource(config);
    }

    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
