package com.springtest4.jdbcTemplate;

import com.springtest4.datasource.MyDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 20:18
 */

/**
 * 模板类
 */
public abstract class JdbcTemplate<T> {
    private DataSource dataSource;  //数据源

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //查询的模板方法
    public List<T> executeQuery(String sql, RowMapper<?> rowMapper, Object...params){
        List<T> list = new ArrayList();
        Connection con = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;
        try {
            //1.连接池中获取链接
            con = dataSource.getConnection();
            //2.创建语句对象  PreparedStatement
            ptmt = con.prepareStatement(sql);
            //3.设置参数
            setParams(ptmt, params);
            //4.查询
            rs = ptmt.executeQuery();
            //5.循环resultSet
            int i = 0;
            while (rs.next()) {
                T t = (T) rowMapper.mapper(rs, i);
                i++;
                list.add(t);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(ptmt!=null){
                try {
                    ptmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            ((MyDataSource)dataSource).returnConnection(con);
        }
        return list;

    }



    /**
     * 参数设置
     *
     * @param stmt
     * @param params
     * @throws SQLException
     */
    private void setParams(PreparedStatement stmt, Object... params) throws SQLException {
        if (null == params || params.length <= 0) {
            return;
        }
        for (int i = 0; i < params.length; i++) {
            stmt.setObject(i + 1, params[i]); //?从1开始  第一个参数 i+1
        }
    }

}
