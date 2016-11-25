package com.ai.yc.user.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class UsrCustFileExtCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrCustFileExtCriteria() {
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

        public Criteria andInfoExtIdIsNull() {
            addCriterion("info_ext_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdIsNotNull() {
            addCriterion("info_ext_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdEqualTo(String value) {
            addCriterion("info_ext_id =", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdNotEqualTo(String value) {
            addCriterion("info_ext_id <>", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdGreaterThan(String value) {
            addCriterion("info_ext_id >", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdGreaterThanOrEqualTo(String value) {
            addCriterion("info_ext_id >=", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdLessThan(String value) {
            addCriterion("info_ext_id <", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdLessThanOrEqualTo(String value) {
            addCriterion("info_ext_id <=", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdLike(String value) {
            addCriterion("info_ext_id like", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdNotLike(String value) {
            addCriterion("info_ext_id not like", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdIn(List<String> values) {
            addCriterion("info_ext_id in", values, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdNotIn(List<String> values) {
            addCriterion("info_ext_id not in", values, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdBetween(String value1, String value2) {
            addCriterion("info_ext_id between", value1, value2, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdNotBetween(String value1, String value2) {
            addCriterion("info_ext_id not between", value1, value2, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andInfoNameIsNull() {
            addCriterion("info_name is null");
            return (Criteria) this;
        }

        public Criteria andInfoNameIsNotNull() {
            addCriterion("info_name is not null");
            return (Criteria) this;
        }

        public Criteria andInfoNameEqualTo(String value) {
            addCriterion("info_name =", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotEqualTo(String value) {
            addCriterion("info_name <>", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThan(String value) {
            addCriterion("info_name >", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("info_name >=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThan(String value) {
            addCriterion("info_name <", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThanOrEqualTo(String value) {
            addCriterion("info_name <=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLike(String value) {
            addCriterion("info_name like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotLike(String value) {
            addCriterion("info_name not like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameIn(List<String> values) {
            addCriterion("info_name in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotIn(List<String> values) {
            addCriterion("info_name not in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameBetween(String value1, String value2) {
            addCriterion("info_name between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotBetween(String value1, String value2) {
            addCriterion("info_name not between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNull() {
            addCriterion("info_type is null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNotNull() {
            addCriterion("info_type is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeEqualTo(String value) {
            addCriterion("info_type =", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotEqualTo(String value) {
            addCriterion("info_type <>", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThan(String value) {
            addCriterion("info_type >", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("info_type >=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThan(String value) {
            addCriterion("info_type <", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThanOrEqualTo(String value) {
            addCriterion("info_type <=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLike(String value) {
            addCriterion("info_type like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotLike(String value) {
            addCriterion("info_type not like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIn(List<String> values) {
            addCriterion("info_type in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotIn(List<String> values) {
            addCriterion("info_type not in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeBetween(String value1, String value2) {
            addCriterion("info_type between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotBetween(String value1, String value2) {
            addCriterion("info_type not between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoItemIsNull() {
            addCriterion("info_item is null");
            return (Criteria) this;
        }

        public Criteria andInfoItemIsNotNull() {
            addCriterion("info_item is not null");
            return (Criteria) this;
        }

        public Criteria andInfoItemEqualTo(String value) {
            addCriterion("info_item =", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemNotEqualTo(String value) {
            addCriterion("info_item <>", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemGreaterThan(String value) {
            addCriterion("info_item >", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemGreaterThanOrEqualTo(String value) {
            addCriterion("info_item >=", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemLessThan(String value) {
            addCriterion("info_item <", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemLessThanOrEqualTo(String value) {
            addCriterion("info_item <=", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemLike(String value) {
            addCriterion("info_item like", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemNotLike(String value) {
            addCriterion("info_item not like", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemIn(List<String> values) {
            addCriterion("info_item in", values, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemNotIn(List<String> values) {
            addCriterion("info_item not in", values, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemBetween(String value1, String value2) {
            addCriterion("info_item between", value1, value2, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemNotBetween(String value1, String value2) {
            addCriterion("info_item not between", value1, value2, "infoItem");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNull() {
            addCriterion("attr_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(String value) {
            addCriterion("attr_id =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(String value) {
            addCriterion("attr_id <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(String value) {
            addCriterion("attr_id >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(String value) {
            addCriterion("attr_id >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(String value) {
            addCriterion("attr_id <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(String value) {
            addCriterion("attr_id <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLike(String value) {
            addCriterion("attr_id like", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotLike(String value) {
            addCriterion("attr_id not like", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<String> values) {
            addCriterion("attr_id in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<String> values) {
            addCriterion("attr_id not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(String value1, String value2) {
            addCriterion("attr_id between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(String value1, String value2) {
            addCriterion("attr_id not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNull() {
            addCriterion("attr_value is null");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNotNull() {
            addCriterion("attr_value is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValueEqualTo(String value) {
            addCriterion("attr_value =", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotEqualTo(String value) {
            addCriterion("attr_value <>", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThan(String value) {
            addCriterion("attr_value >", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("attr_value >=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThan(String value) {
            addCriterion("attr_value <", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThanOrEqualTo(String value) {
            addCriterion("attr_value <=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLike(String value) {
            addCriterion("attr_value like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotLike(String value) {
            addCriterion("attr_value not like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueIn(List<String> values) {
            addCriterion("attr_value in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotIn(List<String> values) {
            addCriterion("attr_value not in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueBetween(String value1, String value2) {
            addCriterion("attr_value between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotBetween(String value1, String value2) {
            addCriterion("attr_value not between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andEditStateIsNull() {
            addCriterion("edit_state is null");
            return (Criteria) this;
        }

        public Criteria andEditStateIsNotNull() {
            addCriterion("edit_state is not null");
            return (Criteria) this;
        }

        public Criteria andEditStateEqualTo(String value) {
            addCriterion("edit_state =", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateNotEqualTo(String value) {
            addCriterion("edit_state <>", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateGreaterThan(String value) {
            addCriterion("edit_state >", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateGreaterThanOrEqualTo(String value) {
            addCriterion("edit_state >=", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateLessThan(String value) {
            addCriterion("edit_state <", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateLessThanOrEqualTo(String value) {
            addCriterion("edit_state <=", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateLike(String value) {
            addCriterion("edit_state like", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateNotLike(String value) {
            addCriterion("edit_state not like", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateIn(List<String> values) {
            addCriterion("edit_state in", values, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateNotIn(List<String> values) {
            addCriterion("edit_state not in", values, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateBetween(String value1, String value2) {
            addCriterion("edit_state between", value1, value2, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateNotBetween(String value1, String value2) {
            addCriterion("edit_state not between", value1, value2, "editState");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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