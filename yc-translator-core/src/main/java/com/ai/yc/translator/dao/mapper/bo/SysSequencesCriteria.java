package com.ai.yc.translator.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysSequencesCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysSequencesCriteria() {
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

        public Criteria andSequenceNameIsNull() {
            addCriterion("Sequence_name is null");
            return (Criteria) this;
        }

        public Criteria andSequenceNameIsNotNull() {
            addCriterion("Sequence_name is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceNameEqualTo(String value) {
            addCriterion("Sequence_name =", value, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameNotEqualTo(String value) {
            addCriterion("Sequence_name <>", value, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameGreaterThan(String value) {
            addCriterion("Sequence_name >", value, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("Sequence_name >=", value, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameLessThan(String value) {
            addCriterion("Sequence_name <", value, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameLessThanOrEqualTo(String value) {
            addCriterion("Sequence_name <=", value, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameLike(String value) {
            addCriterion("Sequence_name like", value, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameNotLike(String value) {
            addCriterion("Sequence_name not like", value, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameIn(List<String> values) {
            addCriterion("Sequence_name in", values, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameNotIn(List<String> values) {
            addCriterion("Sequence_name not in", values, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameBetween(String value1, String value2) {
            addCriterion("Sequence_name between", value1, value2, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andSequenceNameNotBetween(String value1, String value2) {
            addCriterion("Sequence_name not between", value1, value2, "sequenceName");
            return (Criteria) this;
        }

        public Criteria andJvmStepByIsNull() {
            addCriterion("jvm_step_by is null");
            return (Criteria) this;
        }

        public Criteria andJvmStepByIsNotNull() {
            addCriterion("jvm_step_by is not null");
            return (Criteria) this;
        }

        public Criteria andJvmStepByEqualTo(Integer value) {
            addCriterion("jvm_step_by =", value, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByNotEqualTo(Integer value) {
            addCriterion("jvm_step_by <>", value, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByGreaterThan(Integer value) {
            addCriterion("jvm_step_by >", value, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByGreaterThanOrEqualTo(Integer value) {
            addCriterion("jvm_step_by >=", value, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByLessThan(Integer value) {
            addCriterion("jvm_step_by <", value, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByLessThanOrEqualTo(Integer value) {
            addCriterion("jvm_step_by <=", value, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByIn(List<Integer> values) {
            addCriterion("jvm_step_by in", values, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByNotIn(List<Integer> values) {
            addCriterion("jvm_step_by not in", values, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByBetween(Integer value1, Integer value2) {
            addCriterion("jvm_step_by between", value1, value2, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andJvmStepByNotBetween(Integer value1, Integer value2) {
            addCriterion("jvm_step_by not between", value1, value2, "jvmStepBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByIsNull() {
            addCriterion("increment_by is null");
            return (Criteria) this;
        }

        public Criteria andIncrementByIsNotNull() {
            addCriterion("increment_by is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementByEqualTo(Integer value) {
            addCriterion("increment_by =", value, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByNotEqualTo(Integer value) {
            addCriterion("increment_by <>", value, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByGreaterThan(Integer value) {
            addCriterion("increment_by >", value, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByGreaterThanOrEqualTo(Integer value) {
            addCriterion("increment_by >=", value, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByLessThan(Integer value) {
            addCriterion("increment_by <", value, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByLessThanOrEqualTo(Integer value) {
            addCriterion("increment_by <=", value, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByIn(List<Integer> values) {
            addCriterion("increment_by in", values, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByNotIn(List<Integer> values) {
            addCriterion("increment_by not in", values, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByBetween(Integer value1, Integer value2) {
            addCriterion("increment_by between", value1, value2, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andIncrementByNotBetween(Integer value1, Integer value2) {
            addCriterion("increment_by not between", value1, value2, "incrementBy");
            return (Criteria) this;
        }

        public Criteria andStartByIsNull() {
            addCriterion("start_by is null");
            return (Criteria) this;
        }

        public Criteria andStartByIsNotNull() {
            addCriterion("start_by is not null");
            return (Criteria) this;
        }

        public Criteria andStartByEqualTo(Integer value) {
            addCriterion("start_by =", value, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByNotEqualTo(Integer value) {
            addCriterion("start_by <>", value, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByGreaterThan(Integer value) {
            addCriterion("start_by >", value, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_by >=", value, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByLessThan(Integer value) {
            addCriterion("start_by <", value, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByLessThanOrEqualTo(Integer value) {
            addCriterion("start_by <=", value, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByIn(List<Integer> values) {
            addCriterion("start_by in", values, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByNotIn(List<Integer> values) {
            addCriterion("start_by not in", values, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByBetween(Integer value1, Integer value2) {
            addCriterion("start_by between", value1, value2, "startBy");
            return (Criteria) this;
        }

        public Criteria andStartByNotBetween(Integer value1, Integer value2) {
            addCriterion("start_by not between", value1, value2, "startBy");
            return (Criteria) this;
        }

        public Criteria andLastNumberIsNull() {
            addCriterion("last_number is null");
            return (Criteria) this;
        }

        public Criteria andLastNumberIsNotNull() {
            addCriterion("last_number is not null");
            return (Criteria) this;
        }

        public Criteria andLastNumberEqualTo(Integer value) {
            addCriterion("last_number =", value, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberNotEqualTo(Integer value) {
            addCriterion("last_number <>", value, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberGreaterThan(Integer value) {
            addCriterion("last_number >", value, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_number >=", value, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberLessThan(Integer value) {
            addCriterion("last_number <", value, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberLessThanOrEqualTo(Integer value) {
            addCriterion("last_number <=", value, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberIn(List<Integer> values) {
            addCriterion("last_number in", values, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberNotIn(List<Integer> values) {
            addCriterion("last_number not in", values, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberBetween(Integer value1, Integer value2) {
            addCriterion("last_number between", value1, value2, "lastNumber");
            return (Criteria) this;
        }

        public Criteria andLastNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("last_number not between", value1, value2, "lastNumber");
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