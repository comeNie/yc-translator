package com.ai.yc.translator.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class UsrParentLanguageCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrParentLanguageCriteria() {
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

        public Criteria andPkDicTableIsNull() {
            addCriterion("PK_DIC_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andPkDicTableIsNotNull() {
            addCriterion("PK_DIC_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andPkDicTableEqualTo(String value) {
            addCriterion("PK_DIC_TABLE =", value, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableNotEqualTo(String value) {
            addCriterion("PK_DIC_TABLE <>", value, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableGreaterThan(String value) {
            addCriterion("PK_DIC_TABLE >", value, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableGreaterThanOrEqualTo(String value) {
            addCriterion("PK_DIC_TABLE >=", value, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableLessThan(String value) {
            addCriterion("PK_DIC_TABLE <", value, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableLessThanOrEqualTo(String value) {
            addCriterion("PK_DIC_TABLE <=", value, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableLike(String value) {
            addCriterion("PK_DIC_TABLE like", value, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableNotLike(String value) {
            addCriterion("PK_DIC_TABLE not like", value, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableIn(List<String> values) {
            addCriterion("PK_DIC_TABLE in", values, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableNotIn(List<String> values) {
            addCriterion("PK_DIC_TABLE not in", values, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableBetween(String value1, String value2) {
            addCriterion("PK_DIC_TABLE between", value1, value2, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andPkDicTableNotBetween(String value1, String value2) {
            addCriterion("PK_DIC_TABLE not between", value1, value2, "pkDicTable");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("LANGUAGE =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("LANGUAGE <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("LANGUAGE >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("LANGUAGE <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("LANGUAGE like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("LANGUAGE not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("LANGUAGE in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("LANGUAGE not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("LANGUAGE between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andIntValueIsNull() {
            addCriterion("INT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andIntValueIsNotNull() {
            addCriterion("INT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andIntValueEqualTo(Integer value) {
            addCriterion("INT_VALUE =", value, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueNotEqualTo(Integer value) {
            addCriterion("INT_VALUE <>", value, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueGreaterThan(Integer value) {
            addCriterion("INT_VALUE >", value, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("INT_VALUE >=", value, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueLessThan(Integer value) {
            addCriterion("INT_VALUE <", value, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueLessThanOrEqualTo(Integer value) {
            addCriterion("INT_VALUE <=", value, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueIn(List<Integer> values) {
            addCriterion("INT_VALUE in", values, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueNotIn(List<Integer> values) {
            addCriterion("INT_VALUE not in", values, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueBetween(Integer value1, Integer value2) {
            addCriterion("INT_VALUE between", value1, value2, "intValue");
            return (Criteria) this;
        }

        public Criteria andIntValueNotBetween(Integer value1, Integer value2) {
            addCriterion("INT_VALUE not between", value1, value2, "intValue");
            return (Criteria) this;
        }

        public Criteria andStringValueIsNull() {
            addCriterion("STRING_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andStringValueIsNotNull() {
            addCriterion("STRING_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andStringValueEqualTo(String value) {
            addCriterion("STRING_VALUE =", value, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueNotEqualTo(String value) {
            addCriterion("STRING_VALUE <>", value, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueGreaterThan(String value) {
            addCriterion("STRING_VALUE >", value, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueGreaterThanOrEqualTo(String value) {
            addCriterion("STRING_VALUE >=", value, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueLessThan(String value) {
            addCriterion("STRING_VALUE <", value, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueLessThanOrEqualTo(String value) {
            addCriterion("STRING_VALUE <=", value, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueLike(String value) {
            addCriterion("STRING_VALUE like", value, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueNotLike(String value) {
            addCriterion("STRING_VALUE not like", value, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueIn(List<String> values) {
            addCriterion("STRING_VALUE in", values, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueNotIn(List<String> values) {
            addCriterion("STRING_VALUE not in", values, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueBetween(String value1, String value2) {
            addCriterion("STRING_VALUE between", value1, value2, "stringValue");
            return (Criteria) this;
        }

        public Criteria andStringValueNotBetween(String value1, String value2) {
            addCriterion("STRING_VALUE not between", value1, value2, "stringValue");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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