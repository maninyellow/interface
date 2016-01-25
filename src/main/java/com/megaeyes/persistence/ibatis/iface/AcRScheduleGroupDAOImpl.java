package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.AcRScheduleGroup;
import com.megaeyes.persistence.ibatis.model.AcRScheduleGroupExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class AcRScheduleGroupDAOImpl extends SqlMapClientDaoSupport implements AcRScheduleGroupDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public AcRScheduleGroupDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public void insert(AcRScheduleGroup record) {
        getSqlMapClientTemplate().insert("AC_R_SCHEDULE_GROUP.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public int updateByPrimaryKey(AcRScheduleGroup record) {
        int rows = getSqlMapClientTemplate().update("AC_R_SCHEDULE_GROUP.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public int updateByPrimaryKeySelective(AcRScheduleGroup record) {
        int rows = getSqlMapClientTemplate().update("AC_R_SCHEDULE_GROUP.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public List selectByExample(AcRScheduleGroupExample example) {
        List list = getSqlMapClientTemplate().queryForList("AC_R_SCHEDULE_GROUP.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public AcRScheduleGroup selectByPrimaryKey(String id) {
        AcRScheduleGroup key = new AcRScheduleGroup();
        key.setId(id);
        AcRScheduleGroup record = (AcRScheduleGroup) getSqlMapClientTemplate().queryForObject("AC_R_SCHEDULE_GROUP.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public int deleteByExample(AcRScheduleGroupExample example) {
        int rows = getSqlMapClientTemplate().delete("AC_R_SCHEDULE_GROUP.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public int deleteByPrimaryKey(String id) {
        AcRScheduleGroup key = new AcRScheduleGroup();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("AC_R_SCHEDULE_GROUP.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public int countByExample(AcRScheduleGroupExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("AC_R_SCHEDULE_GROUP.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public int updateByExampleSelective(AcRScheduleGroup record, AcRScheduleGroupExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("AC_R_SCHEDULE_GROUP.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    public int updateByExample(AcRScheduleGroup record, AcRScheduleGroupExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("AC_R_SCHEDULE_GROUP.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table AC_R_SCHEDULE_GROUP
     *
     * @abatorgenerated Tue Jan 08 07:46:33 GMT 2013
     */
    private static class UpdateByExampleParms extends AcRScheduleGroupExample {
        private Object record;

        public UpdateByExampleParms(Object record, AcRScheduleGroupExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}