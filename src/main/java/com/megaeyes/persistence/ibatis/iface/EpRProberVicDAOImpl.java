package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.EpRProberVic;
import com.megaeyes.persistence.ibatis.model.EpRProberVicExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EpRProberVicDAOImpl extends SqlMapClientDaoSupport implements EpRProberVicDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public EpRProberVicDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public void insert(EpRProberVic record) {
        getSqlMapClientTemplate().insert("ep_r_prober_vic.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public int updateByPrimaryKey(EpRProberVic record) {
        int rows = getSqlMapClientTemplate().update("ep_r_prober_vic.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public int updateByPrimaryKeySelective(EpRProberVic record) {
        int rows = getSqlMapClientTemplate().update("ep_r_prober_vic.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public List selectByExample(EpRProberVicExample example) {
        List list = getSqlMapClientTemplate().queryForList("ep_r_prober_vic.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public EpRProberVic selectByPrimaryKey(String id) {
        EpRProberVic key = new EpRProberVic();
        key.setId(id);
        EpRProberVic record = (EpRProberVic) getSqlMapClientTemplate().queryForObject("ep_r_prober_vic.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public int deleteByExample(EpRProberVicExample example) {
        int rows = getSqlMapClientTemplate().delete("ep_r_prober_vic.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public int deleteByPrimaryKey(String id) {
        EpRProberVic key = new EpRProberVic();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("ep_r_prober_vic.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public int countByExample(EpRProberVicExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("ep_r_prober_vic.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public int updateByExampleSelective(EpRProberVic record, EpRProberVicExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("ep_r_prober_vic.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    public int updateByExample(EpRProberVic record, EpRProberVicExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("ep_r_prober_vic.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table HBDW1.EP_R_PROBER_VIC
     *
     * @abatorgenerated Mon May 14 02:48:24 GMT 2012
     */
    private static class UpdateByExampleParms extends EpRProberVicExample {
        private Object record;

        public UpdateByExampleParms(Object record, EpRProberVicExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}