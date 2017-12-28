package com.aixu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AixuCustomDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AixuCustomDoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCustomReduceIsNull() {
            addCriterion("custom_reduce is null");
            return (Criteria) this;
        }

        public Criteria andCustomReduceIsNotNull() {
            addCriterion("custom_reduce is not null");
            return (Criteria) this;
        }

        public Criteria andCustomReduceEqualTo(String value) {
            addCriterion("custom_reduce =", value, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceNotEqualTo(String value) {
            addCriterion("custom_reduce <>", value, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceGreaterThan(String value) {
            addCriterion("custom_reduce >", value, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceGreaterThanOrEqualTo(String value) {
            addCriterion("custom_reduce >=", value, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceLessThan(String value) {
            addCriterion("custom_reduce <", value, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceLessThanOrEqualTo(String value) {
            addCriterion("custom_reduce <=", value, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceLike(String value) {
            addCriterion("custom_reduce like", value, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceNotLike(String value) {
            addCriterion("custom_reduce not like", value, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceIn(List<String> values) {
            addCriterion("custom_reduce in", values, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceNotIn(List<String> values) {
            addCriterion("custom_reduce not in", values, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceBetween(String value1, String value2) {
            addCriterion("custom_reduce between", value1, value2, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomReduceNotBetween(String value1, String value2) {
            addCriterion("custom_reduce not between", value1, value2, "customReduce");
            return (Criteria) this;
        }

        public Criteria andCustomMountIsNull() {
            addCriterion("custom_mount is null");
            return (Criteria) this;
        }

        public Criteria andCustomMountIsNotNull() {
            addCriterion("custom_mount is not null");
            return (Criteria) this;
        }

        public Criteria andCustomMountEqualTo(Integer value) {
            addCriterion("custom_mount =", value, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountNotEqualTo(Integer value) {
            addCriterion("custom_mount <>", value, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountGreaterThan(Integer value) {
            addCriterion("custom_mount >", value, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_mount >=", value, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountLessThan(Integer value) {
            addCriterion("custom_mount <", value, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountLessThanOrEqualTo(Integer value) {
            addCriterion("custom_mount <=", value, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountIn(List<Integer> values) {
            addCriterion("custom_mount in", values, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountNotIn(List<Integer> values) {
            addCriterion("custom_mount not in", values, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountBetween(Integer value1, Integer value2) {
            addCriterion("custom_mount between", value1, value2, "customMount");
            return (Criteria) this;
        }

        public Criteria andCustomMountNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_mount not between", value1, value2, "customMount");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceIsNull() {
            addCriterion("judge_reduce is null");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceIsNotNull() {
            addCriterion("judge_reduce is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceEqualTo(String value) {
            addCriterion("judge_reduce =", value, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceNotEqualTo(String value) {
            addCriterion("judge_reduce <>", value, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceGreaterThan(String value) {
            addCriterion("judge_reduce >", value, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceGreaterThanOrEqualTo(String value) {
            addCriterion("judge_reduce >=", value, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceLessThan(String value) {
            addCriterion("judge_reduce <", value, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceLessThanOrEqualTo(String value) {
            addCriterion("judge_reduce <=", value, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceLike(String value) {
            addCriterion("judge_reduce like", value, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceNotLike(String value) {
            addCriterion("judge_reduce not like", value, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceIn(List<String> values) {
            addCriterion("judge_reduce in", values, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceNotIn(List<String> values) {
            addCriterion("judge_reduce not in", values, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceBetween(String value1, String value2) {
            addCriterion("judge_reduce between", value1, value2, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeReduceNotBetween(String value1, String value2) {
            addCriterion("judge_reduce not between", value1, value2, "judgeReduce");
            return (Criteria) this;
        }

        public Criteria andJudgeMountIsNull() {
            addCriterion("judge_mount is null");
            return (Criteria) this;
        }

        public Criteria andJudgeMountIsNotNull() {
            addCriterion("judge_mount is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeMountEqualTo(Integer value) {
            addCriterion("judge_mount =", value, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountNotEqualTo(Integer value) {
            addCriterion("judge_mount <>", value, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountGreaterThan(Integer value) {
            addCriterion("judge_mount >", value, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_mount >=", value, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountLessThan(Integer value) {
            addCriterion("judge_mount <", value, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountLessThanOrEqualTo(Integer value) {
            addCriterion("judge_mount <=", value, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountIn(List<Integer> values) {
            addCriterion("judge_mount in", values, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountNotIn(List<Integer> values) {
            addCriterion("judge_mount not in", values, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountBetween(Integer value1, Integer value2) {
            addCriterion("judge_mount between", value1, value2, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andJudgeMountNotBetween(Integer value1, Integer value2) {
            addCriterion("judge_mount not between", value1, value2, "judgeMount");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterionForJDBCDate("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterionForJDBCDate("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeIsNull() {
            addCriterion("oqc_judge is null");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeIsNotNull() {
            addCriterion("oqc_judge is not null");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeEqualTo(String value) {
            addCriterion("oqc_judge =", value, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeNotEqualTo(String value) {
            addCriterion("oqc_judge <>", value, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeGreaterThan(String value) {
            addCriterion("oqc_judge >", value, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("oqc_judge >=", value, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeLessThan(String value) {
            addCriterion("oqc_judge <", value, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeLessThanOrEqualTo(String value) {
            addCriterion("oqc_judge <=", value, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeLike(String value) {
            addCriterion("oqc_judge like", value, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeNotLike(String value) {
            addCriterion("oqc_judge not like", value, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeIn(List<String> values) {
            addCriterion("oqc_judge in", values, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeNotIn(List<String> values) {
            addCriterion("oqc_judge not in", values, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeBetween(String value1, String value2) {
            addCriterion("oqc_judge between", value1, value2, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcJudgeNotBetween(String value1, String value2) {
            addCriterion("oqc_judge not between", value1, value2, "oqcJudge");
            return (Criteria) this;
        }

        public Criteria andOqcResultIsNull() {
            addCriterion("oqc_result is null");
            return (Criteria) this;
        }

        public Criteria andOqcResultIsNotNull() {
            addCriterion("oqc_result is not null");
            return (Criteria) this;
        }

        public Criteria andOqcResultEqualTo(String value) {
            addCriterion("oqc_result =", value, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultNotEqualTo(String value) {
            addCriterion("oqc_result <>", value, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultGreaterThan(String value) {
            addCriterion("oqc_result >", value, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultGreaterThanOrEqualTo(String value) {
            addCriterion("oqc_result >=", value, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultLessThan(String value) {
            addCriterion("oqc_result <", value, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultLessThanOrEqualTo(String value) {
            addCriterion("oqc_result <=", value, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultLike(String value) {
            addCriterion("oqc_result like", value, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultNotLike(String value) {
            addCriterion("oqc_result not like", value, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultIn(List<String> values) {
            addCriterion("oqc_result in", values, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultNotIn(List<String> values) {
            addCriterion("oqc_result not in", values, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultBetween(String value1, String value2) {
            addCriterion("oqc_result between", value1, value2, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andOqcResultNotBetween(String value1, String value2) {
            addCriterion("oqc_result not between", value1, value2, "oqcResult");
            return (Criteria) this;
        }

        public Criteria andHandleStateIsNull() {
            addCriterion("handle_state is null");
            return (Criteria) this;
        }

        public Criteria andHandleStateIsNotNull() {
            addCriterion("handle_state is not null");
            return (Criteria) this;
        }

        public Criteria andHandleStateEqualTo(String value) {
            addCriterion("handle_state =", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotEqualTo(String value) {
            addCriterion("handle_state <>", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateGreaterThan(String value) {
            addCriterion("handle_state >", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateGreaterThanOrEqualTo(String value) {
            addCriterion("handle_state >=", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLessThan(String value) {
            addCriterion("handle_state <", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLessThanOrEqualTo(String value) {
            addCriterion("handle_state <=", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLike(String value) {
            addCriterion("handle_state like", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotLike(String value) {
            addCriterion("handle_state not like", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateIn(List<String> values) {
            addCriterion("handle_state in", values, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotIn(List<String> values) {
            addCriterion("handle_state not in", values, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateBetween(String value1, String value2) {
            addCriterion("handle_state between", value1, value2, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotBetween(String value1, String value2) {
            addCriterion("handle_state not between", value1, value2, "handleState");
            return (Criteria) this;
        }

        public Criteria andBaseIdIsNull() {
            addCriterion("base_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseIdIsNotNull() {
            addCriterion("base_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseIdEqualTo(String value) {
            addCriterion("base_id =", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotEqualTo(String value) {
            addCriterion("base_id <>", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThan(String value) {
            addCriterion("base_id >", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("base_id >=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThan(String value) {
            addCriterion("base_id <", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThanOrEqualTo(String value) {
            addCriterion("base_id <=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLike(String value) {
            addCriterion("base_id like", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotLike(String value) {
            addCriterion("base_id not like", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdIn(List<String> values) {
            addCriterion("base_id in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotIn(List<String> values) {
            addCriterion("base_id not in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdBetween(String value1, String value2) {
            addCriterion("base_id between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotBetween(String value1, String value2) {
            addCriterion("base_id not between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andResFourIsNull() {
            addCriterion("res_four is null");
            return (Criteria) this;
        }

        public Criteria andResFourIsNotNull() {
            addCriterion("res_four is not null");
            return (Criteria) this;
        }

        public Criteria andResFourEqualTo(String value) {
            addCriterion("res_four =", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourNotEqualTo(String value) {
            addCriterion("res_four <>", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourGreaterThan(String value) {
            addCriterion("res_four >", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourGreaterThanOrEqualTo(String value) {
            addCriterion("res_four >=", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourLessThan(String value) {
            addCriterion("res_four <", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourLessThanOrEqualTo(String value) {
            addCriterion("res_four <=", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourLike(String value) {
            addCriterion("res_four like", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourNotLike(String value) {
            addCriterion("res_four not like", value, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourIn(List<String> values) {
            addCriterion("res_four in", values, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourNotIn(List<String> values) {
            addCriterion("res_four not in", values, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourBetween(String value1, String value2) {
            addCriterion("res_four between", value1, value2, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFourNotBetween(String value1, String value2) {
            addCriterion("res_four not between", value1, value2, "resFour");
            return (Criteria) this;
        }

        public Criteria andResFiveIsNull() {
            addCriterion("res_five is null");
            return (Criteria) this;
        }

        public Criteria andResFiveIsNotNull() {
            addCriterion("res_five is not null");
            return (Criteria) this;
        }

        public Criteria andResFiveEqualTo(String value) {
            addCriterion("res_five =", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveNotEqualTo(String value) {
            addCriterion("res_five <>", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveGreaterThan(String value) {
            addCriterion("res_five >", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveGreaterThanOrEqualTo(String value) {
            addCriterion("res_five >=", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveLessThan(String value) {
            addCriterion("res_five <", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveLessThanOrEqualTo(String value) {
            addCriterion("res_five <=", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveLike(String value) {
            addCriterion("res_five like", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveNotLike(String value) {
            addCriterion("res_five not like", value, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveIn(List<String> values) {
            addCriterion("res_five in", values, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveNotIn(List<String> values) {
            addCriterion("res_five not in", values, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveBetween(String value1, String value2) {
            addCriterion("res_five between", value1, value2, "resFive");
            return (Criteria) this;
        }

        public Criteria andResFiveNotBetween(String value1, String value2) {
            addCriterion("res_five not between", value1, value2, "resFive");
            return (Criteria) this;
        }

        public Criteria andResSixIsNull() {
            addCriterion("res_six is null");
            return (Criteria) this;
        }

        public Criteria andResSixIsNotNull() {
            addCriterion("res_six is not null");
            return (Criteria) this;
        }

        public Criteria andResSixEqualTo(String value) {
            addCriterion("res_six =", value, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixNotEqualTo(String value) {
            addCriterion("res_six <>", value, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixGreaterThan(String value) {
            addCriterion("res_six >", value, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixGreaterThanOrEqualTo(String value) {
            addCriterion("res_six >=", value, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixLessThan(String value) {
            addCriterion("res_six <", value, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixLessThanOrEqualTo(String value) {
            addCriterion("res_six <=", value, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixLike(String value) {
            addCriterion("res_six like", value, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixNotLike(String value) {
            addCriterion("res_six not like", value, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixIn(List<String> values) {
            addCriterion("res_six in", values, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixNotIn(List<String> values) {
            addCriterion("res_six not in", values, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixBetween(String value1, String value2) {
            addCriterion("res_six between", value1, value2, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSixNotBetween(String value1, String value2) {
            addCriterion("res_six not between", value1, value2, "resSix");
            return (Criteria) this;
        }

        public Criteria andResSevenIsNull() {
            addCriterion("res_seven is null");
            return (Criteria) this;
        }

        public Criteria andResSevenIsNotNull() {
            addCriterion("res_seven is not null");
            return (Criteria) this;
        }

        public Criteria andResSevenEqualTo(String value) {
            addCriterion("res_seven =", value, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenNotEqualTo(String value) {
            addCriterion("res_seven <>", value, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenGreaterThan(String value) {
            addCriterion("res_seven >", value, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenGreaterThanOrEqualTo(String value) {
            addCriterion("res_seven >=", value, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenLessThan(String value) {
            addCriterion("res_seven <", value, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenLessThanOrEqualTo(String value) {
            addCriterion("res_seven <=", value, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenLike(String value) {
            addCriterion("res_seven like", value, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenNotLike(String value) {
            addCriterion("res_seven not like", value, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenIn(List<String> values) {
            addCriterion("res_seven in", values, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenNotIn(List<String> values) {
            addCriterion("res_seven not in", values, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenBetween(String value1, String value2) {
            addCriterion("res_seven between", value1, value2, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResSevenNotBetween(String value1, String value2) {
            addCriterion("res_seven not between", value1, value2, "resSeven");
            return (Criteria) this;
        }

        public Criteria andResEightIsNull() {
            addCriterion("res_eight is null");
            return (Criteria) this;
        }

        public Criteria andResEightIsNotNull() {
            addCriterion("res_eight is not null");
            return (Criteria) this;
        }

        public Criteria andResEightEqualTo(String value) {
            addCriterion("res_eight =", value, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightNotEqualTo(String value) {
            addCriterion("res_eight <>", value, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightGreaterThan(String value) {
            addCriterion("res_eight >", value, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightGreaterThanOrEqualTo(String value) {
            addCriterion("res_eight >=", value, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightLessThan(String value) {
            addCriterion("res_eight <", value, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightLessThanOrEqualTo(String value) {
            addCriterion("res_eight <=", value, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightLike(String value) {
            addCriterion("res_eight like", value, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightNotLike(String value) {
            addCriterion("res_eight not like", value, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightIn(List<String> values) {
            addCriterion("res_eight in", values, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightNotIn(List<String> values) {
            addCriterion("res_eight not in", values, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightBetween(String value1, String value2) {
            addCriterion("res_eight between", value1, value2, "resEight");
            return (Criteria) this;
        }

        public Criteria andResEightNotBetween(String value1, String value2) {
            addCriterion("res_eight not between", value1, value2, "resEight");
            return (Criteria) this;
        }

        public Criteria andResNineIsNull() {
            addCriterion("res_nine is null");
            return (Criteria) this;
        }

        public Criteria andResNineIsNotNull() {
            addCriterion("res_nine is not null");
            return (Criteria) this;
        }

        public Criteria andResNineEqualTo(String value) {
            addCriterion("res_nine =", value, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineNotEqualTo(String value) {
            addCriterion("res_nine <>", value, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineGreaterThan(String value) {
            addCriterion("res_nine >", value, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineGreaterThanOrEqualTo(String value) {
            addCriterion("res_nine >=", value, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineLessThan(String value) {
            addCriterion("res_nine <", value, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineLessThanOrEqualTo(String value) {
            addCriterion("res_nine <=", value, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineLike(String value) {
            addCriterion("res_nine like", value, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineNotLike(String value) {
            addCriterion("res_nine not like", value, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineIn(List<String> values) {
            addCriterion("res_nine in", values, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineNotIn(List<String> values) {
            addCriterion("res_nine not in", values, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineBetween(String value1, String value2) {
            addCriterion("res_nine between", value1, value2, "resNine");
            return (Criteria) this;
        }

        public Criteria andResNineNotBetween(String value1, String value2) {
            addCriterion("res_nine not between", value1, value2, "resNine");
            return (Criteria) this;
        }

        public Criteria andResTenIsNull() {
            addCriterion("res_ten is null");
            return (Criteria) this;
        }

        public Criteria andResTenIsNotNull() {
            addCriterion("res_ten is not null");
            return (Criteria) this;
        }

        public Criteria andResTenEqualTo(String value) {
            addCriterion("res_ten =", value, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenNotEqualTo(String value) {
            addCriterion("res_ten <>", value, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenGreaterThan(String value) {
            addCriterion("res_ten >", value, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenGreaterThanOrEqualTo(String value) {
            addCriterion("res_ten >=", value, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenLessThan(String value) {
            addCriterion("res_ten <", value, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenLessThanOrEqualTo(String value) {
            addCriterion("res_ten <=", value, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenLike(String value) {
            addCriterion("res_ten like", value, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenNotLike(String value) {
            addCriterion("res_ten not like", value, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenIn(List<String> values) {
            addCriterion("res_ten in", values, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenNotIn(List<String> values) {
            addCriterion("res_ten not in", values, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenBetween(String value1, String value2) {
            addCriterion("res_ten between", value1, value2, "resTen");
            return (Criteria) this;
        }

        public Criteria andResTenNotBetween(String value1, String value2) {
            addCriterion("res_ten not between", value1, value2, "resTen");
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