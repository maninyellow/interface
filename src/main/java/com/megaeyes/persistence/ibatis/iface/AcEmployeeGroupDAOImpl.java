package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.AcEmployeeGroup;
import com.megaeyes.persistence.ibatis.model.AcEmployeeGroupExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class AcEmployeeGroupDAOImpl extends SqlMapClientDaoSupport implements AcEmployeeGroupDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public AcEmployeeGroupDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public void insert(AcEmployeeGroup record) {
        getSqlMapClientTemplate().insert("AC_EMPLOYEE_GROUP.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public int updateByPrimaryKey(AcEmployeeGroup record) {
        int rows = getSqlMapClientTemplate().update("AC_EMPLOYEE_GROUP.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public int updateByPrimaryKeySelective(AcEmployeeGroup record) {
        int rows = getSqlMapClientTemplate().update("AC_EMPLOYEE_GROUP.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public List selectByExample(AcEmployeeGroupExample example) {
        List list = getSqlMapClientTemplate().queryForList("AC_EMPLOYEE_GROUP.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public AcEmployeeGroup selectByPrimaryKey(String id) {
        AcEmployeeGroup key = new AcEmployeeGroup();
        key.setId(id);
        AcEmployeeGroup record = (AcEmployeeGroup) getSqlMapClientTemplate().queryForObject("AC_EMPLOYEE_GROUP.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public int deleteByExample(AcEmployeeGroupExample example) {
        int rows = getSqlMapClientTemplate().delete("AC_EMPLOYEE_GROUP.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public int deleteByPrimaryKey(String id) {
        AcEmployeeGroup key = new AcEmployeeGroup();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("AC_EMPLOYEE_GROUP.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public int countByExample(AcEmployeeGroupExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("AC_EMPLOYEE_GROUP.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public int updateByExampleSelective(AcEmployeeGroup record, AcEmployeeGroupExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("AC_EMPLOYEE_GROUP.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    public int updateByExample(AcEmployeeGroup record, AcEmployeeGroupExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("AC_EMPLOYEE_GROUP.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table DL25.AC_EMPLOYEE_GROUP
     *
     * @abatorgenerated Fri Jan 11 06:44:15 GMT 2013
     */
    private static class UpdateByExampleParms extends AcEmployeeGroupExample {
        private Object record;

        public UpdateByExampleParms(Object record, AcEmployeeGroupExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}