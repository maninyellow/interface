package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.RtpPayload;
import com.megaeyes.persistence.ibatis.model.RtpPayloadExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class RtpPayloadDAOImpl extends SqlMapClientDaoSupport implements RtpPayloadDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public RtpPayloadDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public void insert(RtpPayload record) {
        getSqlMapClientTemplate().insert("RTP_PAYLOAD.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public int updateByPrimaryKey(RtpPayload record) {
        int rows = getSqlMapClientTemplate().update("RTP_PAYLOAD.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public int updateByPrimaryKeySelective(RtpPayload record) {
        int rows = getSqlMapClientTemplate().update("RTP_PAYLOAD.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public List selectByExample(RtpPayloadExample example) {
        List list = getSqlMapClientTemplate().queryForList("RTP_PAYLOAD.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public RtpPayload selectByPrimaryKey(String id) {
        RtpPayload key = new RtpPayload();
        key.setId(id);
        RtpPayload record = (RtpPayload) getSqlMapClientTemplate().queryForObject("RTP_PAYLOAD.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public int deleteByExample(RtpPayloadExample example) {
        int rows = getSqlMapClientTemplate().delete("RTP_PAYLOAD.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public int deleteByPrimaryKey(String id) {
        RtpPayload key = new RtpPayload();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("RTP_PAYLOAD.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}