package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrLspRelationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrLspRelationCriteria() {
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

        public Criteria andLspTranslatorIdIsNull() {
            addCriterion("lsp_translator_id is null");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdIsNotNull() {
            addCriterion("lsp_translator_id is not null");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdEqualTo(String value) {
            addCriterion("lsp_translator_id =", value, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdNotEqualTo(String value) {
            addCriterion("lsp_translator_id <>", value, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdGreaterThan(String value) {
            addCriterion("lsp_translator_id >", value, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("lsp_translator_id >=", value, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdLessThan(String value) {
            addCriterion("lsp_translator_id <", value, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdLessThanOrEqualTo(String value) {
            addCriterion("lsp_translator_id <=", value, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdLike(String value) {
            addCriterion("lsp_translator_id like", value, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdNotLike(String value) {
            addCriterion("lsp_translator_id not like", value, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdIn(List<String> values) {
            addCriterion("lsp_translator_id in", values, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdNotIn(List<String> values) {
            addCriterion("lsp_translator_id not in", values, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdBetween(String value1, String value2) {
            addCriterion("lsp_translator_id between", value1, value2, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspTranslatorIdNotBetween(String value1, String value2) {
            addCriterion("lsp_translator_id not between", value1, value2, "lspTranslatorId");
            return (Criteria) this;
        }

        public Criteria andLspIdIsNull() {
            addCriterion("lsp_id is null");
            return (Criteria) this;
        }

        public Criteria andLspIdIsNotNull() {
            addCriterion("lsp_id is not null");
            return (Criteria) this;
        }

        public Criteria andLspIdEqualTo(String value) {
            addCriterion("lsp_id =", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotEqualTo(String value) {
            addCriterion("lsp_id <>", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdGreaterThan(String value) {
            addCriterion("lsp_id >", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdGreaterThanOrEqualTo(String value) {
            addCriterion("lsp_id >=", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLessThan(String value) {
            addCriterion("lsp_id <", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLessThanOrEqualTo(String value) {
            addCriterion("lsp_id <=", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLike(String value) {
            addCriterion("lsp_id like", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotLike(String value) {
            addCriterion("lsp_id not like", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdIn(List<String> values) {
            addCriterion("lsp_id in", values, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotIn(List<String> values) {
            addCriterion("lsp_id not in", values, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdBetween(String value1, String value2) {
            addCriterion("lsp_id between", value1, value2, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotBetween(String value1, String value2) {
            addCriterion("lsp_id not between", value1, value2, "lspId");
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

        public Criteria andTranslatorRoleIsNull() {
            addCriterion("translator_role is null");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleIsNotNull() {
            addCriterion("translator_role is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleEqualTo(String value) {
            addCriterion("translator_role =", value, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleNotEqualTo(String value) {
            addCriterion("translator_role <>", value, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleGreaterThan(String value) {
            addCriterion("translator_role >", value, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleGreaterThanOrEqualTo(String value) {
            addCriterion("translator_role >=", value, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleLessThan(String value) {
            addCriterion("translator_role <", value, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleLessThanOrEqualTo(String value) {
            addCriterion("translator_role <=", value, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleLike(String value) {
            addCriterion("translator_role like", value, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleNotLike(String value) {
            addCriterion("translator_role not like", value, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleIn(List<String> values) {
            addCriterion("translator_role in", values, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleNotIn(List<String> values) {
            addCriterion("translator_role not in", values, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleBetween(String value1, String value2) {
            addCriterion("translator_role between", value1, value2, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andTranslatorRoleNotBetween(String value1, String value2) {
            addCriterion("translator_role not between", value1, value2, "translatorRole");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNull() {
            addCriterion("join_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNotNull() {
            addCriterion("join_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeEqualTo(Timestamp value) {
            addCriterion("join_time =", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotEqualTo(Timestamp value) {
            addCriterion("join_time <>", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThan(Timestamp value) {
            addCriterion("join_time >", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("join_time >=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThan(Timestamp value) {
            addCriterion("join_time <", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("join_time <=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIn(List<Timestamp> values) {
            addCriterion("join_time in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotIn(List<Timestamp> values) {
            addCriterion("join_time not in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("join_time between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("join_time not between", value1, value2, "joinTime");
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