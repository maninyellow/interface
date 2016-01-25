package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.EpTaskHistory;
import com.megaeyes.persistence.ibatis.model.EpTaskHistoryExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EpTaskHistoryDAOImpl extends SqlMapClientDaoSupport implements EpTaskHistoryDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public EpTaskHistoryDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public void insert(EpTaskHistory record) {
        getSqlMapClientTemplate().insert("EP_TASK_HISTORY.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public int updateByPrimaryKey(EpTaskHistory record) {
        int rows = getSqlMapClientTemplate().update("EP_TASK_HISTORY.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public int updateByPrimaryKeySelective(EpTaskHistory record) {
        int rows = getSqlMapClientTemplate().update("EP_TASK_HISTORY.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public List selectByExample(EpTaskHistoryExample example) {
        List list = getSqlMapClientTemplate().queryForList("EP_TASK_HISTORY.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public EpTaskHistory selectByPrimaryKey(String id) {
        EpTaskHistory key = new EpTaskHistory();
        key.setId(id);
        EpTaskHistory record = (EpTaskHistory) getSqlMapClientTemplate().queryForObject("EP_TASK_HISTORY.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public int deleteByExample(EpTaskHistoryExample example) {
        int rows = getSqlMapClientTemplate().delete("EP_TASK_HISTORY.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public int deleteByPrimaryKey(String id) {
        EpTaskHistory key = new EpTaskHistory();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("EP_TASK_HISTORY.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public int countByExample(EpTaskHistoryExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("EP_TASK_HISTORY.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public int updateByExampleSelective(EpTaskHistory record, EpTaskHistoryExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("EP_TASK_HISTORY.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    public int updateByExample(EpTaskHistory record, EpTaskHistoryExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("EP_TASK_HISTORY.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table HBDW1.EP_TASK_HISTORY
     *
     * @abatorgenerated Wed May 23 10:12:04 CST 2012
     */
    private static class UpdateByExampleParms extends EpTaskHistoryExample {
        private Object record;

        public UpdateByExampleParms(Object record, EpTaskHistoryExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}