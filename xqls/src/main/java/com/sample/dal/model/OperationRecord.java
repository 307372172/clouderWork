package com.sample.dal.model;

import java.util.Date;

public class OperationRecord {
    private String operationNo;

    private Date recordingTime;

    private String dictionaryNo;

    private String dictionaryContext;

    private String operator;

    private String enterpriseNo;

    private String tenantNo;

    public String getOperationNo() {
        return operationNo;
    }

    public void setOperationNo(String operationNo) {
        this.operationNo = operationNo == null ? null : operationNo.trim();
    }

    public Date getRecordingTime() {
        return recordingTime;
    }

    public void setRecordingTime(Date recordingTime) {
        this.recordingTime = recordingTime;
    }

    public String getDictionaryNo() {
        return dictionaryNo;
    }

    public void setDictionaryNo(String dictionaryNo) {
        this.dictionaryNo = dictionaryNo == null ? null : dictionaryNo.trim();
    }

    public String getDictionaryContext() {
        return dictionaryContext;
    }

    public void setDictionaryContext(String dictionaryContext) {
        this.dictionaryContext = dictionaryContext == null ? null : dictionaryContext.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getEnterpriseNo() {
        return enterpriseNo;
    }

    public void setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo == null ? null : enterpriseNo.trim();
    }

    public String getTenantNo() {
        return tenantNo;
    }

    public void setTenantNo(String tenantNo) {
        this.tenantNo = tenantNo == null ? null : tenantNo.trim();
    }
}