package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrUserCriteria() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(Integer value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(Integer value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(Integer value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(Integer value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(Integer value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(Integer value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<Integer> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<Integer> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(Integer value1, Integer value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(Integer value1, Integer value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(Integer value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(Integer value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(Integer value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(Integer value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(Integer value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(Integer value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<Integer> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<Integer> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(Integer value1, Integer value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(Integer value1, Integer value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelIsNull() {
            addCriterion("safety_level is null");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelIsNotNull() {
            addCriterion("safety_level is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelEqualTo(String value) {
            addCriterion("safety_level =", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelNotEqualTo(String value) {
            addCriterion("safety_level <>", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelGreaterThan(String value) {
            addCriterion("safety_level >", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("safety_level >=", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelLessThan(String value) {
            addCriterion("safety_level <", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelLessThanOrEqualTo(String value) {
            addCriterion("safety_level <=", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelLike(String value) {
            addCriterion("safety_level like", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelNotLike(String value) {
            addCriterion("safety_level not like", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelIn(List<String> values) {
            addCriterion("safety_level in", values, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelNotIn(List<String> values) {
            addCriterion("safety_level not in", values, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelBetween(String value1, String value2) {
            addCriterion("safety_level between", value1, value2, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelNotBetween(String value1, String value2) {
            addCriterion("safety_level not between", value1, value2, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNull() {
            addCriterion("regist_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Timestamp value) {
            addCriterion("regist_time =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Timestamp value) {
            addCriterion("regist_time <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Timestamp value) {
            addCriterion("regist_time >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("regist_time >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Timestamp value) {
            addCriterion("regist_time <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("regist_time <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Timestamp> values) {
            addCriterion("regist_time in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Timestamp> values) {
            addCriterion("regist_time not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("regist_time between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("regist_time not between", value1, value2, "registTime");
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

        public Criteria andUsersourceIsNull() {
            addCriterion("usersource is null");
            return (Criteria) this;
        }

        public Criteria andUsersourceIsNotNull() {
            addCriterion("usersource is not null");
            return (Criteria) this;
        }

        public Criteria andUsersourceEqualTo(String value) {
            addCriterion("usersource =", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceNotEqualTo(String value) {
            addCriterion("usersource <>", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceGreaterThan(String value) {
            addCriterion("usersource >", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceGreaterThanOrEqualTo(String value) {
            addCriterion("usersource >=", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceLessThan(String value) {
            addCriterion("usersource <", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceLessThanOrEqualTo(String value) {
            addCriterion("usersource <=", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceLike(String value) {
            addCriterion("usersource like", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceNotLike(String value) {
            addCriterion("usersource not like", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceIn(List<String> values) {
            addCriterion("usersource in", values, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceNotIn(List<String> values) {
            addCriterion("usersource not in", values, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceBetween(String value1, String value2) {
            addCriterion("usersource between", value1, value2, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceNotBetween(String value1, String value2) {
            addCriterion("usersource not between", value1, value2, "usersource");
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

        public Criteria andPersonsignIsNull() {
            addCriterion("personsign is null");
            return (Criteria) this;
        }

        public Criteria andPersonsignIsNotNull() {
            addCriterion("personsign is not null");
            return (Criteria) this;
        }

        public Criteria andPersonsignEqualTo(String value) {
            addCriterion("personsign =", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignNotEqualTo(String value) {
            addCriterion("personsign <>", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignGreaterThan(String value) {
            addCriterion("personsign >", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignGreaterThanOrEqualTo(String value) {
            addCriterion("personsign >=", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignLessThan(String value) {
            addCriterion("personsign <", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignLessThanOrEqualTo(String value) {
            addCriterion("personsign <=", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignLike(String value) {
            addCriterion("personsign like", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignNotLike(String value) {
            addCriterion("personsign not like", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignIn(List<String> values) {
            addCriterion("personsign in", values, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignNotIn(List<String> values) {
            addCriterion("personsign not in", values, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignBetween(String value1, String value2) {
            addCriterion("personsign between", value1, value2, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignNotBetween(String value1, String value2) {
            addCriterion("personsign not between", value1, value2, "personsign");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andPortraitIdIsNull() {
            addCriterion("portrait_id is null");
            return (Criteria) this;
        }

        public Criteria andPortraitIdIsNotNull() {
            addCriterion("portrait_id is not null");
            return (Criteria) this;
        }

        public Criteria andPortraitIdEqualTo(String value) {
            addCriterion("portrait_id =", value, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdNotEqualTo(String value) {
            addCriterion("portrait_id <>", value, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdGreaterThan(String value) {
            addCriterion("portrait_id >", value, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdGreaterThanOrEqualTo(String value) {
            addCriterion("portrait_id >=", value, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdLessThan(String value) {
            addCriterion("portrait_id <", value, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdLessThanOrEqualTo(String value) {
            addCriterion("portrait_id <=", value, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdLike(String value) {
            addCriterion("portrait_id like", value, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdNotLike(String value) {
            addCriterion("portrait_id not like", value, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdIn(List<String> values) {
            addCriterion("portrait_id in", values, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdNotIn(List<String> values) {
            addCriterion("portrait_id not in", values, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdBetween(String value1, String value2) {
            addCriterion("portrait_id between", value1, value2, "portraitId");
            return (Criteria) this;
        }

        public Criteria andPortraitIdNotBetween(String value1, String value2) {
            addCriterion("portrait_id not between", value1, value2, "portraitId");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNull() {
            addCriterion("is_change is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNotNull() {
            addCriterion("is_change is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeEqualTo(String value) {
            addCriterion("is_change =", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotEqualTo(String value) {
            addCriterion("is_change <>", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThan(String value) {
            addCriterion("is_change >", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThanOrEqualTo(String value) {
            addCriterion("is_change >=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThan(String value) {
            addCriterion("is_change <", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThanOrEqualTo(String value) {
            addCriterion("is_change <=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLike(String value) {
            addCriterion("is_change like", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotLike(String value) {
            addCriterion("is_change not like", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeIn(List<String> values) {
            addCriterion("is_change in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotIn(List<String> values) {
            addCriterion("is_change not in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeBetween(String value1, String value2) {
            addCriterion("is_change between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotBetween(String value1, String value2) {
            addCriterion("is_change not between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorIsNull() {
            addCriterion("is_translator is null");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorIsNotNull() {
            addCriterion("is_translator is not null");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorEqualTo(Integer value) {
            addCriterion("is_translator =", value, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorNotEqualTo(Integer value) {
            addCriterion("is_translator <>", value, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorGreaterThan(Integer value) {
            addCriterion("is_translator >", value, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_translator >=", value, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorLessThan(Integer value) {
            addCriterion("is_translator <", value, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorLessThanOrEqualTo(Integer value) {
            addCriterion("is_translator <=", value, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorIn(List<Integer> values) {
            addCriterion("is_translator in", values, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorNotIn(List<Integer> values) {
            addCriterion("is_translator not in", values, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorBetween(Integer value1, Integer value2) {
            addCriterion("is_translator between", value1, value2, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andIsTranslatorNotBetween(Integer value1, Integer value2) {
            addCriterion("is_translator not between", value1, value2, "isTranslator");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelIsNull() {
            addCriterion("griwth_level is null");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelIsNotNull() {
            addCriterion("griwth_level is not null");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelEqualTo(String value) {
            addCriterion("griwth_level =", value, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelNotEqualTo(String value) {
            addCriterion("griwth_level <>", value, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelGreaterThan(String value) {
            addCriterion("griwth_level >", value, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelGreaterThanOrEqualTo(String value) {
            addCriterion("griwth_level >=", value, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelLessThan(String value) {
            addCriterion("griwth_level <", value, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelLessThanOrEqualTo(String value) {
            addCriterion("griwth_level <=", value, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelLike(String value) {
            addCriterion("griwth_level like", value, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelNotLike(String value) {
            addCriterion("griwth_level not like", value, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelIn(List<String> values) {
            addCriterion("griwth_level in", values, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelNotIn(List<String> values) {
            addCriterion("griwth_level not in", values, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelBetween(String value1, String value2) {
            addCriterion("griwth_level between", value1, value2, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthLevelNotBetween(String value1, String value2) {
            addCriterion("griwth_level not between", value1, value2, "griwthLevel");
            return (Criteria) this;
        }

        public Criteria andGriwthValueIsNull() {
            addCriterion("griwth_value is null");
            return (Criteria) this;
        }

        public Criteria andGriwthValueIsNotNull() {
            addCriterion("griwth_value is not null");
            return (Criteria) this;
        }

        public Criteria andGriwthValueEqualTo(Integer value) {
            addCriterion("griwth_value =", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueNotEqualTo(Integer value) {
            addCriterion("griwth_value <>", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueGreaterThan(Integer value) {
            addCriterion("griwth_value >", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("griwth_value >=", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueLessThan(Integer value) {
            addCriterion("griwth_value <", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueLessThanOrEqualTo(Integer value) {
            addCriterion("griwth_value <=", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueIn(List<Integer> values) {
            addCriterion("griwth_value in", values, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueNotIn(List<Integer> values) {
            addCriterion("griwth_value not in", values, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueBetween(Integer value1, Integer value2) {
            addCriterion("griwth_value between", value1, value2, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueNotBetween(Integer value1, Integer value2) {
            addCriterion("griwth_value not between", value1, value2, "griwthValue");
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