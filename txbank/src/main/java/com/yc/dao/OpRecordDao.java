package com.yc.dao;

import com.yc.bean.OpRecord;

import java.util.List;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-03 09:50
 */
public interface OpRecordDao {
    //设计日志的添加接口方法
    public void insertOpRecord(OpRecord opRecord);

    /**
     * 查询一个用户所有的日志,根据时间排序
     * @param accountid
     * @return
     */
    public List<OpRecord> findOpRecord(int accountid);

    /**
     * 查询accountid账户 opType类型的操作,根据时间排序
     * @param accountid
     * @param opType
     * @return
     */
    public List<OpRecord> findOpRecord(int accountid, String opType);

    /**
     * 其他操作
     * @param opRecord
     * @return
     */
    public List<OpRecord> findOpRecord(OpRecord opRecord);
}
