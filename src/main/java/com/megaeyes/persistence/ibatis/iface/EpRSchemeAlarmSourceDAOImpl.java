package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.EpRSchemeAlarmSource;
import com.megaeyes.persistence.ibatis.model.EpRSchemeAlarmSourceExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EpRSchemeAlarmSourceDAOImpl extends SqlMapClientDaoSupport implements EpRSchemeAlarmSourceDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EP_R_SCHEME_ALARM_SOURCE
     *
     * @abatorgenerated Thu Apr 19 16:23:32 CST 2012
     */
    public EpRSchemeAlarmSourceDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EP_R_SCHEME_ALARM_SOURCE
     *
     * @abatorgenerated Thu Apr 19 16:23:32 CST 2012
     */
    public void insert(EpRSchemeAlarmSource record) {
        getSqlMapClientTemplate().insert("EP_R_SCHEME_ALARM_SOURCE.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EP_R_SCHEME_ALARM_SOURCE
     *
     * @abatorgenerated Thu Apr 19 16:23:32 CST 2012
     */
    public int updateByPrimaryKey(EpRSchemeAlarmSource record) {
        int rows = getSqlMapClientTemplate().update("EP_R_SCHEME_ALARM_SOURCE.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EP_R_SCHEME_ALARM_SOURCE
     *
     * @abatorgenerated Thu Apr 19 16:23:32 CST 2012
     */
    public int updateByPrimaryKeySelective(EpRSchemeAlarmSource record) {
        int rows = getSqlMapClientTemplate().update("EP_R_SCHEME_ALARM_SOURCE.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EP_R_SCHEME_ALARM_SOURCE
     *
     * @abatorgenerated Thu Apr 19 16:23:32 CST 2012
     */
    public List selectByExample(EpRSchemeAlarmSourceExample example) {
        List list = getSqlMapClientTemplate().queryForList("EP_R_SCHEME_ALARM_SOURCE.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EP_R_SCHEME_ALARM_SOURCE
     *
     * @abatorgenerated Thu Apr 19 16:23:32 CST 2012
     */
    public EpRSchemeAlarmSource selectByPrimaryKey(String id) {
        EpRSchemeAlarmSource key = new EpRSchemeAlarmSource();
        key.setId(id);
        EpRSchemeAlarmSource record = (EpRSchemeAlarmSource) getSqlMapClientTemplate().queryForObject("EP_R_SCHEME_ALARM_SOURCE.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EP_R_SCHEME_ALARM_SOURCE
     *
     * @abatorgenerated Thu Apr 19 16:23:32 CST 2012
     */
    public int deleteByExample(EpRSchemeAlarmSourceExample example) {
        int rows = getSqlMapClientTemplate().delete("EP_R_SCHEME_ALARM_SOURCE.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EP_R_SCHEME_ALARM_SOURCE
     *
     * @abatorgenerated Thu Apr 19 16:23:32 CST 2012
     */
    public int deleteByPrimaryKey(String id) {
        EpRSchemeAlarmSource key = new EpRSchemeAlarmSource();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("EP_R_SCHEME_ALARM_SOURCE.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}