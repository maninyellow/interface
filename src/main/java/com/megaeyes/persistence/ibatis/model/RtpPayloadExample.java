package com.megaeyes.persistence.ibatis.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RtpPayloadExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    private String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    private List oredCriteria = new ArrayList();

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public Criteria createCriteria() {
        Criteria criteria = new Criteria();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table RTP_PAYLOAD
     *
     * @abatorgenerated Mon May 07 14:46:18 CST 2012
     */
    public static class Criteria {
        private List criteriaWithoutValue;

        private List criteriaWithSingleValue;

        private List criteriaWithListValue;

        private List criteriaWithBetweenValue;

        private Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
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

        private void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        private void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        private void addCriterion(String condition, Object value1, Object value2, String property) {
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
            criteriaWithoutValue.add("ID is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            criteriaWithoutValue.add("ID is not null");
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

        public Criteria andPayloadIsNull() {
            criteriaWithoutValue.add("PAYLOAD is null");
            return this;
        }

        public Criteria andPayloadIsNotNull() {
            criteriaWithoutValue.add("PAYLOAD is not null");
            return this;
        }

        public Criteria andPayloadEqualTo(String value) {
            addCriterion("PAYLOAD =", value, "payload");
            return this;
        }

        public Criteria andPayloadNotEqualTo(String value) {
            addCriterion("PAYLOAD <>", value, "payload");
            return this;
        }

        public Criteria andPayloadGreaterThan(String value) {
            addCriterion("PAYLOAD >", value, "payload");
            return this;
        }

        public Criteria andPayloadGreaterThanOrEqualTo(String value) {
            addCriterion("PAYLOAD >=", value, "payload");
            return this;
        }

        public Criteria andPayloadLessThan(String value) {
            addCriterion("PAYLOAD <", value, "payload");
            return this;
        }

        public Criteria andPayloadLessThanOrEqualTo(String value) {
            addCriterion("PAYLOAD <=", value, "payload");
            return this;
        }

        public Criteria andPayloadLike(String value) {
            addCriterion("PAYLOAD like", value, "payload");
            return this;
        }

        public Criteria andPayloadNotLike(String value) {
            addCriterion("PAYLOAD not like", value, "payload");
            return this;
        }

        public Criteria andPayloadIn(List values) {
            addCriterion("PAYLOAD in", values, "payload");
            return this;
        }

        public Criteria andPayloadNotIn(List values) {
            addCriterion("PAYLOAD not in", values, "payload");
            return this;
        }

        public Criteria andPayloadBetween(String value1, String value2) {
            addCriterion("PAYLOAD between", value1, value2, "payload");
            return this;
        }

        public Criteria andPayloadNotBetween(String value1, String value2) {
            addCriterion("PAYLOAD not between", value1, value2, "payload");
            return this;
        }

        public Criteria andEncodeNameIsNull() {
            criteriaWithoutValue.add("ENCODE_NAME is null");
            return this;
        }

        public Criteria andEncodeNameIsNotNull() {
            criteriaWithoutValue.add("ENCODE_NAME is not null");
            return this;
        }

        public Criteria andEncodeNameEqualTo(String value) {
            addCriterion("ENCODE_NAME =", value, "encodeName");
            return this;
        }

        public Criteria andEncodeNameNotEqualTo(String value) {
            addCriterion("ENCODE_NAME <>", value, "encodeName");
            return this;
        }

        public Criteria andEncodeNameGreaterThan(String value) {
            addCriterion("ENCODE_NAME >", value, "encodeName");
            return this;
        }

        public Criteria andEncodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENCODE_NAME >=", value, "encodeName");
            return this;
        }

        public Criteria andEncodeNameLessThan(String value) {
            addCriterion("ENCODE_NAME <", value, "encodeName");
            return this;
        }

        public Criteria andEncodeNameLessThanOrEqualTo(String value) {
            addCriterion("ENCODE_NAME <=", value, "encodeName");
            return this;
        }

        public Criteria andEncodeNameLike(String value) {
            addCriterion("ENCODE_NAME like", value, "encodeName");
            return this;
        }

        public Criteria andEncodeNameNotLike(String value) {
            addCriterion("ENCODE_NAME not like", value, "encodeName");
            return this;
        }

        public Criteria andEncodeNameIn(List values) {
            addCriterion("ENCODE_NAME in", values, "encodeName");
            return this;
        }

        public Criteria andEncodeNameNotIn(List values) {
            addCriterion("ENCODE_NAME not in", values, "encodeName");
            return this;
        }

        public Criteria andEncodeNameBetween(String value1, String value2) {
            addCriterion("ENCODE_NAME between", value1, value2, "encodeName");
            return this;
        }

        public Criteria andEncodeNameNotBetween(String value1, String value2) {
            addCriterion("ENCODE_NAME not between", value1, value2, "encodeName");
            return this;
        }

        public Criteria andFrequencyIsNull() {
            criteriaWithoutValue.add("FREQUENCY is null");
            return this;
        }

        public Criteria andFrequencyIsNotNull() {
            criteriaWithoutValue.add("FREQUENCY is not null");
            return this;
        }

        public Criteria andFrequencyEqualTo(Integer value) {
            addCriterion("FREQUENCY =", value, "frequency");
            return this;
        }

        public Criteria andFrequencyNotEqualTo(Integer value) {
            addCriterion("FREQUENCY <>", value, "frequency");
            return this;
        }

        public Criteria andFrequencyGreaterThan(Integer value) {
            addCriterion("FREQUENCY >", value, "frequency");
            return this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("FREQUENCY >=", value, "frequency");
            return this;
        }

        public Criteria andFrequencyLessThan(Integer value) {
            addCriterion("FREQUENCY <", value, "frequency");
            return this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("FREQUENCY <=", value, "frequency");
            return this;
        }

        public Criteria andFrequencyIn(List values) {
            addCriterion("FREQUENCY in", values, "frequency");
            return this;
        }

        public Criteria andFrequencyNotIn(List values) {
            addCriterion("FREQUENCY not in", values, "frequency");
            return this;
        }

        public Criteria andFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("FREQUENCY between", value1, value2, "frequency");
            return this;
        }

        public Criteria andFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("FREQUENCY not between", value1, value2, "frequency");
            return this;
        }

        public Criteria andBase64IsNull() {
            criteriaWithoutValue.add("BASE64 is null");
            return this;
        }

        public Criteria andBase64IsNotNull() {
            criteriaWithoutValue.add("BASE64 is not null");
            return this;
        }

        public Criteria andBase64EqualTo(String value) {
            addCriterion("BASE64 =", value, "base64");
            return this;
        }

        public Criteria andBase64NotEqualTo(String value) {
            addCriterion("BASE64 <>", value, "base64");
            return this;
        }

        public Criteria andBase64GreaterThan(String value) {
            addCriterion("BASE64 >", value, "base64");
            return this;
        }

        public Criteria andBase64GreaterThanOrEqualTo(String value) {
            addCriterion("BASE64 >=", value, "base64");
            return this;
        }

        public Criteria andBase64LessThan(String value) {
            addCriterion("BASE64 <", value, "base64");
            return this;
        }

        public Criteria andBase64LessThanOrEqualTo(String value) {
            addCriterion("BASE64 <=", value, "base64");
            return this;
        }

        public Criteria andBase64Like(String value) {
            addCriterion("BASE64 like", value, "base64");
            return this;
        }

        public Criteria andBase64NotLike(String value) {
            addCriterion("BASE64 not like", value, "base64");
            return this;
        }

        public Criteria andBase64In(List values) {
            addCriterion("BASE64 in", values, "base64");
            return this;
        }

        public Criteria andBase64NotIn(List values) {
            addCriterion("BASE64 not in", values, "base64");
            return this;
        }

        public Criteria andBase64Between(String value1, String value2) {
            addCriterion("BASE64 between", value1, value2, "base64");
            return this;
        }

        public Criteria andBase64NotBetween(String value1, String value2) {
            addCriterion("BASE64 not between", value1, value2, "base64");
            return this;
        }

        public Criteria andNoteIsNull() {
            criteriaWithoutValue.add("NOTE is null");
            return this;
        }

        public Criteria andNoteIsNotNull() {
            criteriaWithoutValue.add("NOTE is not null");
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

        public Criteria andFmtpPublicIsNull() {
            criteriaWithoutValue.add("FMTP_PUBLIC is null");
            return this;
        }

        public Criteria andFmtpPublicIsNotNull() {
            criteriaWithoutValue.add("FMTP_PUBLIC is not null");
            return this;
        }

        public Criteria andFmtpPublicEqualTo(String value) {
            addCriterion("FMTP_PUBLIC =", value, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicNotEqualTo(String value) {
            addCriterion("FMTP_PUBLIC <>", value, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicGreaterThan(String value) {
            addCriterion("FMTP_PUBLIC >", value, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicGreaterThanOrEqualTo(String value) {
            addCriterion("FMTP_PUBLIC >=", value, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicLessThan(String value) {
            addCriterion("FMTP_PUBLIC <", value, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicLessThanOrEqualTo(String value) {
            addCriterion("FMTP_PUBLIC <=", value, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicLike(String value) {
            addCriterion("FMTP_PUBLIC like", value, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicNotLike(String value) {
            addCriterion("FMTP_PUBLIC not like", value, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicIn(List values) {
            addCriterion("FMTP_PUBLIC in", values, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicNotIn(List values) {
            addCriterion("FMTP_PUBLIC not in", values, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicBetween(String value1, String value2) {
            addCriterion("FMTP_PUBLIC between", value1, value2, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPublicNotBetween(String value1, String value2) {
            addCriterion("FMTP_PUBLIC not between", value1, value2, "fmtpPublic");
            return this;
        }

        public Criteria andFmtpPrivateIsNull() {
            criteriaWithoutValue.add("FMTP_PRIVATE is null");
            return this;
        }

        public Criteria andFmtpPrivateIsNotNull() {
            criteriaWithoutValue.add("FMTP_PRIVATE is not null");
            return this;
        }

        public Criteria andFmtpPrivateEqualTo(String value) {
            addCriterion("FMTP_PRIVATE =", value, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateNotEqualTo(String value) {
            addCriterion("FMTP_PRIVATE <>", value, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateGreaterThan(String value) {
            addCriterion("FMTP_PRIVATE >", value, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateGreaterThanOrEqualTo(String value) {
            addCriterion("FMTP_PRIVATE >=", value, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateLessThan(String value) {
            addCriterion("FMTP_PRIVATE <", value, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateLessThanOrEqualTo(String value) {
            addCriterion("FMTP_PRIVATE <=", value, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateLike(String value) {
            addCriterion("FMTP_PRIVATE like", value, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateNotLike(String value) {
            addCriterion("FMTP_PRIVATE not like", value, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateIn(List values) {
            addCriterion("FMTP_PRIVATE in", values, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateNotIn(List values) {
            addCriterion("FMTP_PRIVATE not in", values, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateBetween(String value1, String value2) {
            addCriterion("FMTP_PRIVATE between", value1, value2, "fmtpPrivate");
            return this;
        }

        public Criteria andFmtpPrivateNotBetween(String value1, String value2) {
            addCriterion("FMTP_PRIVATE not between", value1, value2, "fmtpPrivate");
            return this;
        }
    }
}