package com.megaeyes.persistence.ibatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EpTaskExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    public EpTaskExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    protected EpTaskExample(EpTaskExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
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
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table HBDW1.EP_TASK
     *
     * @abatorgenerated Fri May 11 15:42:53 CST 2012
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return this;
        }

        public Criteria andTypeEqualTo(BigDecimal value) {
            addCriterion("TYPE =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(BigDecimal value) {
            addCriterion("TYPE <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(BigDecimal value) {
            addCriterion("TYPE >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(BigDecimal value) {
            addCriterion("TYPE <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE <=", value, "type");
            return this;
        }

        public Criteria andTypeIn(List values) {
            addCriterion("TYPE in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List values) {
            addCriterion("TYPE not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(BigDecimal value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(BigDecimal value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(BigDecimal value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(BigDecimal value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("BRANCH_ID is null");
            return this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BRANCH_ID is not null");
            return this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("BRANCH_ID =", value, "branchId");
            return this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("BRANCH_ID <>", value, "branchId");
            return this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("BRANCH_ID >", value, "branchId");
            return this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID >=", value, "branchId");
            return this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("BRANCH_ID <", value, "branchId");
            return this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID <=", value, "branchId");
            return this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("BRANCH_ID like", value, "branchId");
            return this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("BRANCH_ID not like", value, "branchId");
            return this;
        }

        public Criteria andBranchIdIn(List values) {
            addCriterion("BRANCH_ID in", values, "branchId");
            return this;
        }

        public Criteria andBranchIdNotIn(List values) {
            addCriterion("BRANCH_ID not in", values, "branchId");
            return this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("BRANCH_ID between", value1, value2, "branchId");
            return this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("BRANCH_ID not between", value1, value2, "branchId");
            return this;
        }
    }
}