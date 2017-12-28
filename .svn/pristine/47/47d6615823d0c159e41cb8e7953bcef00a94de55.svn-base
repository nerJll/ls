package com.aixu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AixuBaseLawsuitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AixuBaseLawsuitExample() {
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

        public Criteria andLawsuitNoIsNull() {
            addCriterion("lawsuit_no is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoIsNotNull() {
            addCriterion("lawsuit_no is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoEqualTo(String value) {
            addCriterion("lawsuit_no =", value, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoNotEqualTo(String value) {
            addCriterion("lawsuit_no <>", value, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoGreaterThan(String value) {
            addCriterion("lawsuit_no >", value, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoGreaterThanOrEqualTo(String value) {
            addCriterion("lawsuit_no >=", value, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoLessThan(String value) {
            addCriterion("lawsuit_no <", value, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoLessThanOrEqualTo(String value) {
            addCriterion("lawsuit_no <=", value, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoLike(String value) {
            addCriterion("lawsuit_no like", value, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoNotLike(String value) {
            addCriterion("lawsuit_no not like", value, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoIn(List<String> values) {
            addCriterion("lawsuit_no in", values, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoNotIn(List<String> values) {
            addCriterion("lawsuit_no not in", values, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoBetween(String value1, String value2) {
            addCriterion("lawsuit_no between", value1, value2, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andLawsuitNoNotBetween(String value1, String value2) {
            addCriterion("lawsuit_no not between", value1, value2, "lawsuitNo");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNull() {
            addCriterion("custom_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNotNull() {
            addCriterion("custom_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNameEqualTo(String value) {
            addCriterion("custom_name =", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotEqualTo(String value) {
            addCriterion("custom_name <>", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThan(String value) {
            addCriterion("custom_name >", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("custom_name >=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThan(String value) {
            addCriterion("custom_name <", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThanOrEqualTo(String value) {
            addCriterion("custom_name <=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLike(String value) {
            addCriterion("custom_name like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotLike(String value) {
            addCriterion("custom_name not like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameIn(List<String> values) {
            addCriterion("custom_name in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotIn(List<String> values) {
            addCriterion("custom_name not in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameBetween(String value1, String value2) {
            addCriterion("custom_name between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotBetween(String value1, String value2) {
            addCriterion("custom_name not between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNoIsNull() {
            addCriterion("custom_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomNoIsNotNull() {
            addCriterion("custom_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNoEqualTo(String value) {
            addCriterion("custom_no =", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoNotEqualTo(String value) {
            addCriterion("custom_no <>", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoGreaterThan(String value) {
            addCriterion("custom_no >", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoGreaterThanOrEqualTo(String value) {
            addCriterion("custom_no >=", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoLessThan(String value) {
            addCriterion("custom_no <", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoLessThanOrEqualTo(String value) {
            addCriterion("custom_no <=", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoLike(String value) {
            addCriterion("custom_no like", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoNotLike(String value) {
            addCriterion("custom_no not like", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoIn(List<String> values) {
            addCriterion("custom_no in", values, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoNotIn(List<String> values) {
            addCriterion("custom_no not in", values, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoBetween(String value1, String value2) {
            addCriterion("custom_no between", value1, value2, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoNotBetween(String value1, String value2) {
            addCriterion("custom_no not between", value1, value2, "customNo");
            return (Criteria) this;
        }

        public Criteria andComplainDateIsNull() {
            addCriterion("complain_date is null");
            return (Criteria) this;
        }

        public Criteria andComplainDateIsNotNull() {
            addCriterion("complain_date is not null");
            return (Criteria) this;
        }

        public Criteria andComplainDateEqualTo(Date value) {
            addCriterionForJDBCDate("complain_date =", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("complain_date <>", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateGreaterThan(Date value) {
            addCriterionForJDBCDate("complain_date >", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("complain_date >=", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateLessThan(Date value) {
            addCriterionForJDBCDate("complain_date <", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("complain_date <=", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateIn(List<Date> values) {
            addCriterionForJDBCDate("complain_date in", values, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("complain_date not in", values, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("complain_date between", value1, value2, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("complain_date not between", value1, value2, "complainDate");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("product_no is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("product_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("product_no =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("product_no <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("product_no >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_no >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("product_no <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("product_no <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("product_no like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("product_no not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("product_no in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("product_no not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("product_no between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("product_no not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqIsNull() {
            addCriterion("deliver_seq is null");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqIsNotNull() {
            addCriterion("deliver_seq is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqEqualTo(String value) {
            addCriterion("deliver_seq =", value, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqNotEqualTo(String value) {
            addCriterion("deliver_seq <>", value, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqGreaterThan(String value) {
            addCriterion("deliver_seq >", value, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_seq >=", value, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqLessThan(String value) {
            addCriterion("deliver_seq <", value, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqLessThanOrEqualTo(String value) {
            addCriterion("deliver_seq <=", value, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqLike(String value) {
            addCriterion("deliver_seq like", value, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqNotLike(String value) {
            addCriterion("deliver_seq not like", value, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqIn(List<String> values) {
            addCriterion("deliver_seq in", values, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqNotIn(List<String> values) {
            addCriterion("deliver_seq not in", values, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqBetween(String value1, String value2) {
            addCriterion("deliver_seq between", value1, value2, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andDeliverSeqNotBetween(String value1, String value2) {
            addCriterion("deliver_seq not between", value1, value2, "deliverSeq");
            return (Criteria) this;
        }

        public Criteria andSalesNoIsNull() {
            addCriterion("sales_no is null");
            return (Criteria) this;
        }

        public Criteria andSalesNoIsNotNull() {
            addCriterion("sales_no is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNoEqualTo(String value) {
            addCriterion("sales_no =", value, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoNotEqualTo(String value) {
            addCriterion("sales_no <>", value, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoGreaterThan(String value) {
            addCriterion("sales_no >", value, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoGreaterThanOrEqualTo(String value) {
            addCriterion("sales_no >=", value, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoLessThan(String value) {
            addCriterion("sales_no <", value, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoLessThanOrEqualTo(String value) {
            addCriterion("sales_no <=", value, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoLike(String value) {
            addCriterion("sales_no like", value, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoNotLike(String value) {
            addCriterion("sales_no not like", value, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoIn(List<String> values) {
            addCriterion("sales_no in", values, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoNotIn(List<String> values) {
            addCriterion("sales_no not in", values, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoBetween(String value1, String value2) {
            addCriterion("sales_no between", value1, value2, "salesNo");
            return (Criteria) this;
        }

        public Criteria andSalesNoNotBetween(String value1, String value2) {
            addCriterion("sales_no not between", value1, value2, "salesNo");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryIsNull() {
            addCriterion("duty_factory is null");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryIsNotNull() {
            addCriterion("duty_factory is not null");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryEqualTo(String value) {
            addCriterion("duty_factory =", value, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryNotEqualTo(String value) {
            addCriterion("duty_factory <>", value, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryGreaterThan(String value) {
            addCriterion("duty_factory >", value, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("duty_factory >=", value, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryLessThan(String value) {
            addCriterion("duty_factory <", value, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryLessThanOrEqualTo(String value) {
            addCriterion("duty_factory <=", value, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryLike(String value) {
            addCriterion("duty_factory like", value, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryNotLike(String value) {
            addCriterion("duty_factory not like", value, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryIn(List<String> values) {
            addCriterion("duty_factory in", values, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryNotIn(List<String> values) {
            addCriterion("duty_factory not in", values, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryBetween(String value1, String value2) {
            addCriterion("duty_factory between", value1, value2, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andDutyFactoryNotBetween(String value1, String value2) {
            addCriterion("duty_factory not between", value1, value2, "dutyFactory");
            return (Criteria) this;
        }

        public Criteria andApplyNameIsNull() {
            addCriterion("apply_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyNameIsNotNull() {
            addCriterion("apply_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNameEqualTo(String value) {
            addCriterion("apply_name =", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotEqualTo(String value) {
            addCriterion("apply_name <>", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameGreaterThan(String value) {
            addCriterion("apply_name >", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_name >=", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLessThan(String value) {
            addCriterion("apply_name <", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLessThanOrEqualTo(String value) {
            addCriterion("apply_name <=", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameLike(String value) {
            addCriterion("apply_name like", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotLike(String value) {
            addCriterion("apply_name not like", value, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameIn(List<String> values) {
            addCriterion("apply_name in", values, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotIn(List<String> values) {
            addCriterion("apply_name not in", values, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameBetween(String value1, String value2) {
            addCriterion("apply_name between", value1, value2, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNameNotBetween(String value1, String value2) {
            addCriterion("apply_name not between", value1, value2, "applyName");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNull() {
            addCriterion("apply_no is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(String value) {
            addCriterion("apply_no =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(String value) {
            addCriterion("apply_no <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(String value) {
            addCriterion("apply_no >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("apply_no >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(String value) {
            addCriterion("apply_no <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(String value) {
            addCriterion("apply_no <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLike(String value) {
            addCriterion("apply_no like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotLike(String value) {
            addCriterion("apply_no not like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<String> values) {
            addCriterion("apply_no in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<String> values) {
            addCriterion("apply_no not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(String value1, String value2) {
            addCriterion("apply_no between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(String value1, String value2) {
            addCriterion("apply_no not between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepIsNull() {
            addCriterion("is_need_rep is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepIsNotNull() {
            addCriterion("is_need_rep is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepEqualTo(String value) {
            addCriterion("is_need_rep =", value, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepNotEqualTo(String value) {
            addCriterion("is_need_rep <>", value, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepGreaterThan(String value) {
            addCriterion("is_need_rep >", value, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepGreaterThanOrEqualTo(String value) {
            addCriterion("is_need_rep >=", value, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepLessThan(String value) {
            addCriterion("is_need_rep <", value, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepLessThanOrEqualTo(String value) {
            addCriterion("is_need_rep <=", value, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepLike(String value) {
            addCriterion("is_need_rep like", value, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepNotLike(String value) {
            addCriterion("is_need_rep not like", value, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepIn(List<String> values) {
            addCriterion("is_need_rep in", values, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepNotIn(List<String> values) {
            addCriterion("is_need_rep not in", values, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepBetween(String value1, String value2) {
            addCriterion("is_need_rep between", value1, value2, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andIsNeedRepNotBetween(String value1, String value2) {
            addCriterion("is_need_rep not between", value1, value2, "isNeedRep");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateIsNull() {
            addCriterion("lawsuit_state is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateIsNotNull() {
            addCriterion("lawsuit_state is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateEqualTo(String value) {
            addCriterion("lawsuit_state =", value, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateNotEqualTo(String value) {
            addCriterion("lawsuit_state <>", value, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateGreaterThan(String value) {
            addCriterion("lawsuit_state >", value, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateGreaterThanOrEqualTo(String value) {
            addCriterion("lawsuit_state >=", value, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateLessThan(String value) {
            addCriterion("lawsuit_state <", value, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateLessThanOrEqualTo(String value) {
            addCriterion("lawsuit_state <=", value, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateLike(String value) {
            addCriterion("lawsuit_state like", value, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateNotLike(String value) {
            addCriterion("lawsuit_state not like", value, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateIn(List<String> values) {
            addCriterion("lawsuit_state in", values, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateNotIn(List<String> values) {
            addCriterion("lawsuit_state not in", values, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateBetween(String value1, String value2) {
            addCriterion("lawsuit_state between", value1, value2, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitStateNotBetween(String value1, String value2) {
            addCriterion("lawsuit_state not between", value1, value2, "lawsuitState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateIsNull() {
            addCriterion("lawsuit_dan_state is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateIsNotNull() {
            addCriterion("lawsuit_dan_state is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateEqualTo(String value) {
            addCriterion("lawsuit_dan_state =", value, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateNotEqualTo(String value) {
            addCriterion("lawsuit_dan_state <>", value, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateGreaterThan(String value) {
            addCriterion("lawsuit_dan_state >", value, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateGreaterThanOrEqualTo(String value) {
            addCriterion("lawsuit_dan_state >=", value, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateLessThan(String value) {
            addCriterion("lawsuit_dan_state <", value, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateLessThanOrEqualTo(String value) {
            addCriterion("lawsuit_dan_state <=", value, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateLike(String value) {
            addCriterion("lawsuit_dan_state like", value, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateNotLike(String value) {
            addCriterion("lawsuit_dan_state not like", value, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateIn(List<String> values) {
            addCriterion("lawsuit_dan_state in", values, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateNotIn(List<String> values) {
            addCriterion("lawsuit_dan_state not in", values, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateBetween(String value1, String value2) {
            addCriterion("lawsuit_dan_state between", value1, value2, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andLawsuitDanStateNotBetween(String value1, String value2) {
            addCriterion("lawsuit_dan_state not between", value1, value2, "lawsuitDanState");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("fid like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("fid not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("fid not between", value1, value2, "fid");
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

        public Criteria andCustomStateIsNull() {
            addCriterion("custom_state is null");
            return (Criteria) this;
        }

        public Criteria andCustomStateIsNotNull() {
            addCriterion("custom_state is not null");
            return (Criteria) this;
        }

        public Criteria andCustomStateEqualTo(String value) {
            addCriterion("custom_state =", value, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateNotEqualTo(String value) {
            addCriterion("custom_state <>", value, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateGreaterThan(String value) {
            addCriterion("custom_state >", value, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateGreaterThanOrEqualTo(String value) {
            addCriterion("custom_state >=", value, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateLessThan(String value) {
            addCriterion("custom_state <", value, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateLessThanOrEqualTo(String value) {
            addCriterion("custom_state <=", value, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateLike(String value) {
            addCriterion("custom_state like", value, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateNotLike(String value) {
            addCriterion("custom_state not like", value, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateIn(List<String> values) {
            addCriterion("custom_state in", values, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateNotIn(List<String> values) {
            addCriterion("custom_state not in", values, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateBetween(String value1, String value2) {
            addCriterion("custom_state between", value1, value2, "customState");
            return (Criteria) this;
        }

        public Criteria andCustomStateNotBetween(String value1, String value2) {
            addCriterion("custom_state not between", value1, value2, "customState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateIsNull() {
            addCriterion("dangerous_goods_state is null");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateIsNotNull() {
            addCriterion("dangerous_goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateEqualTo(String value) {
            addCriterion("dangerous_goods_state =", value, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateNotEqualTo(String value) {
            addCriterion("dangerous_goods_state <>", value, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateGreaterThan(String value) {
            addCriterion("dangerous_goods_state >", value, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_goods_state >=", value, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateLessThan(String value) {
            addCriterion("dangerous_goods_state <", value, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateLessThanOrEqualTo(String value) {
            addCriterion("dangerous_goods_state <=", value, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateLike(String value) {
            addCriterion("dangerous_goods_state like", value, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateNotLike(String value) {
            addCriterion("dangerous_goods_state not like", value, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateIn(List<String> values) {
            addCriterion("dangerous_goods_state in", values, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateNotIn(List<String> values) {
            addCriterion("dangerous_goods_state not in", values, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateBetween(String value1, String value2) {
            addCriterion("dangerous_goods_state between", value1, value2, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andDangerousGoodsStateNotBetween(String value1, String value2) {
            addCriterion("dangerous_goods_state not between", value1, value2, "dangerousGoodsState");
            return (Criteria) this;
        }

        public Criteria andReformStateIsNull() {
            addCriterion("reform_state is null");
            return (Criteria) this;
        }

        public Criteria andReformStateIsNotNull() {
            addCriterion("reform_state is not null");
            return (Criteria) this;
        }

        public Criteria andReformStateEqualTo(String value) {
            addCriterion("reform_state =", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateNotEqualTo(String value) {
            addCriterion("reform_state <>", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateGreaterThan(String value) {
            addCriterion("reform_state >", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateGreaterThanOrEqualTo(String value) {
            addCriterion("reform_state >=", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateLessThan(String value) {
            addCriterion("reform_state <", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateLessThanOrEqualTo(String value) {
            addCriterion("reform_state <=", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateLike(String value) {
            addCriterion("reform_state like", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateNotLike(String value) {
            addCriterion("reform_state not like", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateIn(List<String> values) {
            addCriterion("reform_state in", values, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateNotIn(List<String> values) {
            addCriterion("reform_state not in", values, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateBetween(String value1, String value2) {
            addCriterion("reform_state between", value1, value2, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateNotBetween(String value1, String value2) {
            addCriterion("reform_state not between", value1, value2, "reformState");
            return (Criteria) this;
        }

        public Criteria andDutyStateIsNull() {
            addCriterion("duty_state is null");
            return (Criteria) this;
        }

        public Criteria andDutyStateIsNotNull() {
            addCriterion("duty_state is not null");
            return (Criteria) this;
        }

        public Criteria andDutyStateEqualTo(String value) {
            addCriterion("duty_state =", value, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateNotEqualTo(String value) {
            addCriterion("duty_state <>", value, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateGreaterThan(String value) {
            addCriterion("duty_state >", value, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateGreaterThanOrEqualTo(String value) {
            addCriterion("duty_state >=", value, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateLessThan(String value) {
            addCriterion("duty_state <", value, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateLessThanOrEqualTo(String value) {
            addCriterion("duty_state <=", value, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateLike(String value) {
            addCriterion("duty_state like", value, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateNotLike(String value) {
            addCriterion("duty_state not like", value, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateIn(List<String> values) {
            addCriterion("duty_state in", values, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateNotIn(List<String> values) {
            addCriterion("duty_state not in", values, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateBetween(String value1, String value2) {
            addCriterion("duty_state between", value1, value2, "dutyState");
            return (Criteria) this;
        }

        public Criteria andDutyStateNotBetween(String value1, String value2) {
            addCriterion("duty_state not between", value1, value2, "dutyState");
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