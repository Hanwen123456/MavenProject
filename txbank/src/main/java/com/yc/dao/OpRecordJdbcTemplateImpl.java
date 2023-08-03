package com.yc.dao;

import com.yc.bean.OpRecord;
import com.yc.bean.OpType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-03 11:47
 */
@Repository
public class OpRecordJdbcTemplateImpl implements OpRecordDao{
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insertOpRecord(OpRecord opRecord) {
        String sql = "insert into oprecord(accountid,opmoney,optime,optype,transferid) values(?,?,now(),?,?)";
        //opRecord.getOptype(); ->枚举类型
        this.jdbcTemplate.update(
                sql,opRecord.getAccountid(),opRecord.getOpmoney(),
                opRecord.getOptype().getKey(),opRecord.getTransferid()
        );
    }

    @Override
    public List<OpRecord> findOpRecord(int accountid) {
        List<OpRecord> list = this.jdbcTemplate.query(
                "select * from oprecord where accountid = ? order by optime desc",
                (rs, rowNum) -> {
                    OpRecord opRecord = new OpRecord();
                    opRecord.setId(rs.getInt(1));
                    opRecord.setAccountid(rs.getInt(2));
                    opRecord.setOpmoney(rs.getDouble(3));
                    opRecord.setOptime(rs.getString(4));
                    String optype = rs.getString(5);
                    if(optype.equalsIgnoreCase("withdraw")){
                        opRecord.setOptype(OpType.WITHDRAW);
                    }else if(optype.equalsIgnoreCase("deposite")){
                        opRecord.setOptype(OpType.DEPOSITE);
                    }else{
                        opRecord.setOptype(OpType.TRANSFER);
                    }
                    opRecord.setTransferid(rs.getInt(6));
                    return opRecord;
                },accountid
        );
        return list;
    }

    @Override
    public List<OpRecord> findOpRecord(int accountid, String opType) {
        List<OpRecord> list = this.jdbcTemplate.query(
                "select * from oprecord where accountid = ? and optype = ? order by optime desc",
                (rs, rowNum) -> {
                    OpRecord opRecord = new OpRecord();
                    opRecord.setId(rs.getInt(1));
                    opRecord.setAccountid(rs.getInt(2));
                    opRecord.setOpmoney(rs.getDouble(3));
                    opRecord.setOptime(rs.getString(4));
                    String optype = rs.getString(5);
                    if(optype.equalsIgnoreCase("withdraw")){
                        opRecord.setOptype(OpType.WITHDRAW);
                    }else if(optype.equalsIgnoreCase("deposite")){
                        opRecord.setOptype(OpType.DEPOSITE);
                    }else{
                        opRecord.setOptype(OpType.TRANSFER);
                    }
                    opRecord.setTransferid(rs.getInt(6));
                    return opRecord;
                },accountid,opType
        );
        return list;
    }

    @Override
    public List<OpRecord> findOpRecord(OpRecord opRecord) {
        return null;
    }
}