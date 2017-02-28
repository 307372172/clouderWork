package com.sample.dal.model;

import java.util.ArrayList;
import java.util.List;

public class RecontrolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecontrolExample() {
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

        public Criteria andRecontrolNoIsNull() {
            addCriterion("Recontrol_no is null");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoIsNotNull() {
            addCriterion("Recontrol_no is not null");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoEqualTo(String value) {
            addCriterion("Recontrol_no =", value, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoNotEqualTo(String value) {
            addCriterion("Recontrol_no <>", value, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoGreaterThan(String value) {
            addCriterion("Recontrol_no >", value, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoGreaterThanOrEqualTo(String value) {
            addCriterion("Recontrol_no >=", value, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoLessThan(String value) {
            addCriterion("Recontrol_no <", value, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoLessThanOrEqualTo(String value) {
            addCriterion("Recontrol_no <=", value, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoLike(String value) {
            addCriterion("Recontrol_no like", value, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoNotLike(String value) {
            addCriterion("Recontrol_no not like", value, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoIn(List<String> values) {
            addCriterion("Recontrol_no in", values, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoNotIn(List<String> values) {
            addCriterion("Recontrol_no not in", values, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoBetween(String value1, String value2) {
            addCriterion("Recontrol_no between", value1, value2, "recontrolNo");
            return (Criteria) this;
        }

        public Criteria andRecontrolNoNotBetween(String value1, String value2) {
            addCriterion("Recontrol_no not between", value1, value2, "recontrolNo");
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

        public Criteria andNetworkIsNull() {
            addCriterion("network is null");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNotNull() {
            addCriterion("network is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkEqualTo(String value) {
            addCriterion("network =", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotEqualTo(String value) {
            addCriterion("network <>", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThan(String value) {
            addCriterion("network >", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("network >=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThan(String value) {
            addCriterion("network <", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThanOrEqualTo(String value) {
            addCriterion("network <=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLike(String value) {
            addCriterion("network like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotLike(String value) {
            addCriterion("network not like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkIn(List<String> values) {
            addCriterion("network in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotIn(List<String> values) {
            addCriterion("network not in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkBetween(String value1, String value2) {
            addCriterion("network between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotBetween(String value1, String value2) {
            addCriterion("network not between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andValveTimeIsNull() {
            addCriterion("valve_time is null");
            return (Criteria) this;
        }

        public Criteria andValveTimeIsNotNull() {
            addCriterion("valve_time is not null");
            return (Criteria) this;
        }

        public Criteria andValveTimeEqualTo(String value) {
            addCriterion("valve_time =", value, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeNotEqualTo(String value) {
            addCriterion("valve_time <>", value, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeGreaterThan(String value) {
            addCriterion("valve_time >", value, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("valve_time >=", value, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeLessThan(String value) {
            addCriterion("valve_time <", value, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeLessThanOrEqualTo(String value) {
            addCriterion("valve_time <=", value, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeLike(String value) {
            addCriterion("valve_time like", value, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeNotLike(String value) {
            addCriterion("valve_time not like", value, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeIn(List<String> values) {
            addCriterion("valve_time in", values, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeNotIn(List<String> values) {
            addCriterion("valve_time not in", values, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeBetween(String value1, String value2) {
            addCriterion("valve_time between", value1, value2, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveTimeNotBetween(String value1, String value2) {
            addCriterion("valve_time not between", value1, value2, "valveTime");
            return (Criteria) this;
        }

        public Criteria andValveSetIsNull() {
            addCriterion("valve_set is null");
            return (Criteria) this;
        }

        public Criteria andValveSetIsNotNull() {
            addCriterion("valve_set is not null");
            return (Criteria) this;
        }

        public Criteria andValveSetEqualTo(String value) {
            addCriterion("valve_set =", value, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetNotEqualTo(String value) {
            addCriterion("valve_set <>", value, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetGreaterThan(String value) {
            addCriterion("valve_set >", value, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetGreaterThanOrEqualTo(String value) {
            addCriterion("valve_set >=", value, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetLessThan(String value) {
            addCriterion("valve_set <", value, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetLessThanOrEqualTo(String value) {
            addCriterion("valve_set <=", value, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetLike(String value) {
            addCriterion("valve_set like", value, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetNotLike(String value) {
            addCriterion("valve_set not like", value, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetIn(List<String> values) {
            addCriterion("valve_set in", values, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetNotIn(List<String> values) {
            addCriterion("valve_set not in", values, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetBetween(String value1, String value2) {
            addCriterion("valve_set between", value1, value2, "valveSet");
            return (Criteria) this;
        }

        public Criteria andValveSetNotBetween(String value1, String value2) {
            addCriterion("valve_set not between", value1, value2, "valveSet");
            return (Criteria) this;
        }

        public Criteria andCystateIsNull() {
            addCriterion("cystate is null");
            return (Criteria) this;
        }

        public Criteria andCystateIsNotNull() {
            addCriterion("cystate is not null");
            return (Criteria) this;
        }

        public Criteria andCystateEqualTo(String value) {
            addCriterion("cystate =", value, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateNotEqualTo(String value) {
            addCriterion("cystate <>", value, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateGreaterThan(String value) {
            addCriterion("cystate >", value, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateGreaterThanOrEqualTo(String value) {
            addCriterion("cystate >=", value, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateLessThan(String value) {
            addCriterion("cystate <", value, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateLessThanOrEqualTo(String value) {
            addCriterion("cystate <=", value, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateLike(String value) {
            addCriterion("cystate like", value, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateNotLike(String value) {
            addCriterion("cystate not like", value, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateIn(List<String> values) {
            addCriterion("cystate in", values, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateNotIn(List<String> values) {
            addCriterion("cystate not in", values, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateBetween(String value1, String value2) {
            addCriterion("cystate between", value1, value2, "cystate");
            return (Criteria) this;
        }

        public Criteria andCystateNotBetween(String value1, String value2) {
            addCriterion("cystate not between", value1, value2, "cystate");
            return (Criteria) this;
        }

        public Criteria andCommandStatusIsNull() {
            addCriterion("Command_status is null");
            return (Criteria) this;
        }

        public Criteria andCommandStatusIsNotNull() {
            addCriterion("Command_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommandStatusEqualTo(String value) {
            addCriterion("Command_status =", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusNotEqualTo(String value) {
            addCriterion("Command_status <>", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusGreaterThan(String value) {
            addCriterion("Command_status >", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Command_status >=", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusLessThan(String value) {
            addCriterion("Command_status <", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusLessThanOrEqualTo(String value) {
            addCriterion("Command_status <=", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusLike(String value) {
            addCriterion("Command_status like", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusNotLike(String value) {
            addCriterion("Command_status not like", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusIn(List<String> values) {
            addCriterion("Command_status in", values, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusNotIn(List<String> values) {
            addCriterion("Command_status not in", values, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusBetween(String value1, String value2) {
            addCriterion("Command_status between", value1, value2, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusNotBetween(String value1, String value2) {
            addCriterion("Command_status not between", value1, value2, "commandStatus");
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