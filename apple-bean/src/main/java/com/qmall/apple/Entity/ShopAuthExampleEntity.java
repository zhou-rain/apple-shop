package com.qmall.apple.Entity;

import java.util.ArrayList;
import java.util.List;

public class ShopAuthExampleEntity {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopAuthExampleEntity() {
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

        public Criteria andAuidIsNull() {
            addCriterion("auid is null");
            return (Criteria) this;
        }

        public Criteria andAuidIsNotNull() {
            addCriterion("auid is not null");
            return (Criteria) this;
        }

        public Criteria andAuidEqualTo(Integer value) {
            addCriterion("auid =", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidNotEqualTo(Integer value) {
            addCriterion("auid <>", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidGreaterThan(Integer value) {
            addCriterion("auid >", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("auid >=", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidLessThan(Integer value) {
            addCriterion("auid <", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidLessThanOrEqualTo(Integer value) {
            addCriterion("auid <=", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidIn(List<Integer> values) {
            addCriterion("auid in", values, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidNotIn(List<Integer> values) {
            addCriterion("auid not in", values, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidBetween(Integer value1, Integer value2) {
            addCriterion("auid between", value1, value2, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidNotBetween(Integer value1, Integer value2) {
            addCriterion("auid not between", value1, value2, "auid");
            return (Criteria) this;
        }

        public Criteria andAunameIsNull() {
            addCriterion("auname is null");
            return (Criteria) this;
        }

        public Criteria andAunameIsNotNull() {
            addCriterion("auname is not null");
            return (Criteria) this;
        }

        public Criteria andAunameEqualTo(String value) {
            addCriterion("auname =", value, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameNotEqualTo(String value) {
            addCriterion("auname <>", value, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameGreaterThan(String value) {
            addCriterion("auname >", value, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameGreaterThanOrEqualTo(String value) {
            addCriterion("auname >=", value, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameLessThan(String value) {
            addCriterion("auname <", value, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameLessThanOrEqualTo(String value) {
            addCriterion("auname <=", value, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameLike(String value) {
            addCriterion("auname like", value, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameNotLike(String value) {
            addCriterion("auname not like", value, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameIn(List<String> values) {
            addCriterion("auname in", values, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameNotIn(List<String> values) {
            addCriterion("auname not in", values, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameBetween(String value1, String value2) {
            addCriterion("auname between", value1, value2, "auname");
            return (Criteria) this;
        }

        public Criteria andAunameNotBetween(String value1, String value2) {
            addCriterion("auname not between", value1, value2, "auname");
            return (Criteria) this;
        }

        public Criteria andAupathIsNull() {
            addCriterion("aupath is null");
            return (Criteria) this;
        }

        public Criteria andAupathIsNotNull() {
            addCriterion("aupath is not null");
            return (Criteria) this;
        }

        public Criteria andAupathEqualTo(String value) {
            addCriterion("aupath =", value, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathNotEqualTo(String value) {
            addCriterion("aupath <>", value, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathGreaterThan(String value) {
            addCriterion("aupath >", value, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathGreaterThanOrEqualTo(String value) {
            addCriterion("aupath >=", value, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathLessThan(String value) {
            addCriterion("aupath <", value, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathLessThanOrEqualTo(String value) {
            addCriterion("aupath <=", value, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathLike(String value) {
            addCriterion("aupath like", value, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathNotLike(String value) {
            addCriterion("aupath not like", value, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathIn(List<String> values) {
            addCriterion("aupath in", values, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathNotIn(List<String> values) {
            addCriterion("aupath not in", values, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathBetween(String value1, String value2) {
            addCriterion("aupath between", value1, value2, "aupath");
            return (Criteria) this;
        }

        public Criteria andAupathNotBetween(String value1, String value2) {
            addCriterion("aupath not between", value1, value2, "aupath");
            return (Criteria) this;
        }

        public Criteria andAutypeIsNull() {
            addCriterion("autype is null");
            return (Criteria) this;
        }

        public Criteria andAutypeIsNotNull() {
            addCriterion("autype is not null");
            return (Criteria) this;
        }

        public Criteria andAutypeEqualTo(Short value) {
            addCriterion("autype =", value, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeNotEqualTo(Short value) {
            addCriterion("autype <>", value, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeGreaterThan(Short value) {
            addCriterion("autype >", value, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeGreaterThanOrEqualTo(Short value) {
            addCriterion("autype >=", value, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeLessThan(Short value) {
            addCriterion("autype <", value, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeLessThanOrEqualTo(Short value) {
            addCriterion("autype <=", value, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeIn(List<Short> values) {
            addCriterion("autype in", values, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeNotIn(List<Short> values) {
            addCriterion("autype not in", values, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeBetween(Short value1, Short value2) {
            addCriterion("autype between", value1, value2, "autype");
            return (Criteria) this;
        }

        public Criteria andAutypeNotBetween(Short value1, Short value2) {
            addCriterion("autype not between", value1, value2, "autype");
            return (Criteria) this;
        }

        public Criteria andAupidIsNull() {
            addCriterion("aupid is null");
            return (Criteria) this;
        }

        public Criteria andAupidIsNotNull() {
            addCriterion("aupid is not null");
            return (Criteria) this;
        }

        public Criteria andAupidEqualTo(Integer value) {
            addCriterion("aupid =", value, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidNotEqualTo(Integer value) {
            addCriterion("aupid <>", value, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidGreaterThan(Integer value) {
            addCriterion("aupid >", value, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aupid >=", value, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidLessThan(Integer value) {
            addCriterion("aupid <", value, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidLessThanOrEqualTo(Integer value) {
            addCriterion("aupid <=", value, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidIn(List<Integer> values) {
            addCriterion("aupid in", values, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidNotIn(List<Integer> values) {
            addCriterion("aupid not in", values, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidBetween(Integer value1, Integer value2) {
            addCriterion("aupid between", value1, value2, "aupid");
            return (Criteria) this;
        }

        public Criteria andAupidNotBetween(Integer value1, Integer value2) {
            addCriterion("aupid not between", value1, value2, "aupid");
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