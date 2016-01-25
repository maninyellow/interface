package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.EpAlarmEvent;
import com.megaeyes.persistence.ibatis.model.EpAlarmEventExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EpAlarmEventDAOImpl extends SqlMapClientDaoSupport implements EpAlarmEventDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public EpAlarmEventDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public void insert(EpAlarmEvent record) {
        getSqlMapClientTemplate().insert("EP_ALARM_EVENT.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public int updateByPrimaryKey(EpAlarmEvent record) {
        int rows = getSqlMapClientTemplate().update("EP_ALARM_EVENT.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public int updateByPrimaryKeySelective(EpAlarmEvent record) {
        int rows = getSqlMapClientTemplate().update("EP_ALARM_EVENT.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public List selectByExample(EpAlarmEventExample example) {
        List list = getSqlMapClientTemplate().queryForList("EP_ALARM_EVENT.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public EpAlarmEvent selectByPrimaryKey(String id) {
        EpAlarmEvent key = new EpAlarmEvent();
        key.setId(id);
        EpAlarmEvent record = (EpAlarmEvent) getSqlMapClientTemplate().queryForObject("EP_ALARM_EVENT.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public int deleteByExample(EpAlarmEventExample example) {
        int rows = getSqlMapClientTemplate().delete("EP_ALARM_EVENT.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public int deleteByPrimaryKey(String id) {
        EpAlarmEvent key = new EpAlarmEvent();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("EP_ALARM_EVENT.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public int countByExample(EpAlarmEventExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("EP_ALARM_EVENT.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public int updateByExampleSelective(EpAlarmEvent record, EpAlarmEventExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("EP_ALARM_EVENT.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    public int updateByExample(EpAlarmEvent record, EpAlarmEventExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("EP_ALARM_EVENT.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table HBDW1.EP_ALARM_EVENT
     *
     * @abatorgenerated Fri Jun 15 11:08:52 CST 2012
     */
    private static class UpdateByExampleParms extends EpAlarmEventExample {
        private Object record;

        public UpdateByExampleParms(Object record, EpAlarmEventExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}