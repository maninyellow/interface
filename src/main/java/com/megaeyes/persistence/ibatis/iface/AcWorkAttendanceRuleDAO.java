package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.AcWorkAttendanceRule;
import com.megaeyes.persistence.ibatis.model.AcWorkAttendanceRuleExample;
import java.util.List;

public interface AcWorkAttendanceRuleDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    void insert(AcWorkAttendanceRule record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    int updateByPrimaryKey(AcWorkAttendanceRule record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    int updateByPrimaryKeySelective(AcWorkAttendanceRule record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    List selectByExample(AcWorkAttendanceRuleExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    AcWorkAttendanceRule selectByPrimaryKey(String id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    int deleteByExample(AcWorkAttendanceRuleExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    int countByExample(AcWorkAttendanceRuleExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    int updateByExampleSelective(AcWorkAttendanceRule record, AcWorkAttendanceRuleExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table AC_WORK_ATTENDANCE_RULE
     *
     * @abatorgenerated Wed Feb 27 11:11:31 CST 2013
     */
    int updateByExample(AcWorkAttendanceRule record, AcWorkAttendanceRuleExample example);
}