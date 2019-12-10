package com.qmall.apple.Entity;

import java.util.ArrayList;
import java.util.List;

public class ShopShiroExampleEntity {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopShiroExampleEntity() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSfilterIsNull() {
            addCriterion("sfilter is null");
            return (Criteria) this;
        }

        public Criteria andSfilterIsNotNull() {
            addCriterion("sfilter is not null");
            return (Criteria) this;
        }

        public Criteria andSfilterEqualTo(String value) {
            addCriterion("sfilter =", value, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterNotEqualTo(String value) {
            addCriterion("sfilter <>", value, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterGreaterThan(String value) {
            addCriterion("sfilter >", value, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterGreaterThanOrEqualTo(String value) {
            addCriterion("sfilter >=", value, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterLessThan(String value) {
            addCriterion("sfilter <", value, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterLessThanOrEqualTo(String value) {
            addCriterion("sfilter <=", value, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterLike(String value) {
            addCriterion("sfilter like", value, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterNotLike(String value) {
            addCriterion("sfilter not like", value, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterIn(List<String> values) {
            addCriterion("sfilter in", values, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterNotIn(List<String> values) {
            addCriterion("sfilter not in", values, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterBetween(String value1, String value2) {
            addCriterion("sfilter between", value1, value2, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSfilterNotBetween(String value1, String value2) {
            addCriterion("sfilter not between", value1, value2, "sfilter");
            return (Criteria) this;
        }

        public Criteria andSindexIsNull() {
            addCriterion("sindex is null");
            return (Criteria) this;
        }

        public Criteria andSindexIsNotNull() {
            addCriterion("sindex is not null");
            return (Criteria) this;
        }

        public Criteria andSindexEqualTo(Integer value) {
            addCriterion("sindex =", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexNotEqualTo(Integer value) {
            addCriterion("sindex <>", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexGreaterThan(Integer value) {
            addCriterion("sindex >", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sindex >=", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexLessThan(Integer value) {
            addCriterion("sindex <", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexLessThanOrEqualTo(Integer value) {
            addCriterion("sindex <=", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexIn(List<Integer> values) {
            addCriterion("sindex in", values, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexNotIn(List<Integer> values) {
            addCriterion("sindex not in", values, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexBetween(Integer value1, Integer value2) {
            addCriterion("sindex between", value1, value2, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexNotBetween(Integer value1, Integer value2) {
            addCriterion("sindex not between", value1, value2, "sindex");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNull() {
            addCriterion("sstatus is null");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNotNull() {
            addCriterion("sstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSstatusEqualTo(Integer value) {
            addCriterion("sstatus =", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotEqualTo(Integer value) {
            addCriterion("sstatus <>", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThan(Integer value) {
            addCriterion("sstatus >", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sstatus >=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThan(Integer value) {
            addCriterion("sstatus <", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThanOrEqualTo(Integer value) {
            addCriterion("sstatus <=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusIn(List<Integer> values) {
            addCriterion("sstatus in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotIn(List<Integer> values) {
            addCriterion("sstatus not in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusBetween(Integer value1, Integer value2) {
            addCriterion("sstatus between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sstatus not between", value1, value2, "sstatus");
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