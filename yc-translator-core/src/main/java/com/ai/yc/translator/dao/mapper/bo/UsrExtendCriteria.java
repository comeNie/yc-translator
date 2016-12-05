package com.ai.yc.translator.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class UsrExtendCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrExtendCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andExtendIdIsNull() {
            addCriterion("extend_id is null");
            return (Criteria) this;
        }

        public Criteria andExtendIdIsNotNull() {
            addCriterion("extend_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtendIdEqualTo(String value) {
            addCriterion("extend_id =", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdNotEqualTo(String value) {
            addCriterion("extend_id <>", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdGreaterThan(String value) {
            addCriterion("extend_id >", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdGreaterThanOrEqualTo(String value) {
            addCriterion("extend_id >=", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdLessThan(String value) {
            addCriterion("extend_id <", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdLessThanOrEqualTo(String value) {
            addCriterion("extend_id <=", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdLike(String value) {
            addCriterion("extend_id like", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdNotLike(String value) {
            addCriterion("extend_id not like", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdIn(List<String> values) {
            addCriterion("extend_id in", values, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdNotIn(List<String> values) {
            addCriterion("extend_id not in", values, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdBetween(String value1, String value2) {
            addCriterion("extend_id between", value1, value2, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdNotBetween(String value1, String value2) {
            addCriterion("extend_id not between", value1, value2, "extendId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdIsNull() {
            addCriterion("translator_id is null");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdIsNotNull() {
            addCriterion("translator_id is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdEqualTo(String value) {
            addCriterion("translator_id =", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdNotEqualTo(String value) {
            addCriterion("translator_id <>", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdGreaterThan(String value) {
            addCriterion("translator_id >", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("translator_id >=", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdLessThan(String value) {
            addCriterion("translator_id <", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdLessThanOrEqualTo(String value) {
            addCriterion("translator_id <=", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdLike(String value) {
            addCriterion("translator_id like", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdNotLike(String value) {
            addCriterion("translator_id not like", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdIn(List<String> values) {
            addCriterion("translator_id in", values, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdNotIn(List<String> values) {
            addCriterion("translator_id not in", values, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdBetween(String value1, String value2) {
            addCriterion("translator_id between", value1, value2, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdNotBetween(String value1, String value2) {
            addCriterion("translator_id not between", value1, value2, "translatorId");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIsNull() {
            addCriterion("extend_type is null");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIsNotNull() {
            addCriterion("extend_type is not null");
            return (Criteria) this;
        }

        public Criteria andExtendTypeEqualTo(String value) {
            addCriterion("extend_type =", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotEqualTo(String value) {
            addCriterion("extend_type <>", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeGreaterThan(String value) {
            addCriterion("extend_type >", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("extend_type >=", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLessThan(String value) {
            addCriterion("extend_type <", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLessThanOrEqualTo(String value) {
            addCriterion("extend_type <=", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLike(String value) {
            addCriterion("extend_type like", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotLike(String value) {
            addCriterion("extend_type not like", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIn(List<String> values) {
            addCriterion("extend_type in", values, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotIn(List<String> values) {
            addCriterion("extend_type not in", values, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeBetween(String value1, String value2) {
            addCriterion("extend_type between", value1, value2, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotBetween(String value1, String value2) {
            addCriterion("extend_type not between", value1, value2, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendKeyIsNull() {
            addCriterion("extend_key is null");
            return (Criteria) this;
        }

        public Criteria andExtendKeyIsNotNull() {
            addCriterion("extend_key is not null");
            return (Criteria) this;
        }

        public Criteria andExtendKeyEqualTo(String value) {
            addCriterion("extend_key =", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyNotEqualTo(String value) {
            addCriterion("extend_key <>", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyGreaterThan(String value) {
            addCriterion("extend_key >", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyGreaterThanOrEqualTo(String value) {
            addCriterion("extend_key >=", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyLessThan(String value) {
            addCriterion("extend_key <", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyLessThanOrEqualTo(String value) {
            addCriterion("extend_key <=", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyLike(String value) {
            addCriterion("extend_key like", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyNotLike(String value) {
            addCriterion("extend_key not like", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyIn(List<String> values) {
            addCriterion("extend_key in", values, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyNotIn(List<String> values) {
            addCriterion("extend_key not in", values, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyBetween(String value1, String value2) {
            addCriterion("extend_key between", value1, value2, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyNotBetween(String value1, String value2) {
            addCriterion("extend_key not between", value1, value2, "extendKey");
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