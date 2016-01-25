package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.EpProberType;
import com.megaeyes.persistence.ibatis.model.EpProberTypeExample;
import java.util.List;

public interface EpProberTypeDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    void insert(EpProberType record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    int updateByPrimaryKey(EpProberType record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    int updateByPrimaryKeySelective(EpProberType record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    List selectByExample(EpProberTypeExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    EpProberType selectByPrimaryKey(String id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    int deleteByExample(EpProberTypeExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    int countByExample(EpProberTypeExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    int updateByExampleSelective(EpProberType record, EpProberTypeExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_PROBER_TYPE
     *
     * @abatorgenerated Thu May 10 15:05:07 CST 2012
     */
    int updateByExample(EpProberType record, EpProberTypeExample example);
}