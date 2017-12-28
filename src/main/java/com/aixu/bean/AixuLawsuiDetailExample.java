package com.aixu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AixuLawsuiDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AixuLawsuiDetailExample() {
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

        public Criteria andLawsuitTpyeIsNull() {
            addCriterion("lawsuit_tpye is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeIsNotNull() {
            addCriterion("lawsuit_tpye is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeEqualTo(String value) {
            addCriterion("lawsuit_tpye =", value, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeNotEqualTo(String value) {
            addCriterion("lawsuit_tpye <>", value, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeGreaterThan(String value) {
            addCriterion("lawsuit_tpye >", value, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeGreaterThanOrEqualTo(String value) {
            addCriterion("lawsuit_tpye >=", value, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeLessThan(String value) {
            addCriterion("lawsuit_tpye <", value, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeLessThanOrEqualTo(String value) {
            addCriterion("lawsuit_tpye <=", value, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeLike(String value) {
            addCriterion("lawsuit_tpye like", value, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeNotLike(String value) {
            addCriterion("lawsuit_tpye not like", value, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeIn(List<String> values) {
            addCriterion("lawsuit_tpye in", values, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeNotIn(List<String> values) {
            addCriterion("lawsuit_tpye not in", values, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeBetween(String value1, String value2) {
            addCriterion("lawsuit_tpye between", value1, value2, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeNotBetween(String value1, String value2) {
            addCriterion("lawsuit_tpye not between", value1, value2, "lawsuitTpye");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailIsNull() {
            addCriterion("lawsuit_tpye_detail is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailIsNotNull() {
            addCriterion("lawsuit_tpye_detail is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailEqualTo(String value) {
            addCriterion("lawsuit_tpye_detail =", value, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailNotEqualTo(String value) {
            addCriterion("lawsuit_tpye_detail <>", value, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailGreaterThan(String value) {
            addCriterion("lawsuit_tpye_detail >", value, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("lawsuit_tpye_detail >=", value, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailLessThan(String value) {
            addCriterion("lawsuit_tpye_detail <", value, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailLessThanOrEqualTo(String value) {
            addCriterion("lawsuit_tpye_detail <=", value, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailLike(String value) {
            addCriterion("lawsuit_tpye_detail like", value, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailNotLike(String value) {
            addCriterion("lawsuit_tpye_detail not like", value, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailIn(List<String> values) {
            addCriterion("lawsuit_tpye_detail in", values, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailNotIn(List<String> values) {
            addCriterion("lawsuit_tpye_detail not in", values, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailBetween(String value1, String value2) {
            addCriterion("lawsuit_tpye_detail between", value1, value2, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andLawsuitTpyeDetailNotBetween(String value1, String value2) {
            addCriterion("lawsuit_tpye_detail not between", value1, value2, "lawsuitTpyeDetail");
            return (Criteria) this;
        }

        public Criteria andComplainMountIsNull() {
            addCriterion("complain_mount is null");
            return (Criteria) this;
        }

        public Criteria andComplainMountIsNotNull() {
            addCriterion("complain_mount is not null");
            return (Criteria) this;
        }

        public Criteria andComplainMountEqualTo(Integer value) {
            addCriterion("complain_mount =", value, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountNotEqualTo(Integer value) {
            addCriterion("complain_mount <>", value, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountGreaterThan(Integer value) {
            addCriterion("complain_mount >", value, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_mount >=", value, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountLessThan(Integer value) {
            addCriterion("complain_mount <", value, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountLessThanOrEqualTo(Integer value) {
            addCriterion("complain_mount <=", value, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountIn(List<Integer> values) {
            addCriterion("complain_mount in", values, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountNotIn(List<Integer> values) {
            addCriterion("complain_mount not in", values, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountBetween(Integer value1, Integer value2) {
            addCriterion("complain_mount between", value1, value2, "complainMount");
            return (Criteria) this;
        }

        public Criteria andComplainMountNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_mount not between", value1, value2, "complainMount");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("product_desc is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("product_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("product_desc =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("product_desc <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("product_desc >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("product_desc <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("product_desc <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("product_desc like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("product_desc not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("product_desc in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("product_desc not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("product_desc between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("product_desc not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andBadReasonIsNull() {
            addCriterion("bad_reason is null");
            return (Criteria) this;
        }

        public Criteria andBadReasonIsNotNull() {
            addCriterion("bad_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBadReasonEqualTo(String value) {
            addCriterion("bad_reason =", value, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonNotEqualTo(String value) {
            addCriterion("bad_reason <>", value, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonGreaterThan(String value) {
            addCriterion("bad_reason >", value, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonGreaterThanOrEqualTo(String value) {
            addCriterion("bad_reason >=", value, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonLessThan(String value) {
            addCriterion("bad_reason <", value, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonLessThanOrEqualTo(String value) {
            addCriterion("bad_reason <=", value, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonLike(String value) {
            addCriterion("bad_reason like", value, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonNotLike(String value) {
            addCriterion("bad_reason not like", value, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonIn(List<String> values) {
            addCriterion("bad_reason in", values, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonNotIn(List<String> values) {
            addCriterion("bad_reason not in", values, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonBetween(String value1, String value2) {
            addCriterion("bad_reason between", value1, value2, "badReason");
            return (Criteria) this;
        }

        public Criteria andBadReasonNotBetween(String value1, String value2) {
            addCriterion("bad_reason not between", value1, value2, "badReason");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyIsNull() {
            addCriterion("inner_strategy is null");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyIsNotNull() {
            addCriterion("inner_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyEqualTo(String value) {
            addCriterion("inner_strategy =", value, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyNotEqualTo(String value) {
            addCriterion("inner_strategy <>", value, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyGreaterThan(String value) {
            addCriterion("inner_strategy >", value, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("inner_strategy >=", value, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyLessThan(String value) {
            addCriterion("inner_strategy <", value, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyLessThanOrEqualTo(String value) {
            addCriterion("inner_strategy <=", value, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyLike(String value) {
            addCriterion("inner_strategy like", value, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyNotLike(String value) {
            addCriterion("inner_strategy not like", value, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyIn(List<String> values) {
            addCriterion("inner_strategy in", values, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyNotIn(List<String> values) {
            addCriterion("inner_strategy not in", values, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyBetween(String value1, String value2) {
            addCriterion("inner_strategy between", value1, value2, "innerStrategy");
            return (Criteria) this;
        }

        public Criteria andInnerStrategyNotBetween(String value1, String value2) {
            addCriterion("inner_strategy not between", value1, value2, "innerStrategy");
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