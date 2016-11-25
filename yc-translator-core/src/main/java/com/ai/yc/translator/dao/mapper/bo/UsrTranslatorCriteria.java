package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrTranslatorCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrTranslatorCriteria() {
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("lastname is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("lastname is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("lastname =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("lastname <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("lastname >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("lastname >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("lastname <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("lastname <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("lastname like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("lastname not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("lastname in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("lastname not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("lastname between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("lastname not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("firstname is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("firstname is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("firstname =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("firstname <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("firstname >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("firstname >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("firstname <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("firstname <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("firstname like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("firstname not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("firstname in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("firstname not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("firstname between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("firstname not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Timestamp value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Timestamp value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Timestamp value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Timestamp value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Timestamp value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Timestamp> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Timestamp> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Timestamp value1, Timestamp value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIsNull() {
            addCriterion("fix_phone is null");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIsNotNull() {
            addCriterion("fix_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFixPhoneEqualTo(String value) {
            addCriterion("fix_phone =", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotEqualTo(String value) {
            addCriterion("fix_phone <>", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneGreaterThan(String value) {
            addCriterion("fix_phone >", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fix_phone >=", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLessThan(String value) {
            addCriterion("fix_phone <", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLessThanOrEqualTo(String value) {
            addCriterion("fix_phone <=", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLike(String value) {
            addCriterion("fix_phone like", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotLike(String value) {
            addCriterion("fix_phone not like", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIn(List<String> values) {
            addCriterion("fix_phone in", values, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotIn(List<String> values) {
            addCriterion("fix_phone not in", values, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneBetween(String value1, String value2) {
            addCriterion("fix_phone between", value1, value2, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotBetween(String value1, String value2) {
            addCriterion("fix_phone not between", value1, value2, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNull() {
            addCriterion("cn_city is null");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNotNull() {
            addCriterion("cn_city is not null");
            return (Criteria) this;
        }

        public Criteria andCnCityEqualTo(String value) {
            addCriterion("cn_city =", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotEqualTo(String value) {
            addCriterion("cn_city <>", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThan(String value) {
            addCriterion("cn_city >", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThanOrEqualTo(String value) {
            addCriterion("cn_city >=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThan(String value) {
            addCriterion("cn_city <", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThanOrEqualTo(String value) {
            addCriterion("cn_city <=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLike(String value) {
            addCriterion("cn_city like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotLike(String value) {
            addCriterion("cn_city not like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityIn(List<String> values) {
            addCriterion("cn_city in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotIn(List<String> values) {
            addCriterion("cn_city not in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityBetween(String value1, String value2) {
            addCriterion("cn_city between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotBetween(String value1, String value2) {
            addCriterion("cn_city not between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
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

        public Criteria andTZoneIsNull() {
            addCriterion("t_zone is null");
            return (Criteria) this;
        }

        public Criteria andTZoneIsNotNull() {
            addCriterion("t_zone is not null");
            return (Criteria) this;
        }

        public Criteria andTZoneEqualTo(String value) {
            addCriterion("t_zone =", value, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneNotEqualTo(String value) {
            addCriterion("t_zone <>", value, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneGreaterThan(String value) {
            addCriterion("t_zone >", value, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_zone >=", value, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneLessThan(String value) {
            addCriterion("t_zone <", value, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneLessThanOrEqualTo(String value) {
            addCriterion("t_zone <=", value, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneLike(String value) {
            addCriterion("t_zone like", value, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneNotLike(String value) {
            addCriterion("t_zone not like", value, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneIn(List<String> values) {
            addCriterion("t_zone in", values, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneNotIn(List<String> values) {
            addCriterion("t_zone not in", values, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneBetween(String value1, String value2) {
            addCriterion("t_zone between", value1, value2, "tZone");
            return (Criteria) this;
        }

        public Criteria andTZoneNotBetween(String value1, String value2) {
            addCriterion("t_zone not between", value1, value2, "tZone");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeIsNull() {
            addCriterion("working_life is null");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeIsNotNull() {
            addCriterion("working_life is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeEqualTo(Integer value) {
            addCriterion("working_life =", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeNotEqualTo(Integer value) {
            addCriterion("working_life <>", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeGreaterThan(Integer value) {
            addCriterion("working_life >", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeGreaterThanOrEqualTo(Integer value) {
            addCriterion("working_life >=", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeLessThan(Integer value) {
            addCriterion("working_life <", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeLessThanOrEqualTo(Integer value) {
            addCriterion("working_life <=", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeIn(List<Integer> values) {
            addCriterion("working_life in", values, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeNotIn(List<Integer> values) {
            addCriterion("working_life not in", values, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeBetween(Integer value1, Integer value2) {
            addCriterion("working_life between", value1, value2, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeNotBetween(Integer value1, Integer value2) {
            addCriterion("working_life not between", value1, value2, "workingLife");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumIsNull() {
            addCriterion("legal_cert_num is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumIsNotNull() {
            addCriterion("legal_cert_num is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumEqualTo(String value) {
            addCriterion("legal_cert_num =", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumNotEqualTo(String value) {
            addCriterion("legal_cert_num <>", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumGreaterThan(String value) {
            addCriterion("legal_cert_num >", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumGreaterThanOrEqualTo(String value) {
            addCriterion("legal_cert_num >=", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumLessThan(String value) {
            addCriterion("legal_cert_num <", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumLessThanOrEqualTo(String value) {
            addCriterion("legal_cert_num <=", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumLike(String value) {
            addCriterion("legal_cert_num like", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumNotLike(String value) {
            addCriterion("legal_cert_num not like", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumIn(List<String> values) {
            addCriterion("legal_cert_num in", values, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumNotIn(List<String> values) {
            addCriterion("legal_cert_num not in", values, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumBetween(String value1, String value2) {
            addCriterion("legal_cert_num between", value1, value2, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumNotBetween(String value1, String value2) {
            addCriterion("legal_cert_num not between", value1, value2, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIsNull() {
            addCriterion("mother_tongue is null");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIsNotNull() {
            addCriterion("mother_tongue is not null");
            return (Criteria) this;
        }

        public Criteria andMotherTongueEqualTo(String value) {
            addCriterion("mother_tongue =", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotEqualTo(String value) {
            addCriterion("mother_tongue <>", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueGreaterThan(String value) {
            addCriterion("mother_tongue >", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueGreaterThanOrEqualTo(String value) {
            addCriterion("mother_tongue >=", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLessThan(String value) {
            addCriterion("mother_tongue <", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLessThanOrEqualTo(String value) {
            addCriterion("mother_tongue <=", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLike(String value) {
            addCriterion("mother_tongue like", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotLike(String value) {
            addCriterion("mother_tongue not like", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIn(List<String> values) {
            addCriterion("mother_tongue in", values, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotIn(List<String> values) {
            addCriterion("mother_tongue not in", values, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueBetween(String value1, String value2) {
            addCriterion("mother_tongue between", value1, value2, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotBetween(String value1, String value2) {
            addCriterion("mother_tongue not between", value1, value2, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Timestamp value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Timestamp value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Timestamp value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Timestamp value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Timestamp> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Timestamp> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("vip_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(String value) {
            addCriterion("vip_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(String value) {
            addCriterion("vip_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(String value) {
            addCriterion("vip_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(String value) {
            addCriterion("vip_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(String value) {
            addCriterion("vip_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(String value) {
            addCriterion("vip_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLike(String value) {
            addCriterion("vip_level like", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotLike(String value) {
            addCriterion("vip_level not like", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<String> values) {
            addCriterion("vip_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<String> values) {
            addCriterion("vip_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(String value1, String value2) {
            addCriterion("vip_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(String value1, String value2) {
            addCriterion("vip_level not between", value1, value2, "vipLevel");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andBillingCycleIsNull() {
            addCriterion("billing_cycle is null");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIsNotNull() {
            addCriterion("billing_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andBillingCycleEqualTo(Integer value) {
            addCriterion("billing_cycle =", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleNotEqualTo(Integer value) {
            addCriterion("billing_cycle <>", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleGreaterThan(Integer value) {
            addCriterion("billing_cycle >", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_cycle >=", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleLessThan(Integer value) {
            addCriterion("billing_cycle <", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleLessThanOrEqualTo(Integer value) {
            addCriterion("billing_cycle <=", value, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleIn(List<Integer> values) {
            addCriterion("billing_cycle in", values, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleNotIn(List<Integer> values) {
            addCriterion("billing_cycle not in", values, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleBetween(Integer value1, Integer value2) {
            addCriterion("billing_cycle between", value1, value2, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andBillingCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_cycle not between", value1, value2, "billingCycle");
            return (Criteria) this;
        }

        public Criteria andStatementDateIsNull() {
            addCriterion("statement_date is null");
            return (Criteria) this;
        }

        public Criteria andStatementDateIsNotNull() {
            addCriterion("statement_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatementDateEqualTo(Timestamp value) {
            addCriterion("statement_date =", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateNotEqualTo(Timestamp value) {
            addCriterion("statement_date <>", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateGreaterThan(Timestamp value) {
            addCriterion("statement_date >", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("statement_date >=", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateLessThan(Timestamp value) {
            addCriterion("statement_date <", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("statement_date <=", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateIn(List<Timestamp> values) {
            addCriterion("statement_date in", values, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateNotIn(List<Timestamp> values) {
            addCriterion("statement_date not in", values, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("statement_date between", value1, value2, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("statement_date not between", value1, value2, "statementDate");
            return (Criteria) this;
        }

        public Criteria andInfoStateIsNull() {
            addCriterion("info_state is null");
            return (Criteria) this;
        }

        public Criteria andInfoStateIsNotNull() {
            addCriterion("info_state is not null");
            return (Criteria) this;
        }

        public Criteria andInfoStateEqualTo(String value) {
            addCriterion("info_state =", value, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateNotEqualTo(String value) {
            addCriterion("info_state <>", value, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateGreaterThan(String value) {
            addCriterion("info_state >", value, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateGreaterThanOrEqualTo(String value) {
            addCriterion("info_state >=", value, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateLessThan(String value) {
            addCriterion("info_state <", value, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateLessThanOrEqualTo(String value) {
            addCriterion("info_state <=", value, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateLike(String value) {
            addCriterion("info_state like", value, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateNotLike(String value) {
            addCriterion("info_state not like", value, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateIn(List<String> values) {
            addCriterion("info_state in", values, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateNotIn(List<String> values) {
            addCriterion("info_state not in", values, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateBetween(String value1, String value2) {
            addCriterion("info_state between", value1, value2, "infoState");
            return (Criteria) this;
        }

        public Criteria andInfoStateNotBetween(String value1, String value2) {
            addCriterion("info_state not between", value1, value2, "infoState");
            return (Criteria) this;
        }

        public Criteria andApproveStateIsNull() {
            addCriterion("approve_state is null");
            return (Criteria) this;
        }

        public Criteria andApproveStateIsNotNull() {
            addCriterion("approve_state is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStateEqualTo(String value) {
            addCriterion("approve_state =", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotEqualTo(String value) {
            addCriterion("approve_state <>", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateGreaterThan(String value) {
            addCriterion("approve_state >", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateGreaterThanOrEqualTo(String value) {
            addCriterion("approve_state >=", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLessThan(String value) {
            addCriterion("approve_state <", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLessThanOrEqualTo(String value) {
            addCriterion("approve_state <=", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLike(String value) {
            addCriterion("approve_state like", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotLike(String value) {
            addCriterion("approve_state not like", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateIn(List<String> values) {
            addCriterion("approve_state in", values, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotIn(List<String> values) {
            addCriterion("approve_state not in", values, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateBetween(String value1, String value2) {
            addCriterion("approve_state between", value1, value2, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotBetween(String value1, String value2) {
            addCriterion("approve_state not between", value1, value2, "approveState");
            return (Criteria) this;
        }

        public Criteria andSingleLockIsNull() {
            addCriterion("single_lock is null");
            return (Criteria) this;
        }

        public Criteria andSingleLockIsNotNull() {
            addCriterion("single_lock is not null");
            return (Criteria) this;
        }

        public Criteria andSingleLockEqualTo(String value) {
            addCriterion("single_lock =", value, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockNotEqualTo(String value) {
            addCriterion("single_lock <>", value, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockGreaterThan(String value) {
            addCriterion("single_lock >", value, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockGreaterThanOrEqualTo(String value) {
            addCriterion("single_lock >=", value, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockLessThan(String value) {
            addCriterion("single_lock <", value, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockLessThanOrEqualTo(String value) {
            addCriterion("single_lock <=", value, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockLike(String value) {
            addCriterion("single_lock like", value, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockNotLike(String value) {
            addCriterion("single_lock not like", value, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockIn(List<String> values) {
            addCriterion("single_lock in", values, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockNotIn(List<String> values) {
            addCriterion("single_lock not in", values, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockBetween(String value1, String value2) {
            addCriterion("single_lock between", value1, value2, "singleLock");
            return (Criteria) this;
        }

        public Criteria andSingleLockNotBetween(String value1, String value2) {
            addCriterion("single_lock not between", value1, value2, "singleLock");
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