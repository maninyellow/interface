package com.megaeyes.persistence.ibatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganExample {
    protected String orderByClause;

    protected List oredCriteria;

    public OrganExample() {
        oredCriteria = new ArrayList();
    }

    protected OrganExample(OrganExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public List getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
    }

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

        public Criteria andOptimisticLockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPTIMISTIC_LOCK between", value1, value2, "optimisticLock");
            return this;
        }

        public Criteria andOptimisticLockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPTIMISTIC_LOCK not between", value1, value2, "optimisticLock");
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

        public Criteria andParentOrganIdIsNull() {
            addCriterion("PARENT_ORGAN_ID is null");
            return this;
        }

        public Criteria andParentOrganIdIsNotNull() {
            addCriterion("PARENT_ORGAN_ID is not null");
            return this;
        }

        public Criteria andParentOrganIdEqualTo(String value) {
            addCriterion("PARENT_ORGAN_ID =", value, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdNotEqualTo(String value) {
            addCriterion("PARENT_ORGAN_ID <>", value, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdGreaterThan(String value) {
            addCriterion("PARENT_ORGAN_ID >", value, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ORGAN_ID >=", value, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdLessThan(String value) {
            addCriterion("PARENT_ORGAN_ID <", value, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ORGAN_ID <=", value, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdLike(String value) {
            addCriterion("PARENT_ORGAN_ID like", value, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdNotLike(String value) {
            addCriterion("PARENT_ORGAN_ID not like", value, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdIn(List values) {
            addCriterion("PARENT_ORGAN_ID in", values, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdNotIn(List values) {
            addCriterion("PARENT_ORGAN_ID not in", values, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdBetween(String value1, String value2) {
            addCriterion("PARENT_ORGAN_ID between", value1, value2, "parentOrganId");
            return this;
        }

        public Criteria andParentOrganIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ORGAN_ID not between", value1, value2, "parentOrganId");
            return this;
        }

        public Criteria andPathIsNull() {
            addCriterion("PATH is null");
            return this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("PATH is not null");
            return this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("PATH =", value, "path");
            return this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("PATH <>", value, "path");
            return this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("PATH >", value, "path");
            return this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "path");
            return this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("PATH <", value, "path");
            return this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "path");
            return this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("PATH like", value, "path");
            return this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("PATH not like", value, "path");
            return this;
        }

        public Criteria andPathIn(List values) {
            addCriterion("PATH in", values, "path");
            return this;
        }

        public Criteria andPathNotIn(List values) {
            addCriterion("PATH not in", values, "path");
            return this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "path");
            return this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "path");
            return this;
        }
    }
}