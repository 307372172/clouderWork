package com.sample.dal.model;

import java.util.Date;

public class Flow {
    private String flowNo;

    private String tenantNo;

    private String enterpriseNo;

    private String settlementYear;

    private String settlementMonth;

    private Date recordingTime;

    private String cumulativeFlow;

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo == null ? null : flowNo.trim();
    }

    public String getTenantNo() {
        return tenantNo;
    }

    public void setTenantNo(String tenantNo) {
        this.tenantNo = tenantNo == null ? null : tenantNo.trim();
    }

    public String getEnterpriseNo() {
        return enterpriseNo;
    }

    public void setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo == null ? null : enterpriseNo.trim();
    }

    public String getSettlementYear() {
        return settlementYear;
    }

    public void setSettlementYear(String settlementYear) {
        this.settlementYear = settlementYear == null ? null : settlementYear.trim();
    }

    public String getSettlementMonth() {
        return settlementMonth;
    }

    public void setSettlementMonth(String settlementMonth) {
        this.settlementMonth = settlementMonth == null ? null : settlementMonth.trim();
    }

    public Date getRecordingTime() {
        return recordingTime;
    }

    public void setRecordingTime(Date recordingTime) {
        this.recordingTime = recordingTime;
    }

    public String getCumulativeFlow() {
        return cumulativeFlow;
    }

    public void setCumulativeFlow(String cumulativeFlow) {
        this.cumulativeFlow = cumulativeFlow == null ? null : cumulativeFlow.trim();
    }
}