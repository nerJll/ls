package com.aixu.bean;

import java.util.ArrayList;
import java.util.List;

public class AixuZrrdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AixuZrrdExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
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
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andZrrdIdIsNull() {
            addCriterion("zrrd_id is null");
            return (Criteria) this;
        }

        public Criteria andZrrdIdIsNotNull() {
            addCriterion("zrrd_id is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdIdEqualTo(String value) {
            addCriterion("zrrd_id =", value, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdNotEqualTo(String value) {
            addCriterion("zrrd_id <>", value, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdGreaterThan(String value) {
            addCriterion("zrrd_id >", value, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdGreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_id >=", value, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdLessThan(String value) {
            addCriterion("zrrd_id <", value, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdLessThanOrEqualTo(String value) {
            addCriterion("zrrd_id <=", value, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdLike(String value) {
            addCriterion("zrrd_id like", value, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdNotLike(String value) {
            addCriterion("zrrd_id not like", value, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdIn(List<String> values) {
            addCriterion("zrrd_id in", values, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdNotIn(List<String> values) {
            addCriterion("zrrd_id not in", values, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdBetween(String value1, String value2) {
            addCriterion("zrrd_id between", value1, value2, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdIdNotBetween(String value1, String value2) {
            addCriterion("zrrd_id not between", value1, value2, "zrrdId");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaIsNull() {
            addCriterion("zrrd_sfla is null");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaIsNotNull() {
            addCriterion("zrrd_sfla is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaEqualTo(String value) {
            addCriterion("zrrd_sfla =", value, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaNotEqualTo(String value) {
            addCriterion("zrrd_sfla <>", value, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaGreaterThan(String value) {
            addCriterion("zrrd_sfla >", value, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaGreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_sfla >=", value, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaLessThan(String value) {
            addCriterion("zrrd_sfla <", value, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaLessThanOrEqualTo(String value) {
            addCriterion("zrrd_sfla <=", value, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaLike(String value) {
            addCriterion("zrrd_sfla like", value, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaNotLike(String value) {
            addCriterion("zrrd_sfla not like", value, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaIn(List<String> values) {
            addCriterion("zrrd_sfla in", values, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaNotIn(List<String> values) {
            addCriterion("zrrd_sfla not in", values, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaBetween(String value1, String value2) {
            addCriterion("zrrd_sfla between", value1, value2, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdSflaNotBetween(String value1, String value2) {
            addCriterion("zrrd_sfla not between", value1, value2, "zrrdSfla");
            return (Criteria) this;
        }

        public Criteria andZrrdXhIsNull() {
            addCriterion("zrrd_xh is null");
            return (Criteria) this;
        }

        public Criteria andZrrdXhIsNotNull() {
            addCriterion("zrrd_xh is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdXhEqualTo(Integer value) {
            addCriterion("zrrd_xh =", value, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhNotEqualTo(Integer value) {
            addCriterion("zrrd_xh <>", value, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhGreaterThan(Integer value) {
            addCriterion("zrrd_xh >", value, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhGreaterThanOrEqualTo(Integer value) {
            addCriterion("zrrd_xh >=", value, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhLessThan(Integer value) {
            addCriterion("zrrd_xh <", value, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhLessThanOrEqualTo(Integer value) {
            addCriterion("zrrd_xh <=", value, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhIn(List<Integer> values) {
            addCriterion("zrrd_xh in", values, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhNotIn(List<Integer> values) {
            addCriterion("zrrd_xh not in", values, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhBetween(Integer value1, Integer value2) {
            addCriterion("zrrd_xh between", value1, value2, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdXhNotBetween(Integer value1, Integer value2) {
            addCriterion("zrrd_xh not between", value1, value2, "zrrdXh");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmIsNull() {
            addCriterion("zrrd_zrbm is null");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmIsNotNull() {
            addCriterion("zrrd_zrbm is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmEqualTo(String value) {
            addCriterion("zrrd_zrbm =", value, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmNotEqualTo(String value) {
            addCriterion("zrrd_zrbm <>", value, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmGreaterThan(String value) {
            addCriterion("zrrd_zrbm >", value, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmGreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_zrbm >=", value, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmLessThan(String value) {
            addCriterion("zrrd_zrbm <", value, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmLessThanOrEqualTo(String value) {
            addCriterion("zrrd_zrbm <=", value, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmLike(String value) {
            addCriterion("zrrd_zrbm like", value, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmNotLike(String value) {
            addCriterion("zrrd_zrbm not like", value, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmIn(List<String> values) {
            addCriterion("zrrd_zrbm in", values, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmNotIn(List<String> values) {
            addCriterion("zrrd_zrbm not in", values, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmBetween(String value1, String value2) {
            addCriterion("zrrd_zrbm between", value1, value2, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrbmNotBetween(String value1, String value2) {
            addCriterion("zrrd_zrbm not between", value1, value2, "zrrdZrbm");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrIsNull() {
            addCriterion("zrrd_zrr is null");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrIsNotNull() {
            addCriterion("zrrd_zrr is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrEqualTo(String value) {
            addCriterion("zrrd_zrr =", value, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrNotEqualTo(String value) {
            addCriterion("zrrd_zrr <>", value, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrGreaterThan(String value) {
            addCriterion("zrrd_zrr >", value, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrGreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_zrr >=", value, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrLessThan(String value) {
            addCriterion("zrrd_zrr <", value, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrLessThanOrEqualTo(String value) {
            addCriterion("zrrd_zrr <=", value, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrLike(String value) {
            addCriterion("zrrd_zrr like", value, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrNotLike(String value) {
            addCriterion("zrrd_zrr not like", value, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrIn(List<String> values) {
            addCriterion("zrrd_zrr in", values, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrNotIn(List<String> values) {
            addCriterion("zrrd_zrr not in", values, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrBetween(String value1, String value2) {
            addCriterion("zrrd_zrr between", value1, value2, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdZrrNotBetween(String value1, String value2) {
            addCriterion("zrrd_zrr not between", value1, value2, "zrrdZrr");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjIsNull() {
            addCriterion("zrrd_clyj is null");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjIsNotNull() {
            addCriterion("zrrd_clyj is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjEqualTo(String value) {
            addCriterion("zrrd_clyj =", value, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjNotEqualTo(String value) {
            addCriterion("zrrd_clyj <>", value, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjGreaterThan(String value) {
            addCriterion("zrrd_clyj >", value, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjGreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_clyj >=", value, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjLessThan(String value) {
            addCriterion("zrrd_clyj <", value, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjLessThanOrEqualTo(String value) {
            addCriterion("zrrd_clyj <=", value, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjLike(String value) {
            addCriterion("zrrd_clyj like", value, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjNotLike(String value) {
            addCriterion("zrrd_clyj not like", value, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjIn(List<String> values) {
            addCriterion("zrrd_clyj in", values, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjNotIn(List<String> values) {
            addCriterion("zrrd_clyj not in", values, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjBetween(String value1, String value2) {
            addCriterion("zrrd_clyj between", value1, value2, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdClyjNotBetween(String value1, String value2) {
            addCriterion("zrrd_clyj not between", value1, value2, "zrrdClyj");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidIsNull() {
            addCriterion("zrrd_ksgldid is null");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidIsNotNull() {
            addCriterion("zrrd_ksgldid is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidEqualTo(String value) {
            addCriterion("zrrd_ksgldid =", value, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidNotEqualTo(String value) {
            addCriterion("zrrd_ksgldid <>", value, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidGreaterThan(String value) {
            addCriterion("zrrd_ksgldid >", value, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidGreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_ksgldid >=", value, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidLessThan(String value) {
            addCriterion("zrrd_ksgldid <", value, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidLessThanOrEqualTo(String value) {
            addCriterion("zrrd_ksgldid <=", value, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidLike(String value) {
            addCriterion("zrrd_ksgldid like", value, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidNotLike(String value) {
            addCriterion("zrrd_ksgldid not like", value, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidIn(List<String> values) {
            addCriterion("zrrd_ksgldid in", values, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidNotIn(List<String> values) {
            addCriterion("zrrd_ksgldid not in", values, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidBetween(String value1, String value2) {
            addCriterion("zrrd_ksgldid between", value1, value2, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdKsgldidNotBetween(String value1, String value2) {
            addCriterion("zrrd_ksgldid not between", value1, value2, "zrrdKsgldid");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1IsNull() {
            addCriterion("zrrd_yl1 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1IsNotNull() {
            addCriterion("zrrd_yl1 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1EqualTo(String value) {
            addCriterion("zrrd_yl1 =", value, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1NotEqualTo(String value) {
            addCriterion("zrrd_yl1 <>", value, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1GreaterThan(String value) {
            addCriterion("zrrd_yl1 >", value, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl1 >=", value, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1LessThan(String value) {
            addCriterion("zrrd_yl1 <", value, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl1 <=", value, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1Like(String value) {
            addCriterion("zrrd_yl1 like", value, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1NotLike(String value) {
            addCriterion("zrrd_yl1 not like", value, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1In(List<String> values) {
            addCriterion("zrrd_yl1 in", values, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1NotIn(List<String> values) {
            addCriterion("zrrd_yl1 not in", values, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1Between(String value1, String value2) {
            addCriterion("zrrd_yl1 between", value1, value2, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl1NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl1 not between", value1, value2, "zrrdYl1");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2IsNull() {
            addCriterion("zrrd_yl2 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2IsNotNull() {
            addCriterion("zrrd_yl2 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2EqualTo(String value) {
            addCriterion("zrrd_yl2 =", value, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2NotEqualTo(String value) {
            addCriterion("zrrd_yl2 <>", value, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2GreaterThan(String value) {
            addCriterion("zrrd_yl2 >", value, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl2 >=", value, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2LessThan(String value) {
            addCriterion("zrrd_yl2 <", value, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl2 <=", value, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2Like(String value) {
            addCriterion("zrrd_yl2 like", value, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2NotLike(String value) {
            addCriterion("zrrd_yl2 not like", value, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2In(List<String> values) {
            addCriterion("zrrd_yl2 in", values, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2NotIn(List<String> values) {
            addCriterion("zrrd_yl2 not in", values, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2Between(String value1, String value2) {
            addCriterion("zrrd_yl2 between", value1, value2, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl2NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl2 not between", value1, value2, "zrrdYl2");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3IsNull() {
            addCriterion("zrrd_yl3 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3IsNotNull() {
            addCriterion("zrrd_yl3 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3EqualTo(String value) {
            addCriterion("zrrd_yl3 =", value, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3NotEqualTo(String value) {
            addCriterion("zrrd_yl3 <>", value, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3GreaterThan(String value) {
            addCriterion("zrrd_yl3 >", value, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl3 >=", value, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3LessThan(String value) {
            addCriterion("zrrd_yl3 <", value, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl3 <=", value, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3Like(String value) {
            addCriterion("zrrd_yl3 like", value, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3NotLike(String value) {
            addCriterion("zrrd_yl3 not like", value, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3In(List<String> values) {
            addCriterion("zrrd_yl3 in", values, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3NotIn(List<String> values) {
            addCriterion("zrrd_yl3 not in", values, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3Between(String value1, String value2) {
            addCriterion("zrrd_yl3 between", value1, value2, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl3NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl3 not between", value1, value2, "zrrdYl3");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4IsNull() {
            addCriterion("zrrd_yl4 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4IsNotNull() {
            addCriterion("zrrd_yl4 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4EqualTo(String value) {
            addCriterion("zrrd_yl4 =", value, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4NotEqualTo(String value) {
            addCriterion("zrrd_yl4 <>", value, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4GreaterThan(String value) {
            addCriterion("zrrd_yl4 >", value, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl4 >=", value, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4LessThan(String value) {
            addCriterion("zrrd_yl4 <", value, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl4 <=", value, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4Like(String value) {
            addCriterion("zrrd_yl4 like", value, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4NotLike(String value) {
            addCriterion("zrrd_yl4 not like", value, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4In(List<String> values) {
            addCriterion("zrrd_yl4 in", values, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4NotIn(List<String> values) {
            addCriterion("zrrd_yl4 not in", values, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4Between(String value1, String value2) {
            addCriterion("zrrd_yl4 between", value1, value2, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl4NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl4 not between", value1, value2, "zrrdYl4");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5IsNull() {
            addCriterion("zrrd_yl5 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5IsNotNull() {
            addCriterion("zrrd_yl5 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5EqualTo(String value) {
            addCriterion("zrrd_yl5 =", value, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5NotEqualTo(String value) {
            addCriterion("zrrd_yl5 <>", value, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5GreaterThan(String value) {
            addCriterion("zrrd_yl5 >", value, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl5 >=", value, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5LessThan(String value) {
            addCriterion("zrrd_yl5 <", value, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl5 <=", value, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5Like(String value) {
            addCriterion("zrrd_yl5 like", value, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5NotLike(String value) {
            addCriterion("zrrd_yl5 not like", value, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5In(List<String> values) {
            addCriterion("zrrd_yl5 in", values, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5NotIn(List<String> values) {
            addCriterion("zrrd_yl5 not in", values, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5Between(String value1, String value2) {
            addCriterion("zrrd_yl5 between", value1, value2, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl5NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl5 not between", value1, value2, "zrrdYl5");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6IsNull() {
            addCriterion("zrrd_yl6 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6IsNotNull() {
            addCriterion("zrrd_yl6 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6EqualTo(String value) {
            addCriterion("zrrd_yl6 =", value, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6NotEqualTo(String value) {
            addCriterion("zrrd_yl6 <>", value, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6GreaterThan(String value) {
            addCriterion("zrrd_yl6 >", value, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl6 >=", value, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6LessThan(String value) {
            addCriterion("zrrd_yl6 <", value, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl6 <=", value, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6Like(String value) {
            addCriterion("zrrd_yl6 like", value, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6NotLike(String value) {
            addCriterion("zrrd_yl6 not like", value, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6In(List<String> values) {
            addCriterion("zrrd_yl6 in", values, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6NotIn(List<String> values) {
            addCriterion("zrrd_yl6 not in", values, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6Between(String value1, String value2) {
            addCriterion("zrrd_yl6 between", value1, value2, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl6NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl6 not between", value1, value2, "zrrdYl6");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7IsNull() {
            addCriterion("zrrd_yl7 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7IsNotNull() {
            addCriterion("zrrd_yl7 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7EqualTo(String value) {
            addCriterion("zrrd_yl7 =", value, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7NotEqualTo(String value) {
            addCriterion("zrrd_yl7 <>", value, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7GreaterThan(String value) {
            addCriterion("zrrd_yl7 >", value, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl7 >=", value, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7LessThan(String value) {
            addCriterion("zrrd_yl7 <", value, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl7 <=", value, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7Like(String value) {
            addCriterion("zrrd_yl7 like", value, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7NotLike(String value) {
            addCriterion("zrrd_yl7 not like", value, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7In(List<String> values) {
            addCriterion("zrrd_yl7 in", values, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7NotIn(List<String> values) {
            addCriterion("zrrd_yl7 not in", values, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7Between(String value1, String value2) {
            addCriterion("zrrd_yl7 between", value1, value2, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl7NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl7 not between", value1, value2, "zrrdYl7");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8IsNull() {
            addCriterion("zrrd_yl8 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8IsNotNull() {
            addCriterion("zrrd_yl8 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8EqualTo(String value) {
            addCriterion("zrrd_yl8 =", value, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8NotEqualTo(String value) {
            addCriterion("zrrd_yl8 <>", value, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8GreaterThan(String value) {
            addCriterion("zrrd_yl8 >", value, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl8 >=", value, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8LessThan(String value) {
            addCriterion("zrrd_yl8 <", value, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl8 <=", value, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8Like(String value) {
            addCriterion("zrrd_yl8 like", value, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8NotLike(String value) {
            addCriterion("zrrd_yl8 not like", value, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8In(List<String> values) {
            addCriterion("zrrd_yl8 in", values, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8NotIn(List<String> values) {
            addCriterion("zrrd_yl8 not in", values, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8Between(String value1, String value2) {
            addCriterion("zrrd_yl8 between", value1, value2, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl8NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl8 not between", value1, value2, "zrrdYl8");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9IsNull() {
            addCriterion("zrrd_yl9 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9IsNotNull() {
            addCriterion("zrrd_yl9 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9EqualTo(String value) {
            addCriterion("zrrd_yl9 =", value, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9NotEqualTo(String value) {
            addCriterion("zrrd_yl9 <>", value, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9GreaterThan(String value) {
            addCriterion("zrrd_yl9 >", value, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl9 >=", value, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9LessThan(String value) {
            addCriterion("zrrd_yl9 <", value, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl9 <=", value, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9Like(String value) {
            addCriterion("zrrd_yl9 like", value, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9NotLike(String value) {
            addCriterion("zrrd_yl9 not like", value, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9In(List<String> values) {
            addCriterion("zrrd_yl9 in", values, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9NotIn(List<String> values) {
            addCriterion("zrrd_yl9 not in", values, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9Between(String value1, String value2) {
            addCriterion("zrrd_yl9 between", value1, value2, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl9NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl9 not between", value1, value2, "zrrdYl9");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10IsNull() {
            addCriterion("zrrd_yl10 is null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10IsNotNull() {
            addCriterion("zrrd_yl10 is not null");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10EqualTo(String value) {
            addCriterion("zrrd_yl10 =", value, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10NotEqualTo(String value) {
            addCriterion("zrrd_yl10 <>", value, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10GreaterThan(String value) {
            addCriterion("zrrd_yl10 >", value, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10GreaterThanOrEqualTo(String value) {
            addCriterion("zrrd_yl10 >=", value, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10LessThan(String value) {
            addCriterion("zrrd_yl10 <", value, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10LessThanOrEqualTo(String value) {
            addCriterion("zrrd_yl10 <=", value, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10Like(String value) {
            addCriterion("zrrd_yl10 like", value, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10NotLike(String value) {
            addCriterion("zrrd_yl10 not like", value, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10In(List<String> values) {
            addCriterion("zrrd_yl10 in", values, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10NotIn(List<String> values) {
            addCriterion("zrrd_yl10 not in", values, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10Between(String value1, String value2) {
            addCriterion("zrrd_yl10 between", value1, value2, "zrrdYl10");
            return (Criteria) this;
        }

        public Criteria andZrrdYl10NotBetween(String value1, String value2) {
            addCriterion("zrrd_yl10 not between", value1, value2, "zrrdYl10");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}