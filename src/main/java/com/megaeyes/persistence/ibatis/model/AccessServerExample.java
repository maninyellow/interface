package com.megaeyes.persistence.ibatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessServerExample {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public AccessServerExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	protected AccessServerExample(AccessServerExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andOptimisticLockIsNull() {
			addCriterion("OPTIMISTIC_LOCK is null");
			return this;
		}

		public Criteria andOptimisticLockIsNotNull() {
			addCriterion("OPTIMISTIC_LOCK is not null");
			return this;
		}

		public Criteria andOptimisticLockEqualTo(BigDecimal value) {
			addCriterion("OPTIMISTIC_LOCK =", value, "optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockNotEqualTo(BigDecimal value) {
			addCriterion("OPTIMISTIC_LOCK <>", value, "optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockGreaterThan(BigDecimal value) {
			addCriterion("OPTIMISTIC_LOCK >", value, "optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("OPTIMISTIC_LOCK >=", value, "optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockLessThan(BigDecimal value) {
			addCriterion("OPTIMISTIC_LOCK <", value, "optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockLessThanOrEqualTo(BigDecimal value) {
			addCriterion("OPTIMISTIC_LOCK <=", value, "optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockIn(List values) {
			addCriterion("OPTIMISTIC_LOCK in", values, "optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockNotIn(List values) {
			addCriterion("OPTIMISTIC_LOCK not in", values, "optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("OPTIMISTIC_LOCK between", value1, value2,
					"optimisticLock");
			return this;
		}

		public Criteria andOptimisticLockNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("OPTIMISTIC_LOCK not between", value1, value2,
					"optimisticLock");
			return this;
		}

		public Criteria andNameIsNull() {
			addCriterion("F_NAME is null");
			return this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("F_NAME is not null");
			return this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("F_NAME =", value, "name");
			return this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("F_NAME <>", value, "name");
			return this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("F_NAME >", value, "name");
			return this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("F_NAME >=", value, "name");
			return this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("F_NAME <", value, "name");
			return this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("F_NAME <=", value, "name");
			return this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("F_NAME like", value, "name");
			return this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("F_NAME not like", value, "name");
			return this;
		}

		public Criteria andNameIn(List values) {
			addCriterion("F_NAME in", values, "name");
			return this;
		}

		public Criteria andNameNotIn(List values) {
			addCriterion("F_NAME not in", values, "name");
			return this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("F_NAME between", value1, value2, "name");
			return this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("F_NAME not between", value1, value2, "name");
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
			addCriterion("INSTALL_LOCATION between", value1, value2,
					"installLocation");
			return this;
		}

		public Criteria andInstallLocationNotBetween(String value1,
				String value2) {
			addCriterion("INSTALL_LOCATION not between", value1, value2,
					"installLocation");
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
			addCriterion("DEVICE_NUMBER between", value1, value2,
					"deviceNumber");
			return this;
		}

		public Criteria andDeviceNumberNotBetween(String value1, String value2) {
			addCriterion("DEVICE_NUMBER not between", value1, value2,
					"deviceNumber");
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

		public Criteria andIpIsNull() {
			addCriterion("IP is null");
			return this;
		}

		public Criteria andIpIsNotNull() {
			addCriterion("IP is not null");
			return this;
		}

		public Criteria andIpEqualTo(String value) {
			addCriterion("IP =", value, "ip");
			return this;
		}

		public Criteria andIpNotEqualTo(String value) {
			addCriterion("IP <>", value, "ip");
			return this;
		}

		public Criteria andIpGreaterThan(String value) {
			addCriterion("IP >", value, "ip");
			return this;
		}

		public Criteria andIpGreaterThanOrEqualTo(String value) {
			addCriterion("IP >=", value, "ip");
			return this;
		}

		public Criteria andIpLessThan(String value) {
			addCriterion("IP <", value, "ip");
			return this;
		}

		public Criteria andIpLessThanOrEqualTo(String value) {
			addCriterion("IP <=", value, "ip");
			return this;
		}

		public Criteria andIpLike(String value) {
			addCriterion("IP like", value, "ip");
			return this;
		}

		public Criteria andIpNotLike(String value) {
			addCriterion("IP not like", value, "ip");
			return this;
		}

		public Criteria andIpIn(List values) {
			addCriterion("IP in", values, "ip");
			return this;
		}

		public Criteria andIpNotIn(List values) {
			addCriterion("IP not in", values, "ip");
			return this;
		}

		public Criteria andIpBetween(String value1, String value2) {
			addCriterion("IP between", value1, value2, "ip");
			return this;
		}

		public Criteria andIpNotBetween(String value1, String value2) {
			addCriterion("IP not between", value1, value2, "ip");
			return this;
		}

		public Criteria andOOrganIdIsNull() {
			addCriterion("O_ORGAN_ID is null");
			return this;
		}

		public Criteria andOOrganIdIsNotNull() {
			addCriterion("O_ORGAN_ID is not null");
			return this;
		}

		public Criteria andOOrganIdEqualTo(String value) {
			addCriterion("O_ORGAN_ID =", value, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdNotEqualTo(String value) {
			addCriterion("O_ORGAN_ID <>", value, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdGreaterThan(String value) {
			addCriterion("O_ORGAN_ID >", value, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdGreaterThanOrEqualTo(String value) {
			addCriterion("O_ORGAN_ID >=", value, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdLessThan(String value) {
			addCriterion("O_ORGAN_ID <", value, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdLessThanOrEqualTo(String value) {
			addCriterion("O_ORGAN_ID <=", value, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdLike(String value) {
			addCriterion("O_ORGAN_ID like", value, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdNotLike(String value) {
			addCriterion("O_ORGAN_ID not like", value, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdIn(List values) {
			addCriterion("O_ORGAN_ID in", values, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdNotIn(List values) {
			addCriterion("O_ORGAN_ID not in", values, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdBetween(String value1, String value2) {
			addCriterion("O_ORGAN_ID between", value1, value2, "oOrganId");
			return this;
		}

		public Criteria andOOrganIdNotBetween(String value1, String value2) {
			addCriterion("O_ORGAN_ID not between", value1, value2, "oOrganId");
			return this;
		}

		public Criteria andStdIdIsNull() {
			addCriterion("STD_ID is null");
			return this;
		}

		public Criteria andStdIdIsNotNull() {
			addCriterion("STD_ID is not null");
			return this;
		}

		public Criteria andStdIdEqualTo(String value) {
			addCriterion("STD_ID =", value, "stdId");
			return this;
		}

		public Criteria andStdIdNotEqualTo(String value) {
			addCriterion("STD_ID <>", value, "stdId");
			return this;
		}

		public Criteria andStdIdGreaterThan(String value) {
			addCriterion("STD_ID >", value, "stdId");
			return this;
		}

		public Criteria andStdIdGreaterThanOrEqualTo(String value) {
			addCriterion("STD_ID >=", value, "stdId");
			return this;
		}

		public Criteria andStdIdLessThan(String value) {
			addCriterion("STD_ID <", value, "stdId");
			return this;
		}

		public Criteria andStdIdLessThanOrEqualTo(String value) {
			addCriterion("STD_ID <=", value, "stdId");
			return this;
		}

		public Criteria andStdIdLike(String value) {
			addCriterion("STD_ID like", value, "stdId");
			return this;
		}

		public Criteria andStdIdNotLike(String value) {
			addCriterion("STD_ID not like", value, "stdId");
			return this;
		}

		public Criteria andStdIdIn(List values) {
			addCriterion("STD_ID in", values, "stdId");
			return this;
		}

		public Criteria andStdIdNotIn(List values) {
			addCriterion("STD_ID not in", values, "stdId");
			return this;
		}

		public Criteria andStdIdBetween(String value1, String value2) {
			addCriterion("STD_ID between", value1, value2, "stdId");
			return this;
		}

		public Criteria andStdIdNotBetween(String value1, String value2) {
			addCriterion("STD_ID not between", value1, value2, "stdId");
			return this;
		}

		public Criteria andIp1IsNull() {
			addCriterion("IP1 is null");
			return this;
		}

		public Criteria andIp1IsNotNull() {
			addCriterion("IP1 is not null");
			return this;
		}

		public Criteria andIp1EqualTo(String value) {
			addCriterion("IP1 =", value, "ip1");
			return this;
		}

		public Criteria andIp1NotEqualTo(String value) {
			addCriterion("IP1 <>", value, "ip1");
			return this;
		}

		public Criteria andIp1GreaterThan(String value) {
			addCriterion("IP1 >", value, "ip1");
			return this;
		}

		public Criteria andIp1GreaterThanOrEqualTo(String value) {
			addCriterion("IP1 >=", value, "ip1");
			return this;
		}

		public Criteria andIp1LessThan(String value) {
			addCriterion("IP1 <", value, "ip1");
			return this;
		}

		public Criteria andIp1LessThanOrEqualTo(String value) {
			addCriterion("IP1 <=", value, "ip1");
			return this;
		}

		public Criteria andIp1Like(String value) {
			addCriterion("IP1 like", value, "ip1");
			return this;
		}

		public Criteria andIp1NotLike(String value) {
			addCriterion("IP1 not like", value, "ip1");
			return this;
		}

		public Criteria andIp1In(List values) {
			addCriterion("IP1 in", values, "ip1");
			return this;
		}

		public Criteria andIp1NotIn(List values) {
			addCriterion("IP1 not in", values, "ip1");
			return this;
		}

		public Criteria andIp1Between(String value1, String value2) {
			addCriterion("IP1 between", value1, value2, "ip1");
			return this;
		}

		public Criteria andIp1NotBetween(String value1, String value2) {
			addCriterion("IP1 not between", value1, value2, "ip1");
			return this;
		}

		public Criteria andLastUpdateTimeIsNull() {
			addCriterion("LAST_UPDATE_TIME is null");
			return this;
		}

		public Criteria andLastUpdateTimeIsNotNull() {
			addCriterion("LAST_UPDATE_TIME is not null");
			return this;
		}

		public Criteria andLastUpdateTimeEqualTo(BigDecimal value) {
			addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeNotEqualTo(BigDecimal value) {
			addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeGreaterThan(BigDecimal value) {
			addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeLessThan(BigDecimal value) {
			addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeIn(List values) {
			addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeNotIn(List values) {
			addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("LAST_UPDATE_TIME between", value1, value2,
					"lastUpdateTime");
			return this;
		}

		public Criteria andLastUpdateTimeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("LAST_UPDATE_TIME not between", value1, value2,
					"lastUpdateTime");
			return this;
		}
	}
}