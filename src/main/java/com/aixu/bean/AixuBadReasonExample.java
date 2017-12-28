package com.aixu.bean;

import java.util.ArrayList;
import java.util.List;

public class AixuBadReasonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AixuBadReasonExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andResOneIsNull() {
            addCriterion("res_one is null");
            return (Criteria) this;
        }

        public Criteria andResOneIsNotNull() {
            addCriterion("res_one is not null");
            return (Criteria) this;
        }

        public Criteria andResOneEqualTo(String value) {
            addCriterion("res_one =", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotEqualTo(String value) {
            addCriterion("res_one <>", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneGreaterThan(String value) {
            addCriterion("res_one >", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneGreaterThanOrEqualTo(String value) {
            addCriterion("res_one >=", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLessThan(String value) {
            addCriterion("res_one <", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLessThanOrEqualTo(String value) {
            addCriterion("res_one <=", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLike(String value) {
            addCriterion("res_one like", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotLike(String value) {
            addCriterion("res_one not like", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneIn(List<String> values) {
            addCriterion("res_one in", values, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotIn(List<String> values) {
            addCriterion("res_one not in", values, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneBetween(String value1, String value2) {
            addCriterion("res_one between", value1, value2, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotBetween(String value1, String value2) {
            addCriterion("res_one not between", value1, value2, "resOne");
            return (Criteria) this;
        }

        public Criteria andResTwoIsNull() {
            addCriterion("res_two is null");
            return (Criteria) this;
        }

        public Criteria andResTwoIsNotNull() {
            addCriterion("res_two is not null");
            return (Criteria) this;
        }

        public Criteria andResTwoEqualTo(String value) {
            addCriterion("res_two =", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotEqualTo(String value) {
            addCriterion("res_two <>", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoGreaterThan(String value) {
            addCriterion("res_two >", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoGreaterThanOrEqualTo(String value) {
            addCriterion("res_two >=", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLessThan(String value) {
            addCriterion("res_two <", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLessThanOrEqualTo(String value) {
            addCriterion("res_two <=", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLike(String value) {
            addCriterion("res_two like", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotLike(String value) {
            addCriterion("res_two not like", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoIn(List<String> values) {
            addCriterion("res_two in", values, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotIn(List<String> values) {
            addCriterion("res_two not in", values, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoBetween(String value1, String value2) {
            addCriterion("res_two between", value1, value2, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotBetween(String value1, String value2) {
            addCriterion("res_two not between", value1, value2, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResThreeIsNull() {
            addCriterion("res_three is null");
            return (Criteria) this;
        }

        public Criteria andResThreeIsNotNull() {
            addCriterion("res_three is not null");
            return (Criteria) this;
        }

        public Criteria andResThreeEqualTo(String value) {
            addCriterion("res_three =", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotEqualTo(String value) {
            addCriterion("res_three <>", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeGreaterThan(String value) {
            addCriterion("res_three >", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeGreaterThanOrEqualTo(String value) {
            addCriterion("res_three >=", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLessThan(String value) {
            addCriterion("res_three <", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLessThanOrEqualTo(String value) {
            addCriterion("res_three <=", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeLike(String value) {
            addCriterion("res_three like", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotLike(String value) {
            addCriterion("res_three not like", value, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeIn(List<String> values) {
            addCriterion("res_three in", values, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotIn(List<String> values) {
            addCriterion("res_three not in", values, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeBetween(String value1, String value2) {
            addCriterion("res_three between", value1, value2, "resThree");
            return (Criteria) this;
        }

        public Criteria andResThreeNotBetween(String value1, String value2) {
            addCriterion("res_three not between", value1, value2, "resThree");
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