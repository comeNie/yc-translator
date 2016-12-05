package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrCertificateCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrCertificateCriteria() {
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

        public Criteria andCertificationIdIsNull() {
            addCriterion("certification_id is null");
            return (Criteria) this;
        }

        public Criteria andCertificationIdIsNotNull() {
            addCriterion("certification_id is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationIdEqualTo(String value) {
            addCriterion("certification_id =", value, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdNotEqualTo(String value) {
            addCriterion("certification_id <>", value, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdGreaterThan(String value) {
            addCriterion("certification_id >", value, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdGreaterThanOrEqualTo(String value) {
            addCriterion("certification_id >=", value, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdLessThan(String value) {
            addCriterion("certification_id <", value, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdLessThanOrEqualTo(String value) {
            addCriterion("certification_id <=", value, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdLike(String value) {
            addCriterion("certification_id like", value, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdNotLike(String value) {
            addCriterion("certification_id not like", value, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdIn(List<String> values) {
            addCriterion("certification_id in", values, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdNotIn(List<String> values) {
            addCriterion("certification_id not in", values, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdBetween(String value1, String value2) {
            addCriterion("certification_id between", value1, value2, "certificationId");
            return (Criteria) this;
        }

        public Criteria andCertificationIdNotBetween(String value1, String value2) {
            addCriterion("certification_id not between", value1, value2, "certificationId");
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

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("certificate_type like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("certificate_type not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIsNull() {
            addCriterion("certificate_level is null");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIsNotNull() {
            addCriterion("certificate_level is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelEqualTo(String value) {
            addCriterion("certificate_level =", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotEqualTo(String value) {
            addCriterion("certificate_level <>", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelGreaterThan(String value) {
            addCriterion("certificate_level >", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_level >=", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelLessThan(String value) {
            addCriterion("certificate_level <", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelLessThanOrEqualTo(String value) {
            addCriterion("certificate_level <=", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelLike(String value) {
            addCriterion("certificate_level like", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotLike(String value) {
            addCriterion("certificate_level not like", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIn(List<String> values) {
            addCriterion("certificate_level in", values, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotIn(List<String> values) {
            addCriterion("certificate_level not in", values, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelBetween(String value1, String value2) {
            addCriterion("certificate_level between", value1, value2, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotBetween(String value1, String value2) {
            addCriterion("certificate_level not between", value1, value2, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNull() {
            addCriterion("certificate_name is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNotNull() {
            addCriterion("certificate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameEqualTo(String value) {
            addCriterion("certificate_name =", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotEqualTo(String value) {
            addCriterion("certificate_name <>", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThan(String value) {
            addCriterion("certificate_name >", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_name >=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThan(String value) {
            addCriterion("certificate_name <", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThanOrEqualTo(String value) {
            addCriterion("certificate_name <=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLike(String value) {
            addCriterion("certificate_name like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotLike(String value) {
            addCriterion("certificate_name not like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIn(List<String> values) {
            addCriterion("certificate_name in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotIn(List<String> values) {
            addCriterion("certificate_name not in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameBetween(String value1, String value2) {
            addCriterion("certificate_name between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotBetween(String value1, String value2) {
            addCriterion("certificate_name not between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionIsNull() {
            addCriterion("granting_institution is null");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionIsNotNull() {
            addCriterion("granting_institution is not null");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionEqualTo(String value) {
            addCriterion("granting_institution =", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionNotEqualTo(String value) {
            addCriterion("granting_institution <>", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionGreaterThan(String value) {
            addCriterion("granting_institution >", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("granting_institution >=", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionLessThan(String value) {
            addCriterion("granting_institution <", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionLessThanOrEqualTo(String value) {
            addCriterion("granting_institution <=", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionLike(String value) {
            addCriterion("granting_institution like", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionNotLike(String value) {
            addCriterion("granting_institution not like", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionIn(List<String> values) {
            addCriterion("granting_institution in", values, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionNotIn(List<String> values) {
            addCriterion("granting_institution not in", values, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionBetween(String value1, String value2) {
            addCriterion("granting_institution between", value1, value2, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionNotBetween(String value1, String value2) {
            addCriterion("granting_institution not between", value1, value2, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeIsNull() {
            addCriterion("awarded_time is null");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeIsNotNull() {
            addCriterion("awarded_time is not null");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeEqualTo(String value) {
            addCriterion("awarded_time =", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeNotEqualTo(String value) {
            addCriterion("awarded_time <>", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeGreaterThan(String value) {
            addCriterion("awarded_time >", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("awarded_time >=", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeLessThan(String value) {
            addCriterion("awarded_time <", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeLessThanOrEqualTo(String value) {
            addCriterion("awarded_time <=", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeLike(String value) {
            addCriterion("awarded_time like", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeNotLike(String value) {
            addCriterion("awarded_time not like", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeIn(List<String> values) {
            addCriterion("awarded_time in", values, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeNotIn(List<String> values) {
            addCriterion("awarded_time not in", values, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeBetween(String value1, String value2) {
            addCriterion("awarded_time between", value1, value2, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeNotBetween(String value1, String value2) {
            addCriterion("awarded_time not between", value1, value2, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeIsNull() {
            addCriterion("certificates_describe is null");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeIsNotNull() {
            addCriterion("certificates_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeEqualTo(String value) {
            addCriterion("certificates_describe =", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeNotEqualTo(String value) {
            addCriterion("certificates_describe <>", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeGreaterThan(String value) {
            addCriterion("certificates_describe >", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("certificates_describe >=", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeLessThan(String value) {
            addCriterion("certificates_describe <", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeLessThanOrEqualTo(String value) {
            addCriterion("certificates_describe <=", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeLike(String value) {
            addCriterion("certificates_describe like", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeNotLike(String value) {
            addCriterion("certificates_describe not like", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeIn(List<String> values) {
            addCriterion("certificates_describe in", values, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeNotIn(List<String> values) {
            addCriterion("certificates_describe not in", values, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeBetween(String value1, String value2) {
            addCriterion("certificates_describe between", value1, value2, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeNotBetween(String value1, String value2) {
            addCriterion("certificates_describe not between", value1, value2, "certificatesDescribe");
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