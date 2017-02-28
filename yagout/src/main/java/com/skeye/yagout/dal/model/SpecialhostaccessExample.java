package com.skeye.yagout.dal.model;

import java.util.ArrayList;
import java.util.List;

public class SpecialhostaccessExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public SpecialhostaccessExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLineidIsNull() {
            addCriterion("LineID is null");
            return (Criteria) this;
        }

        public Criteria andLineidIsNotNull() {
            addCriterion("LineID is not null");
            return (Criteria) this;
        }

        public Criteria andLineidEqualTo(Integer value) {
            addCriterion("LineID =", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotEqualTo(Integer value) {
            addCriterion("LineID <>", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThan(Integer value) {
            addCriterion("LineID >", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LineID >=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThan(Integer value) {
            addCriterion("LineID <", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThanOrEqualTo(Integer value) {
            addCriterion("LineID <=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidIn(List<Integer> values) {
            addCriterion("LineID in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotIn(List<Integer> values) {
            addCriterion("LineID not in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidBetween(Integer value1, Integer value2) {
            addCriterion("LineID between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotBetween(Integer value1, Integer value2) {
            addCriterion("LineID not between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andAdslnameIsNull() {
            addCriterion("AdslName is null");
            return (Criteria) this;
        }

        public Criteria andAdslnameIsNotNull() {
            addCriterion("AdslName is not null");
            return (Criteria) this;
        }

        public Criteria andAdslnameEqualTo(String value) {
            addCriterion("AdslName =", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameNotEqualTo(String value) {
            addCriterion("AdslName <>", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameGreaterThan(String value) {
            addCriterion("AdslName >", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdslName >=", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameLessThan(String value) {
            addCriterion("AdslName <", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameLessThanOrEqualTo(String value) {
            addCriterion("AdslName <=", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameLike(String value) {
            addCriterion("AdslName like", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameNotLike(String value) {
            addCriterion("AdslName not like", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameIn(List<String> values) {
            addCriterion("AdslName in", values, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameNotIn(List<String> values) {
            addCriterion("AdslName not in", values, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameBetween(String value1, String value2) {
            addCriterion("AdslName between", value1, value2, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameNotBetween(String value1, String value2) {
            addCriterion("AdslName not between", value1, value2, "adslname");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("HostName is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("HostName is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("HostName =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("HostName <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("HostName >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("HostName >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("HostName <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("HostName <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("HostName like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("HostName not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("HostName in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("HostName not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("HostName between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("HostName not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIsNull() {
            addCriterion("AccessTime is null");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIsNotNull() {
            addCriterion("AccessTime is not null");
            return (Criteria) this;
        }

        public Criteria andAccesstimeEqualTo(Integer value) {
            addCriterion("AccessTime =", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotEqualTo(Integer value) {
            addCriterion("AccessTime <>", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeGreaterThan(Integer value) {
            addCriterion("AccessTime >", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessTime >=", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeLessThan(Integer value) {
            addCriterion("AccessTime <", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeLessThanOrEqualTo(Integer value) {
            addCriterion("AccessTime <=", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIn(List<Integer> values) {
            addCriterion("AccessTime in", values, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotIn(List<Integer> values) {
            addCriterion("AccessTime not in", values, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeBetween(Integer value1, Integer value2) {
            addCriterion("AccessTime between", value1, value2, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessTime not between", value1, value2, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccessipIsNull() {
            addCriterion("AccessIP is null");
            return (Criteria) this;
        }

        public Criteria andAccessipIsNotNull() {
            addCriterion("AccessIP is not null");
            return (Criteria) this;
        }

        public Criteria andAccessipEqualTo(Integer value) {
            addCriterion("AccessIP =", value, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipNotEqualTo(Integer value) {
            addCriterion("AccessIP <>", value, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipGreaterThan(Integer value) {
            addCriterion("AccessIP >", value, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessIP >=", value, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipLessThan(Integer value) {
            addCriterion("AccessIP <", value, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipLessThanOrEqualTo(Integer value) {
            addCriterion("AccessIP <=", value, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipIn(List<Integer> values) {
            addCriterion("AccessIP in", values, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipNotIn(List<Integer> values) {
            addCriterion("AccessIP not in", values, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipBetween(Integer value1, Integer value2) {
            addCriterion("AccessIP between", value1, value2, "accessip");
            return (Criteria) this;
        }

        public Criteria andAccessipNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessIP not between", value1, value2, "accessip");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andZipnameIsNull() {
            addCriterion("ZipName is null");
            return (Criteria) this;
        }

        public Criteria andZipnameIsNotNull() {
            addCriterion("ZipName is not null");
            return (Criteria) this;
        }

        public Criteria andZipnameEqualTo(String value) {
            addCriterion("ZipName =", value, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameNotEqualTo(String value) {
            addCriterion("ZipName <>", value, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameGreaterThan(String value) {
            addCriterion("ZipName >", value, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameGreaterThanOrEqualTo(String value) {
            addCriterion("ZipName >=", value, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameLessThan(String value) {
            addCriterion("ZipName <", value, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameLessThanOrEqualTo(String value) {
            addCriterion("ZipName <=", value, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameLike(String value) {
            addCriterion("ZipName like", value, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameNotLike(String value) {
            addCriterion("ZipName not like", value, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameIn(List<String> values) {
            addCriterion("ZipName in", values, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameNotIn(List<String> values) {
            addCriterion("ZipName not in", values, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameBetween(String value1, String value2) {
            addCriterion("ZipName between", value1, value2, "zipname");
            return (Criteria) this;
        }

        public Criteria andZipnameNotBetween(String value1, String value2) {
            addCriterion("ZipName not between", value1, value2, "zipname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table specialhostaccess
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table specialhostaccess
     *
     * @mbggenerated
     */
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