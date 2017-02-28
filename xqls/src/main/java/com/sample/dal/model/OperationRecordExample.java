package com.sample.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperationRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperationRecordExample() {
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

        public Criteria andOperationNoIsNull() {
            addCriterion("operation_no is null");
            return (Criteria) this;
        }

        public Criteria andOperationNoIsNotNull() {
            addCriterion("operation_no is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNoEqualTo(String value) {
            addCriterion("operation_no =", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoNotEqualTo(String value) {
            addCriterion("operation_no <>", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoGreaterThan(String value) {
            addCriterion("operation_no >", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoGreaterThanOrEqualTo(String value) {
            addCriterion("operation_no >=", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoLessThan(String value) {
            addCriterion("operation_no <", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoLessThanOrEqualTo(String value) {
            addCriterion("operation_no <=", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoLike(String value) {
            addCriterion("operation_no like", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoNotLike(String value) {
            addCriterion("operation_no not like", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoIn(List<String> values) {
            addCriterion("operation_no in", values, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoNotIn(List<String> values) {
            addCriterion("operation_no not in", values, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoBetween(String value1, String value2) {
            addCriterion("operation_no between", value1, value2, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoNotBetween(String value1, String value2) {
            addCriterion("operation_no not between", value1, value2, "operationNo");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIsNull() {
            addCriterion("recording_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIsNotNull() {
            addCriterion("recording_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeEqualTo(Date value) {
            addCriterion("recording_time =", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotEqualTo(Date value) {
            addCriterion("recording_time <>", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeGreaterThan(Date value) {
            addCriterion("recording_time >", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recording_time >=", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeLessThan(Date value) {
            addCriterion("recording_time <", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeLessThanOrEqualTo(Date value) {
            addCriterion("recording_time <=", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIn(List<Date> values) {
            addCriterion("recording_time in", values, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotIn(List<Date> values) {
            addCriterion("recording_time not in", values, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeBetween(Date value1, Date value2) {
            addCriterion("recording_time between", value1, value2, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotBetween(Date value1, Date value2) {
            addCriterion("recording_time not between", value1, value2, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoIsNull() {
            addCriterion("dictionary_no is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoIsNotNull() {
            addCriterion("dictionary_no is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoEqualTo(String value) {
            addCriterion("dictionary_no =", value, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoNotEqualTo(String value) {
            addCriterion("dictionary_no <>", value, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoGreaterThan(String value) {
            addCriterion("dictionary_no >", value, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_no >=", value, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoLessThan(String value) {
            addCriterion("dictionary_no <", value, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoLessThanOrEqualTo(String value) {
            addCriterion("dictionary_no <=", value, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoLike(String value) {
            addCriterion("dictionary_no like", value, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoNotLike(String value) {
            addCriterion("dictionary_no not like", value, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoIn(List<String> values) {
            addCriterion("dictionary_no in", values, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoNotIn(List<String> values) {
            addCriterion("dictionary_no not in", values, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoBetween(String value1, String value2) {
            addCriterion("dictionary_no between", value1, value2, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryNoNotBetween(String value1, String value2) {
            addCriterion("dictionary_no not between", value1, value2, "dictionaryNo");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextIsNull() {
            addCriterion("dictionary_context is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextIsNotNull() {
            addCriterion("dictionary_context is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextEqualTo(String value) {
            addCriterion("dictionary_context =", value, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextNotEqualTo(String value) {
            addCriterion("dictionary_context <>", value, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextGreaterThan(String value) {
            addCriterion("dictionary_context >", value, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_context >=", value, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextLessThan(String value) {
            addCriterion("dictionary_context <", value, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextLessThanOrEqualTo(String value) {
            addCriterion("dictionary_context <=", value, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextLike(String value) {
            addCriterion("dictionary_context like", value, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextNotLike(String value) {
            addCriterion("dictionary_context not like", value, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextIn(List<String> values) {
            addCriterion("dictionary_context in", values, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextNotIn(List<String> values) {
            addCriterion("dictionary_context not in", values, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextBetween(String value1, String value2) {
            addCriterion("dictionary_context between", value1, value2, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andDictionaryContextNotBetween(String value1, String value2) {
            addCriterion("dictionary_context not between", value1, value2, "dictionaryContext");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoIsNull() {
            addCriterion("enterprise_no is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoIsNotNull() {
            addCriterion("enterprise_no is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoEqualTo(String value) {
            addCriterion("enterprise_no =", value, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoNotEqualTo(String value) {
            addCriterion("enterprise_no <>", value, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoGreaterThan(String value) {
            addCriterion("enterprise_no >", value, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_no >=", value, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoLessThan(String value) {
            addCriterion("enterprise_no <", value, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoLessThanOrEqualTo(String value) {
            addCriterion("enterprise_no <=", value, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoLike(String value) {
            addCriterion("enterprise_no like", value, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoNotLike(String value) {
            addCriterion("enterprise_no not like", value, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoIn(List<String> values) {
            addCriterion("enterprise_no in", values, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoNotIn(List<String> values) {
            addCriterion("enterprise_no not in", values, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoBetween(String value1, String value2) {
            addCriterion("enterprise_no between", value1, value2, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNoNotBetween(String value1, String value2) {
            addCriterion("enterprise_no not between", value1, value2, "enterpriseNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoIsNull() {
            addCriterion("tenant_no is null");
            return (Criteria) this;
        }

        public Criteria andTenantNoIsNotNull() {
            addCriterion("tenant_no is not null");
            return (Criteria) this;
        }

        public Criteria andTenantNoEqualTo(String value) {
            addCriterion("tenant_no =", value, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoNotEqualTo(String value) {
            addCriterion("tenant_no <>", value, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoGreaterThan(String value) {
            addCriterion("tenant_no >", value, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_no >=", value, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoLessThan(String value) {
            addCriterion("tenant_no <", value, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoLessThanOrEqualTo(String value) {
            addCriterion("tenant_no <=", value, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoLike(String value) {
            addCriterion("tenant_no like", value, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoNotLike(String value) {
            addCriterion("tenant_no not like", value, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoIn(List<String> values) {
            addCriterion("tenant_no in", values, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoNotIn(List<String> values) {
            addCriterion("tenant_no not in", values, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoBetween(String value1, String value2) {
            addCriterion("tenant_no between", value1, value2, "tenantNo");
            return (Criteria) this;
        }

        public Criteria andTenantNoNotBetween(String value1, String value2) {
            addCriterion("tenant_no not between", value1, value2, "tenantNo");
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