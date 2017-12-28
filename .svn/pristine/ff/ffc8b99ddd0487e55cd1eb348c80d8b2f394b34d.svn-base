package com.aixu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AixuNbzgdcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AixuNbzgdcExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andNbzgdcIdIsNull() {
            addCriterion("nbzgdc_id is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdIsNotNull() {
            addCriterion("nbzgdc_id is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdEqualTo(String value) {
            addCriterion("nbzgdc_id =", value, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdNotEqualTo(String value) {
            addCriterion("nbzgdc_id <>", value, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdGreaterThan(String value) {
            addCriterion("nbzgdc_id >", value, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdGreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_id >=", value, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdLessThan(String value) {
            addCriterion("nbzgdc_id <", value, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdLessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_id <=", value, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdLike(String value) {
            addCriterion("nbzgdc_id like", value, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdNotLike(String value) {
            addCriterion("nbzgdc_id not like", value, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdIn(List<String> values) {
            addCriterion("nbzgdc_id in", values, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdNotIn(List<String> values) {
            addCriterion("nbzgdc_id not in", values, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdBetween(String value1, String value2) {
            addCriterion("nbzgdc_id between", value1, value2, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcIdNotBetween(String value1, String value2) {
            addCriterion("nbzgdc_id not between", value1, value2, "nbzgdcId");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhIsNull() {
            addCriterion("nbzgdc_xh is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhIsNotNull() {
            addCriterion("nbzgdc_xh is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhEqualTo(Integer value) {
            addCriterion("nbzgdc_xh =", value, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhNotEqualTo(Integer value) {
            addCriterion("nbzgdc_xh <>", value, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhGreaterThan(Integer value) {
            addCriterion("nbzgdc_xh >", value, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhGreaterThanOrEqualTo(Integer value) {
            addCriterion("nbzgdc_xh >=", value, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhLessThan(Integer value) {
            addCriterion("nbzgdc_xh <", value, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhLessThanOrEqualTo(Integer value) {
            addCriterion("nbzgdc_xh <=", value, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhIn(List<Integer> values) {
            addCriterion("nbzgdc_xh in", values, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhNotIn(List<Integer> values) {
            addCriterion("nbzgdc_xh not in", values, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhBetween(Integer value1, Integer value2) {
            addCriterion("nbzgdc_xh between", value1, value2, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcXhNotBetween(Integer value1, Integer value2) {
            addCriterion("nbzgdc_xh not between", value1, value2, "nbzgdcXh");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxIsNull() {
            addCriterion("nbzgdc_lx is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxIsNotNull() {
            addCriterion("nbzgdc_lx is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxEqualTo(String value) {
            addCriterion("nbzgdc_lx =", value, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxNotEqualTo(String value) {
            addCriterion("nbzgdc_lx <>", value, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxGreaterThan(String value) {
            addCriterion("nbzgdc_lx >", value, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxGreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_lx >=", value, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxLessThan(String value) {
            addCriterion("nbzgdc_lx <", value, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxLessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_lx <=", value, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxLike(String value) {
            addCriterion("nbzgdc_lx like", value, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxNotLike(String value) {
            addCriterion("nbzgdc_lx not like", value, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxIn(List<String> values) {
            addCriterion("nbzgdc_lx in", values, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxNotIn(List<String> values) {
            addCriterion("nbzgdc_lx not in", values, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxBetween(String value1, String value2) {
            addCriterion("nbzgdc_lx between", value1, value2, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcLxNotBetween(String value1, String value2) {
            addCriterion("nbzgdc_lx not between", value1, value2, "nbzgdcLx");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaIsNull() {
            addCriterion("nbzgdc_fa is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaIsNotNull() {
            addCriterion("nbzgdc_fa is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaEqualTo(String value) {
            addCriterion("nbzgdc_fa =", value, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaNotEqualTo(String value) {
            addCriterion("nbzgdc_fa <>", value, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaGreaterThan(String value) {
            addCriterion("nbzgdc_fa >", value, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaGreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_fa >=", value, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaLessThan(String value) {
            addCriterion("nbzgdc_fa <", value, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaLessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_fa <=", value, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaLike(String value) {
            addCriterion("nbzgdc_fa like", value, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaNotLike(String value) {
            addCriterion("nbzgdc_fa not like", value, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaIn(List<String> values) {
            addCriterion("nbzgdc_fa in", values, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaNotIn(List<String> values) {
            addCriterion("nbzgdc_fa not in", values, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaBetween(String value1, String value2) {
            addCriterion("nbzgdc_fa between", value1, value2, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcFaNotBetween(String value1, String value2) {
            addCriterion("nbzgdc_fa not between", value1, value2, "nbzgdcFa");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmIsNull() {
            addCriterion("nbzgdc_zrbm is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmIsNotNull() {
            addCriterion("nbzgdc_zrbm is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmEqualTo(String value) {
            addCriterion("nbzgdc_zrbm =", value, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmNotEqualTo(String value) {
            addCriterion("nbzgdc_zrbm <>", value, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmGreaterThan(String value) {
            addCriterion("nbzgdc_zrbm >", value, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmGreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_zrbm >=", value, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmLessThan(String value) {
            addCriterion("nbzgdc_zrbm <", value, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmLessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_zrbm <=", value, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmLike(String value) {
            addCriterion("nbzgdc_zrbm like", value, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmNotLike(String value) {
            addCriterion("nbzgdc_zrbm not like", value, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmIn(List<String> values) {
            addCriterion("nbzgdc_zrbm in", values, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmNotIn(List<String> values) {
            addCriterion("nbzgdc_zrbm not in", values, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmBetween(String value1, String value2) {
            addCriterion("nbzgdc_zrbm between", value1, value2, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrbmNotBetween(String value1, String value2) {
            addCriterion("nbzgdc_zrbm not between", value1, value2, "nbzgdcZrbm");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrIsNull() {
            addCriterion("nbzgdc_zrr is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrIsNotNull() {
            addCriterion("nbzgdc_zrr is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrEqualTo(String value) {
            addCriterion("nbzgdc_zrr =", value, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrNotEqualTo(String value) {
            addCriterion("nbzgdc_zrr <>", value, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrGreaterThan(String value) {
            addCriterion("nbzgdc_zrr >", value, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrGreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_zrr >=", value, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrLessThan(String value) {
            addCriterion("nbzgdc_zrr <", value, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrLessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_zrr <=", value, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrLike(String value) {
            addCriterion("nbzgdc_zrr like", value, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrNotLike(String value) {
            addCriterion("nbzgdc_zrr not like", value, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrIn(List<String> values) {
            addCriterion("nbzgdc_zrr in", values, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrNotIn(List<String> values) {
            addCriterion("nbzgdc_zrr not in", values, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrBetween(String value1, String value2) {
            addCriterion("nbzgdc_zrr between", value1, value2, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZrrNotBetween(String value1, String value2) {
            addCriterion("nbzgdc_zrr not between", value1, value2, "nbzgdcZrr");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjIsNull() {
            addCriterion("nbzgdc_wcsj is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjIsNotNull() {
            addCriterion("nbzgdc_wcsj is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjEqualTo(Date value) {
            addCriterionForJDBCDate("nbzgdc_wcsj =", value, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("nbzgdc_wcsj <>", value, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjGreaterThan(Date value) {
            addCriterionForJDBCDate("nbzgdc_wcsj >", value, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nbzgdc_wcsj >=", value, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjLessThan(Date value) {
            addCriterionForJDBCDate("nbzgdc_wcsj <", value, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nbzgdc_wcsj <=", value, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjIn(List<Date> values) {
            addCriterionForJDBCDate("nbzgdc_wcsj in", values, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("nbzgdc_wcsj not in", values, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nbzgdc_wcsj between", value1, value2, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcWcsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nbzgdc_wcsj not between", value1, value2, "nbzgdcWcsj");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtIsNull() {
            addCriterion("nbzgdc_zt is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtIsNotNull() {
            addCriterion("nbzgdc_zt is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtEqualTo(String value) {
            addCriterion("nbzgdc_zt =", value, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtNotEqualTo(String value) {
            addCriterion("nbzgdc_zt <>", value, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtGreaterThan(String value) {
            addCriterion("nbzgdc_zt >", value, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtGreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_zt >=", value, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtLessThan(String value) {
            addCriterion("nbzgdc_zt <", value, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtLessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_zt <=", value, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtLike(String value) {
            addCriterion("nbzgdc_zt like", value, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtNotLike(String value) {
            addCriterion("nbzgdc_zt not like", value, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtIn(List<String> values) {
            addCriterion("nbzgdc_zt in", values, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtNotIn(List<String> values) {
            addCriterion("nbzgdc_zt not in", values, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtBetween(String value1, String value2) {
            addCriterion("nbzgdc_zt between", value1, value2, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcZtNotBetween(String value1, String value2) {
            addCriterion("nbzgdc_zt not between", value1, value2, "nbzgdcZt");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidIsNull() {
            addCriterion("nbzgdc_ksgldid is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidIsNotNull() {
            addCriterion("nbzgdc_ksgldid is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidEqualTo(String value) {
            addCriterion("nbzgdc_ksgldid =", value, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidNotEqualTo(String value) {
            addCriterion("nbzgdc_ksgldid <>", value, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidGreaterThan(String value) {
            addCriterion("nbzgdc_ksgldid >", value, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidGreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_ksgldid >=", value, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidLessThan(String value) {
            addCriterion("nbzgdc_ksgldid <", value, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidLessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_ksgldid <=", value, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidLike(String value) {
            addCriterion("nbzgdc_ksgldid like", value, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidNotLike(String value) {
            addCriterion("nbzgdc_ksgldid not like", value, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidIn(List<String> values) {
            addCriterion("nbzgdc_ksgldid in", values, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidNotIn(List<String> values) {
            addCriterion("nbzgdc_ksgldid not in", values, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidBetween(String value1, String value2) {
            addCriterion("nbzgdc_ksgldid between", value1, value2, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcKsgldidNotBetween(String value1, String value2) {
            addCriterion("nbzgdc_ksgldid not between", value1, value2, "nbzgdcKsgldid");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1IsNull() {
            addCriterion("nbzgdc_yl1 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1IsNotNull() {
            addCriterion("nbzgdc_yl1 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1EqualTo(String value) {
            addCriterion("nbzgdc_yl1 =", value, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1NotEqualTo(String value) {
            addCriterion("nbzgdc_yl1 <>", value, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1GreaterThan(String value) {
            addCriterion("nbzgdc_yl1 >", value, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl1 >=", value, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1LessThan(String value) {
            addCriterion("nbzgdc_yl1 <", value, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl1 <=", value, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1Like(String value) {
            addCriterion("nbzgdc_yl1 like", value, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1NotLike(String value) {
            addCriterion("nbzgdc_yl1 not like", value, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1In(List<String> values) {
            addCriterion("nbzgdc_yl1 in", values, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1NotIn(List<String> values) {
            addCriterion("nbzgdc_yl1 not in", values, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1Between(String value1, String value2) {
            addCriterion("nbzgdc_yl1 between", value1, value2, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl1NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl1 not between", value1, value2, "nbzgdcYl1");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2IsNull() {
            addCriterion("nbzgdc_yl2 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2IsNotNull() {
            addCriterion("nbzgdc_yl2 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2EqualTo(String value) {
            addCriterion("nbzgdc_yl2 =", value, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2NotEqualTo(String value) {
            addCriterion("nbzgdc_yl2 <>", value, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2GreaterThan(String value) {
            addCriterion("nbzgdc_yl2 >", value, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl2 >=", value, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2LessThan(String value) {
            addCriterion("nbzgdc_yl2 <", value, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl2 <=", value, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2Like(String value) {
            addCriterion("nbzgdc_yl2 like", value, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2NotLike(String value) {
            addCriterion("nbzgdc_yl2 not like", value, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2In(List<String> values) {
            addCriterion("nbzgdc_yl2 in", values, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2NotIn(List<String> values) {
            addCriterion("nbzgdc_yl2 not in", values, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2Between(String value1, String value2) {
            addCriterion("nbzgdc_yl2 between", value1, value2, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl2NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl2 not between", value1, value2, "nbzgdcYl2");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3IsNull() {
            addCriterion("nbzgdc_yl3 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3IsNotNull() {
            addCriterion("nbzgdc_yl3 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3EqualTo(String value) {
            addCriterion("nbzgdc_yl3 =", value, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3NotEqualTo(String value) {
            addCriterion("nbzgdc_yl3 <>", value, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3GreaterThan(String value) {
            addCriterion("nbzgdc_yl3 >", value, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl3 >=", value, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3LessThan(String value) {
            addCriterion("nbzgdc_yl3 <", value, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl3 <=", value, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3Like(String value) {
            addCriterion("nbzgdc_yl3 like", value, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3NotLike(String value) {
            addCriterion("nbzgdc_yl3 not like", value, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3In(List<String> values) {
            addCriterion("nbzgdc_yl3 in", values, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3NotIn(List<String> values) {
            addCriterion("nbzgdc_yl3 not in", values, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3Between(String value1, String value2) {
            addCriterion("nbzgdc_yl3 between", value1, value2, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl3NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl3 not between", value1, value2, "nbzgdcYl3");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4IsNull() {
            addCriterion("nbzgdc_yl4 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4IsNotNull() {
            addCriterion("nbzgdc_yl4 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4EqualTo(String value) {
            addCriterion("nbzgdc_yl4 =", value, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4NotEqualTo(String value) {
            addCriterion("nbzgdc_yl4 <>", value, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4GreaterThan(String value) {
            addCriterion("nbzgdc_yl4 >", value, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl4 >=", value, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4LessThan(String value) {
            addCriterion("nbzgdc_yl4 <", value, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl4 <=", value, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4Like(String value) {
            addCriterion("nbzgdc_yl4 like", value, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4NotLike(String value) {
            addCriterion("nbzgdc_yl4 not like", value, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4In(List<String> values) {
            addCriterion("nbzgdc_yl4 in", values, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4NotIn(List<String> values) {
            addCriterion("nbzgdc_yl4 not in", values, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4Between(String value1, String value2) {
            addCriterion("nbzgdc_yl4 between", value1, value2, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl4NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl4 not between", value1, value2, "nbzgdcYl4");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5IsNull() {
            addCriterion("nbzgdc_yl5 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5IsNotNull() {
            addCriterion("nbzgdc_yl5 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5EqualTo(String value) {
            addCriterion("nbzgdc_yl5 =", value, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5NotEqualTo(String value) {
            addCriterion("nbzgdc_yl5 <>", value, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5GreaterThan(String value) {
            addCriterion("nbzgdc_yl5 >", value, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl5 >=", value, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5LessThan(String value) {
            addCriterion("nbzgdc_yl5 <", value, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl5 <=", value, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5Like(String value) {
            addCriterion("nbzgdc_yl5 like", value, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5NotLike(String value) {
            addCriterion("nbzgdc_yl5 not like", value, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5In(List<String> values) {
            addCriterion("nbzgdc_yl5 in", values, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5NotIn(List<String> values) {
            addCriterion("nbzgdc_yl5 not in", values, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5Between(String value1, String value2) {
            addCriterion("nbzgdc_yl5 between", value1, value2, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl5NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl5 not between", value1, value2, "nbzgdcYl5");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6IsNull() {
            addCriterion("nbzgdc_yl6 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6IsNotNull() {
            addCriterion("nbzgdc_yl6 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6EqualTo(String value) {
            addCriterion("nbzgdc_yl6 =", value, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6NotEqualTo(String value) {
            addCriterion("nbzgdc_yl6 <>", value, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6GreaterThan(String value) {
            addCriterion("nbzgdc_yl6 >", value, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl6 >=", value, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6LessThan(String value) {
            addCriterion("nbzgdc_yl6 <", value, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl6 <=", value, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6Like(String value) {
            addCriterion("nbzgdc_yl6 like", value, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6NotLike(String value) {
            addCriterion("nbzgdc_yl6 not like", value, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6In(List<String> values) {
            addCriterion("nbzgdc_yl6 in", values, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6NotIn(List<String> values) {
            addCriterion("nbzgdc_yl6 not in", values, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6Between(String value1, String value2) {
            addCriterion("nbzgdc_yl6 between", value1, value2, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl6NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl6 not between", value1, value2, "nbzgdcYl6");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7IsNull() {
            addCriterion("nbzgdc_yl7 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7IsNotNull() {
            addCriterion("nbzgdc_yl7 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7EqualTo(String value) {
            addCriterion("nbzgdc_yl7 =", value, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7NotEqualTo(String value) {
            addCriterion("nbzgdc_yl7 <>", value, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7GreaterThan(String value) {
            addCriterion("nbzgdc_yl7 >", value, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl7 >=", value, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7LessThan(String value) {
            addCriterion("nbzgdc_yl7 <", value, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl7 <=", value, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7Like(String value) {
            addCriterion("nbzgdc_yl7 like", value, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7NotLike(String value) {
            addCriterion("nbzgdc_yl7 not like", value, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7In(List<String> values) {
            addCriterion("nbzgdc_yl7 in", values, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7NotIn(List<String> values) {
            addCriterion("nbzgdc_yl7 not in", values, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7Between(String value1, String value2) {
            addCriterion("nbzgdc_yl7 between", value1, value2, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl7NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl7 not between", value1, value2, "nbzgdcYl7");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8IsNull() {
            addCriterion("nbzgdc_yl8 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8IsNotNull() {
            addCriterion("nbzgdc_yl8 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8EqualTo(String value) {
            addCriterion("nbzgdc_yl8 =", value, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8NotEqualTo(String value) {
            addCriterion("nbzgdc_yl8 <>", value, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8GreaterThan(String value) {
            addCriterion("nbzgdc_yl8 >", value, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl8 >=", value, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8LessThan(String value) {
            addCriterion("nbzgdc_yl8 <", value, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl8 <=", value, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8Like(String value) {
            addCriterion("nbzgdc_yl8 like", value, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8NotLike(String value) {
            addCriterion("nbzgdc_yl8 not like", value, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8In(List<String> values) {
            addCriterion("nbzgdc_yl8 in", values, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8NotIn(List<String> values) {
            addCriterion("nbzgdc_yl8 not in", values, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8Between(String value1, String value2) {
            addCriterion("nbzgdc_yl8 between", value1, value2, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl8NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl8 not between", value1, value2, "nbzgdcYl8");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9IsNull() {
            addCriterion("nbzgdc_yl9 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9IsNotNull() {
            addCriterion("nbzgdc_yl9 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9EqualTo(String value) {
            addCriterion("nbzgdc_yl9 =", value, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9NotEqualTo(String value) {
            addCriterion("nbzgdc_yl9 <>", value, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9GreaterThan(String value) {
            addCriterion("nbzgdc_yl9 >", value, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl9 >=", value, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9LessThan(String value) {
            addCriterion("nbzgdc_yl9 <", value, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl9 <=", value, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9Like(String value) {
            addCriterion("nbzgdc_yl9 like", value, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9NotLike(String value) {
            addCriterion("nbzgdc_yl9 not like", value, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9In(List<String> values) {
            addCriterion("nbzgdc_yl9 in", values, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9NotIn(List<String> values) {
            addCriterion("nbzgdc_yl9 not in", values, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9Between(String value1, String value2) {
            addCriterion("nbzgdc_yl9 between", value1, value2, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl9NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl9 not between", value1, value2, "nbzgdcYl9");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10IsNull() {
            addCriterion("nbzgdc_yl10 is null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10IsNotNull() {
            addCriterion("nbzgdc_yl10 is not null");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10EqualTo(String value) {
            addCriterion("nbzgdc_yl10 =", value, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10NotEqualTo(String value) {
            addCriterion("nbzgdc_yl10 <>", value, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10GreaterThan(String value) {
            addCriterion("nbzgdc_yl10 >", value, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10GreaterThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl10 >=", value, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10LessThan(String value) {
            addCriterion("nbzgdc_yl10 <", value, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10LessThanOrEqualTo(String value) {
            addCriterion("nbzgdc_yl10 <=", value, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10Like(String value) {
            addCriterion("nbzgdc_yl10 like", value, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10NotLike(String value) {
            addCriterion("nbzgdc_yl10 not like", value, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10In(List<String> values) {
            addCriterion("nbzgdc_yl10 in", values, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10NotIn(List<String> values) {
            addCriterion("nbzgdc_yl10 not in", values, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10Between(String value1, String value2) {
            addCriterion("nbzgdc_yl10 between", value1, value2, "nbzgdcYl10");
            return (Criteria) this;
        }

        public Criteria andNbzgdcYl10NotBetween(String value1, String value2) {
            addCriterion("nbzgdc_yl10 not between", value1, value2, "nbzgdcYl10");
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