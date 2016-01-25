package com.megaeyes.persistence.ibatis.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcAccessControlsExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    public AcAccessControlsExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    protected AcAccessControlsExample(AcAccessControlsExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table HBDW1.AC_ACCESS_CONTROLS
     *
     * @abatorgenerated Mon Jun 25 07:06:29 GMT 2012
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return this;
        }

        public Criteria andIdIn(List values) {
            addCriterion("ID in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List values) {
            addCriterion("ID not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List values) {
            addCriterion("NAME in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List values) {
            addCriterion("NAME not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return this;
        }

        public Criteria andOrganIdIsNull() {
            addCriterion("ORGAN_ID is null");
            return this;
        }

        public Criteria andOrganIdIsNotNull() {
            addCriterion("ORGAN_ID is not null");
            return this;
        }

        public Criteria andOrganIdEqualTo(String value) {
            addCriterion("ORGAN_ID =", value, "organId");
            return this;
        }

        public Criteria andOrganIdNotEqualTo(String value) {
            addCriterion("ORGAN_ID <>", value, "organId");
            return this;
        }

        public Criteria andOrganIdGreaterThan(String value) {
            addCriterion("ORGAN_ID >", value, "organId");
            return this;
        }

        public Criteria andOrganIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORGAN_ID >=", value, "organId");
            return this;
        }

        public Criteria andOrganIdLessThan(String value) {
            addCriterion("ORGAN_ID <", value, "organId");
            return this;
        }

        public Criteria andOrganIdLessThanOrEqualTo(String value) {
            addCriterion("ORGAN_ID <=", value, "organId");
            return this;
        }

        public Criteria andOrganIdLike(String value) {
            addCriterion("ORGAN_ID like", value, "organId");
            return this;
        }

        public Criteria andOrganIdNotLike(String value) {
            addCriterion("ORGAN_ID not like", value, "organId");
            return this;
        }

        public Criteria andOrganIdIn(List values) {
            addCriterion("ORGAN_ID in", values, "organId");
            return this;
        }

        public Criteria andOrganIdNotIn(List values) {
            addCriterion("ORGAN_ID not in", values, "organId");
            return this;
        }

        public Criteria andOrganIdBetween(String value1, String value2) {
            addCriterion("ORGAN_ID between", value1, value2, "organId");
            return this;
        }

        public Criteria andOrganIdNotBetween(String value1, String value2) {
            addCriterion("ORGAN_ID not between", value1, value2, "organId");
            return this;
        }

        public Criteria andNamingIsNull() {
            addCriterion("NAMING is null");
            return this;
        }

        public Criteria andNamingIsNotNull() {
            addCriterion("NAMING is not null");
            return this;
        }

        public Criteria andNamingEqualTo(String value) {
            addCriterion("NAMING =", value, "naming");
            return this;
        }

        public Criteria andNamingNotEqualTo(String value) {
            addCriterion("NAMING <>", value, "naming");
            return this;
        }

        public Criteria andNamingGreaterThan(String value) {
            addCriterion("NAMING >", value, "naming");
            return this;
        }

        public Criteria andNamingGreaterThanOrEqualTo(String value) {
            addCriterion("NAMING >=", value, "naming");
            return this;
        }

        public Criteria andNamingLessThan(String value) {
            addCriterion("NAMING <", value, "naming");
            return this;
        }

        public Criteria andNamingLessThanOrEqualTo(String value) {
            addCriterion("NAMING <=", value, "naming");
            return this;
        }

        public Criteria andNamingLike(String value) {
            addCriterion("NAMING like", value, "naming");
            return this;
        }

        public Criteria andNamingNotLike(String value) {
            addCriterion("NAMING not like", value, "naming");
            return this;
        }

        public Criteria andNamingIn(List values) {
            addCriterion("NAMING in", values, "naming");
            return this;
        }

        public Criteria andNamingNotIn(List values) {
            addCriterion("NAMING not in", values, "naming");
            return this;
        }

        public Criteria andNamingBetween(String value1, String value2) {
            addCriterion("NAMING between", value1, value2, "naming");
            return this;
        }

        public Criteria andNamingNotBetween(String value1, String value2) {
            addCriterion("NAMING not between", value1, value2, "naming");
            return this;
        }

        public Criteria andInstallLocationIsNull() {
            addCriterion("INSTALL_LOCATION is null");
            return this;
        }

        public Criteria andInstallLocationIsNotNull() {
            addCriterion("INSTALL_LOCATION is not null");
            return this;
        }

        public Criteria andInstallLocationEqualTo(String value) {
            addCriterion("INSTALL_LOCATION =", value, "installLocation");
            return this;
        }

        public Criteria andInstallLocationNotEqualTo(String value) {
            addCriterion("INSTALL_LOCATION <>", value, "installLocation");
            return this;
        }

        public Criteria andInstallLocationGreaterThan(String value) {
            addCriterion("INSTALL_LOCATION >", value, "installLocation");
            return this;
        }

        public Criteria andInstallLocationGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALL_LOCATION >=", value, "installLocation");
            return this;
        }

        public Criteria andInstallLocationLessThan(String value) {
            addCriterion("INSTALL_LOCATION <", value, "installLocation");
            return this;
        }

        public Criteria andInstallLocationLessThanOrEqualTo(String value) {
            addCriterion("INSTALL_LOCATION <=", value, "installLocation");
            return this;
        }

        public Criteria andInstallLocationLike(String value) {
            addCriterion("INSTALL_LOCATION like", value, "installLocation");
            return this;
        }

        public Criteria andInstallLocationNotLike(String value) {
            addCriterion("INSTALL_LOCATION not like", value, "installLocation");
            return this;
        }

        public Criteria andInstallLocationIn(List values) {
            addCriterion("INSTALL_LOCATION in", values, "installLocation");
            return this;
        }

        public Criteria andInstallLocationNotIn(List values) {
            addCriterion("INSTALL_LOCATION not in", values, "installLocation");
            return this;
        }

        public Criteria andInstallLocationBetween(String value1, String value2) {
            addCriterion("INSTALL_LOCATION between", value1, value2, "installLocation");
            return this;
        }

        public Criteria andInstallLocationNotBetween(String value1, String value2) {
            addCriterion("INSTALL_LOCATION not between", value1, value2, "installLocation");
            return this;
        }

        public Criteria andDeviceNumberIsNull() {
            addCriterion("DEVICE_NUMBER is null");
            return this;
        }

        public Criteria andDeviceNumberIsNotNull() {
            addCriterion("DEVICE_NUMBER is not null");
            return this;
        }

        public Criteria andDeviceNumberEqualTo(String value) {
            addCriterion("DEVICE_NUMBER =", value, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberNotEqualTo(String value) {
            addCriterion("DEVICE_NUMBER <>", value, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberGreaterThan(String value) {
            addCriterion("DEVICE_NUMBER >", value, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMBER >=", value, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberLessThan(String value) {
            addCriterion("DEVICE_NUMBER <", value, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMBER <=", value, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberLike(String value) {
            addCriterion("DEVICE_NUMBER like", value, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberNotLike(String value) {
            addCriterion("DEVICE_NUMBER not like", value, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberIn(List values) {
            addCriterion("DEVICE_NUMBER in", values, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberNotIn(List values) {
            addCriterion("DEVICE_NUMBER not in", values, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMBER between", value1, value2, "deviceNumber");
            return this;
        }

        public Criteria andDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMBER not between", value1, value2, "deviceNumber");
            return this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return this;
        }

        public Criteria andChannelIdIn(List values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return this;
        }

        public Criteria andChannelIdNotIn(List values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return this;
        }

        public Criteria andNoteIn(List values) {
            addCriterion("NOTE in", values, "note");
            return this;
        }

        public Criteria andNoteNotIn(List values) {
            addCriterion("NOTE not in", values, "note");
            return this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("DEVICE_TYPE is null");
            return this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("DEVICE_TYPE is not null");
            return this;
        }

        public Criteria andDeviceTypeEqualTo(Integer value) {
            addCriterion("DEVICE_TYPE =", value, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeNotEqualTo(Integer value) {
            addCriterion("DEVICE_TYPE <>", value, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeGreaterThan(Integer value) {
            addCriterion("DEVICE_TYPE >", value, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEVICE_TYPE >=", value, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeLessThan(Integer value) {
            addCriterion("DEVICE_TYPE <", value, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DEVICE_TYPE <=", value, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeIn(List values) {
            addCriterion("DEVICE_TYPE in", values, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeNotIn(List values) {
            addCriterion("DEVICE_TYPE not in", values, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeBetween(Integer value1, Integer value2) {
            addCriterion("DEVICE_TYPE between", value1, value2, "deviceType");
            return this;
        }

        public Criteria andDeviceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DEVICE_TYPE not between", value1, value2, "deviceType");
            return this;
        }

        public Criteria andAccessServerIdIsNull() {
            addCriterion("ACCESS_SERVER_ID is null");
            return this;
        }

        public Criteria andAccessServerIdIsNotNull() {
            addCriterion("ACCESS_SERVER_ID is not null");
            return this;
        }

        public Criteria andAccessServerIdEqualTo(String value) {
            addCriterion("ACCESS_SERVER_ID =", value, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdNotEqualTo(String value) {
            addCriterion("ACCESS_SERVER_ID <>", value, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdGreaterThan(String value) {
            addCriterion("ACCESS_SERVER_ID >", value, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_SERVER_ID >=", value, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdLessThan(String value) {
            addCriterion("ACCESS_SERVER_ID <", value, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_SERVER_ID <=", value, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdLike(String value) {
            addCriterion("ACCESS_SERVER_ID like", value, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdNotLike(String value) {
            addCriterion("ACCESS_SERVER_ID not like", value, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdIn(List values) {
            addCriterion("ACCESS_SERVER_ID in", values, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdNotIn(List values) {
            addCriterion("ACCESS_SERVER_ID not in", values, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdBetween(String value1, String value2) {
            addCriterion("ACCESS_SERVER_ID between", value1, value2, "accessServerId");
            return this;
        }

        public Criteria andAccessServerIdNotBetween(String value1, String value2) {
            addCriterion("ACCESS_SERVER_ID not between", value1, value2, "accessServerId");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List values) {
            addCriterion("STATUS in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List values) {
            addCriterion("STATUS not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return this;
        }

        public Criteria andTechnicalProtectionIsNull() {
            addCriterion("TECHNICAL_PROTECTION is null");
            return this;
        }

        public Criteria andTechnicalProtectionIsNotNull() {
            addCriterion("TECHNICAL_PROTECTION is not null");
            return this;
        }

        public Criteria andTechnicalProtectionEqualTo(String value) {
            addCriterion("TECHNICAL_PROTECTION =", value, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionNotEqualTo(String value) {
            addCriterion("TECHNICAL_PROTECTION <>", value, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionGreaterThan(String value) {
            addCriterion("TECHNICAL_PROTECTION >", value, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("TECHNICAL_PROTECTION >=", value, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionLessThan(String value) {
            addCriterion("TECHNICAL_PROTECTION <", value, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionLessThanOrEqualTo(String value) {
            addCriterion("TECHNICAL_PROTECTION <=", value, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionLike(String value) {
            addCriterion("TECHNICAL_PROTECTION like", value, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionNotLike(String value) {
            addCriterion("TECHNICAL_PROTECTION not like", value, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionIn(List values) {
            addCriterion("TECHNICAL_PROTECTION in", values, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionNotIn(List values) {
            addCriterion("TECHNICAL_PROTECTION not in", values, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionBetween(String value1, String value2) {
            addCriterion("TECHNICAL_PROTECTION between", value1, value2, "technicalProtection");
            return this;
        }

        public Criteria andTechnicalProtectionNotBetween(String value1, String value2) {
            addCriterion("TECHNICAL_PROTECTION not between", value1, value2, "technicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionIsNull() {
            addCriterion("PHYSICAL_PROTECTION is null");
            return this;
        }

        public Criteria andPhysicalProtectionIsNotNull() {
            addCriterion("PHYSICAL_PROTECTION is not null");
            return this;
        }

        public Criteria andPhysicalProtectionEqualTo(String value) {
            addCriterion("PHYSICAL_PROTECTION =", value, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionNotEqualTo(String value) {
            addCriterion("PHYSICAL_PROTECTION <>", value, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionGreaterThan(String value) {
            addCriterion("PHYSICAL_PROTECTION >", value, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("PHYSICAL_PROTECTION >=", value, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionLessThan(String value) {
            addCriterion("PHYSICAL_PROTECTION <", value, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionLessThanOrEqualTo(String value) {
            addCriterion("PHYSICAL_PROTECTION <=", value, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionLike(String value) {
            addCriterion("PHYSICAL_PROTECTION like", value, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionNotLike(String value) {
            addCriterion("PHYSICAL_PROTECTION not like", value, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionIn(List values) {
            addCriterion("PHYSICAL_PROTECTION in", values, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionNotIn(List values) {
            addCriterion("PHYSICAL_PROTECTION not in", values, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionBetween(String value1, String value2) {
            addCriterion("PHYSICAL_PROTECTION between", value1, value2, "physicalProtection");
            return this;
        }

        public Criteria andPhysicalProtectionNotBetween(String value1, String value2) {
            addCriterion("PHYSICAL_PROTECTION not between", value1, value2, "physicalProtection");
            return this;
        }

        public Criteria andRemoteOpenIsNull() {
            addCriterion("REMOTE_OPEN is null");
            return this;
        }

        public Criteria andRemoteOpenIsNotNull() {
            addCriterion("REMOTE_OPEN is not null");
            return this;
        }

        public Criteria andRemoteOpenEqualTo(String value) {
            addCriterion("REMOTE_OPEN =", value, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenNotEqualTo(String value) {
            addCriterion("REMOTE_OPEN <>", value, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenGreaterThan(String value) {
            addCriterion("REMOTE_OPEN >", value, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenGreaterThanOrEqualTo(String value) {
            addCriterion("REMOTE_OPEN >=", value, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenLessThan(String value) {
            addCriterion("REMOTE_OPEN <", value, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenLessThanOrEqualTo(String value) {
            addCriterion("REMOTE_OPEN <=", value, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenLike(String value) {
            addCriterion("REMOTE_OPEN like", value, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenNotLike(String value) {
            addCriterion("REMOTE_OPEN not like", value, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenIn(List values) {
            addCriterion("REMOTE_OPEN in", values, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenNotIn(List values) {
            addCriterion("REMOTE_OPEN not in", values, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenBetween(String value1, String value2) {
            addCriterion("REMOTE_OPEN between", value1, value2, "remoteOpen");
            return this;
        }

        public Criteria andRemoteOpenNotBetween(String value1, String value2) {
            addCriterion("REMOTE_OPEN not between", value1, value2, "remoteOpen");
            return this;
        }
    }
}