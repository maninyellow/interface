package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.TUser;
import com.megaeyes.persistence.ibatis.model.TUserExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TUserDAOImpl extends SqlMapClientDaoSupport implements TUserDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public TUserDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public void insert(TUser record) {
        getSqlMapClientTemplate().insert("T_USER.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public int updateByPrimaryKey(TUser record) {
        int rows = getSqlMapClientTemplate().update("T_USER.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public int updateByPrimaryKeySelective(TUser record) {
        int rows = getSqlMapClientTemplate().update("T_USER.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public List selectByExample(TUserExample example) {
        List list = getSqlMapClientTemplate().queryForList("T_USER.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public TUser selectByPrimaryKey(String id) {
        TUser key = new TUser();
        key.setId(id);
        TUser record = (TUser) getSqlMapClientTemplate().queryForObject("T_USER.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public int deleteByExample(TUserExample example) {
        int rows = getSqlMapClientTemplate().delete("T_USER.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public int deleteByPrimaryKey(String id) {
        TUser key = new TUser();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("T_USER.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public int countByExample(TUserExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("T_USER.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public int updateByExampleSelective(TUser record, TUserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("T_USER.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    public int updateByExample(TUser record, TUserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("T_USER.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table DL25.T_USER
     *
     * @abatorgenerated Mon Feb 04 16:20:36 CST 2013
     */
    private static class UpdateByExampleParms extends TUserExample {
        private Object record;

        public UpdateByExampleParms(Object record, TUserExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}