package com.springtest4.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 08:33
 */
public interface RowMapper<T> {


    /**
     * 对第i行的ResultSet 转换成 T 对象，这个具体的实现由用户完成
     * @param rs
     * @param i
     * @return
     * @throws SQLException
     */
    public T mapper(ResultSet rs,int i) throws SQLException;
}
