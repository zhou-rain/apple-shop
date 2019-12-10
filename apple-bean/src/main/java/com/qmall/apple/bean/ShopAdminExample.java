package com.qmall.apple.bean;

import java.util.ArrayList;
import java.util.List;

public class ShopAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopAdminExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAacountIsNull() {
            addCriterion("aacount is null");
            return (Criteria) this;
        }

        public Criteria andAacountIsNotNull() {
            addCriterion("aacount is not null");
            return (Criteria) this;
        }

        public Criteria andAacountEqualTo(String value) {
            addCriterion("aacount =", value, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountNotEqualTo(String value) {
            addCriterion("aacount <>", value, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountGreaterThan(String value) {
            addCriterion("aacount >", value, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountGreaterThanOrEqualTo(String value) {
            addCriterion("aacount >=", value, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountLessThan(String value) {
            addCriterion("aacount <", value, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountLessThanOrEqualTo(String value) {
            addCriterion("aacount <=", value, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountLike(String value) {
            addCriterion("aacount like", value, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountNotLike(String value) {
            addCriterion("aacount not like", value, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountIn(List<String> values) {
            addCriterion("aacount in", values, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountNotIn(List<String> values) {
            addCriterion("aacount not in", values, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountBetween(String value1, String value2) {
            addCriterion("aacount between", value1, value2, "aacount");
            return (Criteria) this;
        }

        public Criteria andAacountNotBetween(String value1, String value2) {
            addCriterion("aacount not between", value1, value2, "aacount");
            return (Criteria) this;
        }

        public Criteria andApassIsNull() {
            addCriterion("apass is null");
            return (Criteria) this;
        }

        public Criteria andApassIsNotNull() {
            addCriterion("apass is not null");
            return (Criteria) this;
        }

        public Criteria andApassEqualTo(String value) {
            addCriterion("apass =", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassNotEqualTo(String value) {
            addCriterion("apass <>", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassGreaterThan(String value) {
            addCriterion("apass >", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassGreaterThanOrEqualTo(String value) {
            addCriterion("apass >=", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassLessThan(String value) {
            addCriterion("apass <", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassLessThanOrEqualTo(String value) {
            addCriterion("apass <=", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassLike(String value) {
            addCriterion("apass like", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassNotLike(String value) {
            addCriterion("apass not like", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassIn(List<String> values) {
            addCriterion("apass in", values, "apass");
            return (Criteria) this;
        }

        public Criteria andApassNotIn(List<String> values) {
            addCriterion("apass not in", values, "apass");
            return (Criteria) this;
        }

        public Criteria andApassBetween(String value1, String value2) {
            addCriterion("apass between", value1, value2, "apass");
            return (Criteria) this;
        }

        public Criteria andApassNotBetween(String value1, String value2) {
            addCriterion("apass not between", value1, value2, "apass");
            return (Criteria) this;
        }

        public Criteria andAstatusIsNull() {
            addCriterion("astatus is null");
            return (Criteria) this;
        }

        public Criteria andAstatusIsNotNull() {
            addCriterion("astatus is not null");
            return (Criteria) this;
        }

        public Criteria andAstatusEqualTo(Short value) {
            addCriterion("astatus =", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotEqualTo(Short value) {
            addCriterion("astatus <>", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusGreaterThan(Short value) {
            addCriterion("astatus >", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("astatus >=", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusLessThan(Short value) {
            addCriterion("astatus <", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusLessThanOrEqualTo(Short value) {
            addCriterion("astatus <=", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusIn(List<Short> values) {
            addCriterion("astatus in", values, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotIn(List<Short> values) {
            addCriterion("astatus not in", values, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusBetween(Short value1, Short value2) {
            addCriterion("astatus between", value1, value2, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotBetween(Short value1, Short value2) {
            addCriterion("astatus not between", value1, value2, "astatus");
            return (Criteria) this;
        }

        public Criteria andAphoneIsNull() {
            addCriterion("aphone is null");
            return (Criteria) this;
        }

        public Criteria andAphoneIsNotNull() {
            addCriterion("aphone is not null");
            return (Criteria) this;
        }

        public Criteria andAphoneEqualTo(String value) {
            addCriterion("aphone =", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotEqualTo(String value) {
            addCriterion("aphone <>", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneGreaterThan(String value) {
            addCriterion("aphone >", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneGreaterThanOrEqualTo(String value) {
            addCriterion("aphone >=", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLessThan(String value) {
            addCriterion("aphone <", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLessThanOrEqualTo(String value) {
            addCriterion("aphone <=", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLike(String value) {
            addCriterion("aphone like", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotLike(String value) {
            addCriterion("aphone not like", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneIn(List<String> values) {
            addCriterion("aphone in", values, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotIn(List<String> values) {
            addCriterion("aphone not in", values, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneBetween(String value1, String value2) {
            addCriterion("aphone between", value1, value2, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotBetween(String value1, String value2) {
            addCriterion("aphone not between", value1, value2, "aphone");
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