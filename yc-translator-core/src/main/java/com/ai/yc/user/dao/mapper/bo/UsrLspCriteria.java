package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrLspCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrLspCriteria() {
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

        public Criteria andLspNameIsNull() {
            addCriterion("lsp_name is null");
            return (Criteria) this;
        }

        public Criteria andLspNameIsNotNull() {
            addCriterion("lsp_name is not null");
            return (Criteria) this;
        }

        public Criteria andLspNameEqualTo(String value) {
            addCriterion("lsp_name =", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameNotEqualTo(String value) {
            addCriterion("lsp_name <>", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameGreaterThan(String value) {
            addCriterion("lsp_name >", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameGreaterThanOrEqualTo(String value) {
            addCriterion("lsp_name >=", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameLessThan(String value) {
            addCriterion("lsp_name <", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameLessThanOrEqualTo(String value) {
            addCriterion("lsp_name <=", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameLike(String value) {
            addCriterion("lsp_name like", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameNotLike(String value) {
            addCriterion("lsp_name not like", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameIn(List<String> values) {
            addCriterion("lsp_name in", values, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameNotIn(List<String> values) {
            addCriterion("lsp_name not in", values, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameBetween(String value1, String value2) {
            addCriterion("lsp_name between", value1, value2, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameNotBetween(String value1, String value2) {
            addCriterion("lsp_name not between", value1, value2, "lspName");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionIsNull() {
            addCriterion("company_introduction is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionIsNotNull() {
            addCriterion("company_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionEqualTo(String value) {
            addCriterion("company_introduction =", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionNotEqualTo(String value) {
            addCriterion("company_introduction <>", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionGreaterThan(String value) {
            addCriterion("company_introduction >", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("company_introduction >=", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionLessThan(String value) {
            addCriterion("company_introduction <", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionLessThanOrEqualTo(String value) {
            addCriterion("company_introduction <=", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionLike(String value) {
            addCriterion("company_introduction like", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionNotLike(String value) {
            addCriterion("company_introduction not like", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionIn(List<String> values) {
            addCriterion("company_introduction in", values, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionNotIn(List<String> values) {
            addCriterion("company_introduction not in", values, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionBetween(String value1, String value2) {
            addCriterion("company_introduction between", value1, value2, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionNotBetween(String value1, String value2) {
            addCriterion("company_introduction not between", value1, value2, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdIsNull() {
            addCriterion("company_logo_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdIsNotNull() {
            addCriterion("company_logo_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdEqualTo(String value) {
            addCriterion("company_logo_id =", value, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdNotEqualTo(String value) {
            addCriterion("company_logo_id <>", value, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdGreaterThan(String value) {
            addCriterion("company_logo_id >", value, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_logo_id >=", value, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdLessThan(String value) {
            addCriterion("company_logo_id <", value, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdLessThanOrEqualTo(String value) {
            addCriterion("company_logo_id <=", value, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdLike(String value) {
            addCriterion("company_logo_id like", value, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdNotLike(String value) {
            addCriterion("company_logo_id not like", value, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdIn(List<String> values) {
            addCriterion("company_logo_id in", values, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdNotIn(List<String> values) {
            addCriterion("company_logo_id not in", values, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdBetween(String value1, String value2) {
            addCriterion("company_logo_id between", value1, value2, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIdNotBetween(String value1, String value2) {
            addCriterion("company_logo_id not between", value1, value2, "companyLogoId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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