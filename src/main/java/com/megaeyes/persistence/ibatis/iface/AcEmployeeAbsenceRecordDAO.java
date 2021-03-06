package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.AcEmployeeAbsenceRecord;
import com.megaeyes.persistence.ibatis.model.AcEmployeeAbsenceRecordExample;
import java.util.List;

public interface AcEmployeeAbsenceRecordDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    void insert(AcEmployeeAbsenceRecord record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    int updateByPrimaryKey(AcEmployeeAbsenceRecord record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    int updateByPrimaryKeySelective(AcEmployeeAbsenceRecord record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    List selectByExample(AcEmployeeAbsenceRecordExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    AcEmployeeAbsenceRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    int deleteByExample(AcEmployeeAbsenceRecordExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    int countByExample(AcEmployeeAbsenceRecordExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    int updateByExampleSelective(AcEmployeeAbsenceRecord record, AcEmployeeAbsenceRecordExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_EMPLOYEE_ABSENCE_RECORD
     *
     * @abatorgenerated Mon Mar 04 14:26:20 CST 2013
     */
    int updateByExample(AcEmployeeAbsenceRecord record, AcEmployeeAbsenceRecordExample example);
}