package com.springtest4.user;

import com.springtest4.jdbcTemplate.JdbcTemplate;
import com.springtest4.jdbcTemplate.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 08:57
 */
@Repository
public class BankAccountDao extends JdbcTemplate {

    @Autowired    //按类型注入   DataSource接口->MyDataSource的实现类
    public BankAccountDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<BankAccount> findAll(){
        return super.executeQuery("select * from bank ", new RowMapper<BankAccount>() {
            @Override
            public BankAccount mapper(ResultSet rs, int i) throws SQLException {
                BankAccount ba = new BankAccount();
                ba.setId(rs.getInt(1));
                ba.setBalance(rs.getDouble(2));
                return ba;
            }
        });
    }


}
