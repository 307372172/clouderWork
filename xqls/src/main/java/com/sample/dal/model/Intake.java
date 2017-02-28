package com.sample.dal.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Intake {
    private String record_id;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date record_date;

    private Double record_flowrate;

    private Double record_flowrate_total;

    private String enterpriseNo;

    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id == null ? null : record_id.trim();
    }

    public Date getRecord_date() {
		return record_date;
	}

	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}

	public Double getRecord_flowrate() {
        return record_flowrate;
    }

    public void setRecord_flowrate(Double record_flowrate) {
        this.record_flowrate = record_flowrate;
    }

    public Double getRecord_flowrate_total() {
        return record_flowrate_total;
    }

    public void setRecord_flowrate_total(Double record_flowrate_total) {
        this.record_flowrate_total = record_flowrate_total;
    }

    public String getEnterpriseNo() {
        return enterpriseNo;
    }

    public void setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo == null ? null : enterpriseNo.trim();
    }
}