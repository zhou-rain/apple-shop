package com.qmall.apple.bean;

import java.util.ArrayList;
import java.util.List;

public class ShopGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopGoodsExample() {
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

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGimageIsNull() {
            addCriterion("gimage is null");
            return (Criteria) this;
        }

        public Criteria andGimageIsNotNull() {
            addCriterion("gimage is not null");
            return (Criteria) this;
        }

        public Criteria andGimageEqualTo(String value) {
            addCriterion("gimage =", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageNotEqualTo(String value) {
            addCriterion("gimage <>", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageGreaterThan(String value) {
            addCriterion("gimage >", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageGreaterThanOrEqualTo(String value) {
            addCriterion("gimage >=", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageLessThan(String value) {
            addCriterion("gimage <", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageLessThanOrEqualTo(String value) {
            addCriterion("gimage <=", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageLike(String value) {
            addCriterion("gimage like", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageNotLike(String value) {
            addCriterion("gimage not like", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageIn(List<String> values) {
            addCriterion("gimage in", values, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageNotIn(List<String> values) {
            addCriterion("gimage not in", values, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageBetween(String value1, String value2) {
            addCriterion("gimage between", value1, value2, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageNotBetween(String value1, String value2) {
            addCriterion("gimage not between", value1, value2, "gimage");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("gprice is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("gprice is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(Float value) {
            addCriterion("gprice =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(Float value) {
            addCriterion("gprice <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(Float value) {
            addCriterion("gprice >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("gprice >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(Float value) {
            addCriterion("gprice <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(Float value) {
            addCriterion("gprice <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<Float> values) {
            addCriterion("gprice in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<Float> values) {
            addCriterion("gprice not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(Float value1, Float value2) {
            addCriterion("gprice between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(Float value1, Float value2) {
            addCriterion("gprice not between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNull() {
            addCriterion("gtype is null");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNotNull() {
            addCriterion("gtype is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeEqualTo(Integer value) {
            addCriterion("gtype =", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotEqualTo(Integer value) {
            addCriterion("gtype <>", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThan(Integer value) {
            addCriterion("gtype >", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtype >=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThan(Integer value) {
            addCriterion("gtype <", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThanOrEqualTo(Integer value) {
            addCriterion("gtype <=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeIn(List<Integer> values) {
            addCriterion("gtype in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotIn(List<Integer> values) {
            addCriterion("gtype not in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeBetween(Integer value1, Integer value2) {
            addCriterion("gtype between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("gtype not between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGdescIsNull() {
            addCriterion("gdesc is null");
            return (Criteria) this;
        }

        public Criteria andGdescIsNotNull() {
            addCriterion("gdesc is not null");
            return (Criteria) this;
        }

        public Criteria andGdescEqualTo(String value) {
            addCriterion("gdesc =", value, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescNotEqualTo(String value) {
            addCriterion("gdesc <>", value, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescGreaterThan(String value) {
            addCriterion("gdesc >", value, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescGreaterThanOrEqualTo(String value) {
            addCriterion("gdesc >=", value, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescLessThan(String value) {
            addCriterion("gdesc <", value, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescLessThanOrEqualTo(String value) {
            addCriterion("gdesc <=", value, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescLike(String value) {
            addCriterion("gdesc like", value, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescNotLike(String value) {
            addCriterion("gdesc not like", value, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescIn(List<String> values) {
            addCriterion("gdesc in", values, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescNotIn(List<String> values) {
            addCriterion("gdesc not in", values, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescBetween(String value1, String value2) {
            addCriterion("gdesc between", value1, value2, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdescNotBetween(String value1, String value2) {
            addCriterion("gdesc not between", value1, value2, "gdesc");
            return (Criteria) this;
        }

        public Criteria andGdiscountIsNull() {
            addCriterion("gdiscount is null");
            return (Criteria) this;
        }

        public Criteria andGdiscountIsNotNull() {
            addCriterion("gdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andGdiscountEqualTo(Float value) {
            addCriterion("gdiscount =", value, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountNotEqualTo(Float value) {
            addCriterion("gdiscount <>", value, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountGreaterThan(Float value) {
            addCriterion("gdiscount >", value, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("gdiscount >=", value, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountLessThan(Float value) {
            addCriterion("gdiscount <", value, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountLessThanOrEqualTo(Float value) {
            addCriterion("gdiscount <=", value, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountIn(List<Float> values) {
            addCriterion("gdiscount in", values, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountNotIn(List<Float> values) {
            addCriterion("gdiscount not in", values, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountBetween(Float value1, Float value2) {
            addCriterion("gdiscount between", value1, value2, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andGdiscountNotBetween(Float value1, Float value2) {
            addCriterion("gdiscount not between", value1, value2, "gdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andGlabelIsNull() {
            addCriterion("glabel is null");
            return (Criteria) this;
        }

        public Criteria andGlabelIsNotNull() {
            addCriterion("glabel is not null");
            return (Criteria) this;
        }

        public Criteria andGlabelEqualTo(Integer value) {
            addCriterion("glabel =", value, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelNotEqualTo(Integer value) {
            addCriterion("glabel <>", value, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelGreaterThan(Integer value) {
            addCriterion("glabel >", value, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelGreaterThanOrEqualTo(Integer value) {
            addCriterion("glabel >=", value, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelLessThan(Integer value) {
            addCriterion("glabel <", value, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelLessThanOrEqualTo(Integer value) {
            addCriterion("glabel <=", value, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelIn(List<Integer> values) {
            addCriterion("glabel in", values, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelNotIn(List<Integer> values) {
            addCriterion("glabel not in", values, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelBetween(Integer value1, Integer value2) {
            addCriterion("glabel between", value1, value2, "glabel");
            return (Criteria) this;
        }

        public Criteria andGlabelNotBetween(Integer value1, Integer value2) {
            addCriterion("glabel not between", value1, value2, "glabel");
            return (Criteria) this;
        }

        public Criteria andGsexIsNull() {
            addCriterion("gsex is null");
            return (Criteria) this;
        }

        public Criteria andGsexIsNotNull() {
            addCriterion("gsex is not null");
            return (Criteria) this;
        }

        public Criteria andGsexEqualTo(Integer value) {
            addCriterion("gsex =", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotEqualTo(Integer value) {
            addCriterion("gsex <>", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexGreaterThan(Integer value) {
            addCriterion("gsex >", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsex >=", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexLessThan(Integer value) {
            addCriterion("gsex <", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexLessThanOrEqualTo(Integer value) {
            addCriterion("gsex <=", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexIn(List<Integer> values) {
            addCriterion("gsex in", values, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotIn(List<Integer> values) {
            addCriterion("gsex not in", values, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexBetween(Integer value1, Integer value2) {
            addCriterion("gsex between", value1, value2, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotBetween(Integer value1, Integer value2) {
            addCriterion("gsex not between", value1, value2, "gsex");
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