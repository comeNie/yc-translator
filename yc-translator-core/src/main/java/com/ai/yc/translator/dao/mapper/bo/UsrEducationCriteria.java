package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrEducationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrEducationCriteria() {
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

        public Criteria andEducationIdIsNull() {
            addCriterion("education_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("education_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(String value) {
            addCriterion("education_id =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(String value) {
            addCriterion("education_id <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(String value) {
            addCriterion("education_id >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(String value) {
            addCriterion("education_id >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(String value) {
            addCriterion("education_id <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(String value) {
            addCriterion("education_id <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLike(String value) {
            addCriterion("education_id like", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotLike(String value) {
            addCriterion("education_id not like", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<String> values) {
            addCriterion("education_id in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<String> values) {
            addCriterion("education_id not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(String value1, String value2) {
            addCriterion("education_id between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(String value1, String value2) {
            addCriterion("education_id not between", value1, value2, "educationId");
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

        public Criteria andStudyStartTimeIsNull() {
            addCriterion("study_start_time is null");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeIsNotNull() {
            addCriterion("study_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeEqualTo(String value) {
            addCriterion("study_start_time =", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeNotEqualTo(String value) {
            addCriterion("study_start_time <>", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeGreaterThan(String value) {
            addCriterion("study_start_time >", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("study_start_time >=", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeLessThan(String value) {
            addCriterion("study_start_time <", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeLessThanOrEqualTo(String value) {
            addCriterion("study_start_time <=", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeLike(String value) {
            addCriterion("study_start_time like", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeNotLike(String value) {
            addCriterion("study_start_time not like", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeIn(List<String> values) {
            addCriterion("study_start_time in", values, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeNotIn(List<String> values) {
            addCriterion("study_start_time not in", values, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeBetween(String value1, String value2) {
            addCriterion("study_start_time between", value1, value2, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeNotBetween(String value1, String value2) {
            addCriterion("study_start_time not between", value1, value2, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeIsNull() {
            addCriterion("study_end_time is null");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeIsNotNull() {
            addCriterion("study_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeEqualTo(String value) {
            addCriterion("study_end_time =", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeNotEqualTo(String value) {
            addCriterion("study_end_time <>", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeGreaterThan(String value) {
            addCriterion("study_end_time >", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("study_end_time >=", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeLessThan(String value) {
            addCriterion("study_end_time <", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeLessThanOrEqualTo(String value) {
            addCriterion("study_end_time <=", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeLike(String value) {
            addCriterion("study_end_time like", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeNotLike(String value) {
            addCriterion("study_end_time not like", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeIn(List<String> values) {
            addCriterion("study_end_time in", values, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeNotIn(List<String> values) {
            addCriterion("study_end_time not in", values, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeBetween(String value1, String value2) {
            addCriterion("study_end_time between", value1, value2, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeNotBetween(String value1, String value2) {
            addCriterion("study_end_time not between", value1, value2, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIsNull() {
            addCriterion("edu_background is null");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIsNotNull() {
            addCriterion("edu_background is not null");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundEqualTo(String value) {
            addCriterion("edu_background =", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotEqualTo(String value) {
            addCriterion("edu_background <>", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundGreaterThan(String value) {
            addCriterion("edu_background >", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("edu_background >=", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLessThan(String value) {
            addCriterion("edu_background <", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLessThanOrEqualTo(String value) {
            addCriterion("edu_background <=", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLike(String value) {
            addCriterion("edu_background like", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotLike(String value) {
            addCriterion("edu_background not like", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIn(List<String> values) {
            addCriterion("edu_background in", values, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotIn(List<String> values) {
            addCriterion("edu_background not in", values, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundBetween(String value1, String value2) {
            addCriterion("edu_background between", value1, value2, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotBetween(String value1, String value2) {
            addCriterion("edu_background not between", value1, value2, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andEduAddrIsNull() {
            addCriterion("edu_addr is null");
            return (Criteria) this;
        }

        public Criteria andEduAddrIsNotNull() {
            addCriterion("edu_addr is not null");
            return (Criteria) this;
        }

        public Criteria andEduAddrEqualTo(String value) {
            addCriterion("edu_addr =", value, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrNotEqualTo(String value) {
            addCriterion("edu_addr <>", value, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrGreaterThan(String value) {
            addCriterion("edu_addr >", value, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrGreaterThanOrEqualTo(String value) {
            addCriterion("edu_addr >=", value, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrLessThan(String value) {
            addCriterion("edu_addr <", value, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrLessThanOrEqualTo(String value) {
            addCriterion("edu_addr <=", value, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrLike(String value) {
            addCriterion("edu_addr like", value, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrNotLike(String value) {
            addCriterion("edu_addr not like", value, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrIn(List<String> values) {
            addCriterion("edu_addr in", values, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrNotIn(List<String> values) {
            addCriterion("edu_addr not in", values, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrBetween(String value1, String value2) {
            addCriterion("edu_addr between", value1, value2, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andEduAddrNotBetween(String value1, String value2) {
            addCriterion("edu_addr not between", value1, value2, "eduAddr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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