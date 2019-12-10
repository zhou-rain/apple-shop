package com.qmall.apple.bean;

import java.util.ArrayList;
import java.util.List;

public class ShopOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrderDetailExample() {
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

        public Criteria andOdidIsNull() {
            addCriterion("odid is null");
            return (Criteria) this;
        }

        public Criteria andOdidIsNotNull() {
            addCriterion("odid is not null");
            return (Criteria) this;
        }

        public Criteria andOdidEqualTo(String value) {
            addCriterion("odid =", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotEqualTo(String value) {
            addCriterion("odid <>", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidGreaterThan(String value) {
            addCriterion("odid >", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidGreaterThanOrEqualTo(String value) {
            addCriterion("odid >=", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidLessThan(String value) {
            addCriterion("odid <", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidLessThanOrEqualTo(String value) {
            addCriterion("odid <=", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidLike(String value) {
            addCriterion("odid like", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotLike(String value) {
            addCriterion("odid not like", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidIn(List<String> values) {
            addCriterion("odid in", values, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotIn(List<String> values) {
            addCriterion("odid not in", values, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidBetween(String value1, String value2) {
            addCriterion("odid between", value1, value2, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotBetween(String value1, String value2) {
            addCriterion("odid not between", value1, value2, "odid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(String value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(String value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(String value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(String value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(String value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(String value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLike(String value) {
            addCriterion("gid like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotLike(String value) {
            addCriterion("gid not like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<String> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<String> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(String value1, String value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(String value1, String value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andOdpriceIsNull() {
            addCriterion("odprice is null");
            return (Criteria) this;
        }

        public Criteria andOdpriceIsNotNull() {
            addCriterion("odprice is not null");
            return (Criteria) this;
        }

        public Criteria andOdpriceEqualTo(Float value) {
            addCriterion("odprice =", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceNotEqualTo(Float value) {
            addCriterion("odprice <>", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceGreaterThan(Float value) {
            addCriterion("odprice >", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("odprice >=", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceLessThan(Float value) {
            addCriterion("odprice <", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceLessThanOrEqualTo(Float value) {
            addCriterion("odprice <=", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceIn(List<Float> values) {
            addCriterion("odprice in", values, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceNotIn(List<Float> values) {
            addCriterion("odprice not in", values, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceBetween(Float value1, Float value2) {
            addCriterion("odprice between", value1, value2, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceNotBetween(Float value1, Float value2) {
            addCriterion("odprice not between", value1, value2, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdnumberIsNull() {
            addCriterion("odnumber is null");
            return (Criteria) this;
        }

        public Criteria andOdnumberIsNotNull() {
            addCriterion("odnumber is not null");
            return (Criteria) this;
        }

        public Criteria andOdnumberEqualTo(Integer value) {
            addCriterion("odnumber =", value, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberNotEqualTo(Integer value) {
            addCriterion("odnumber <>", value, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberGreaterThan(Integer value) {
            addCriterion("odnumber >", value, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("odnumber >=", value, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberLessThan(Integer value) {
            addCriterion("odnumber <", value, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberLessThanOrEqualTo(Integer value) {
            addCriterion("odnumber <=", value, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberIn(List<Integer> values) {
            addCriterion("odnumber in", values, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberNotIn(List<Integer> values) {
            addCriterion("odnumber not in", values, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberBetween(Integer value1, Integer value2) {
            addCriterion("odnumber between", value1, value2, "odnumber");
            return (Criteria) this;
        }

        public Criteria andOdnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("odnumber not between", value1, value2, "odnumber");
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