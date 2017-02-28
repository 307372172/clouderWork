package com.sample.bean;

import java.io.Serializable;
import java.util.Date;

public class CyRecordBean implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 private String id;

	    private String tenant_no;

	    private String enterprise_no;

	    private Integer p_num;

	    private Date record_time;

	    private Double quantity;

	    private Double cod;

	    private Double ph;

	    private Double nh;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id == null ? null : id.trim();
	    }

	    public String getTenant_no() {
	        return tenant_no;
	    }

	    public void setTenant_no(String tenant_no) {
	        this.tenant_no = tenant_no == null ? null : tenant_no.trim();
	    }

	    public String getEnterprise_no() {
	        return enterprise_no;
	    }

	    public void setEnterprise_no(String enterprise_no) {
	        this.enterprise_no = enterprise_no;
	    }

	    public Integer getP_num() {
	        return p_num;
	    }

	    public void setP_num(Integer p_num) {
	        this.p_num = p_num;
	    }

	    public Date getRecord_time() {
	        return record_time;
	    }

	    public void setRecord_time(Date record_time) {
	        this.record_time = record_time;
	    }

	    public Double getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(Double quantity) {
	        this.quantity = quantity;
	    }

	    public Double getCod() {
	        return cod;
	    }

	    public void setCod(Double cod) {
	        this.cod = cod;
	    }

	    public Double getPh() {
	        return ph;
	    }

	    public void setPh(Double ph) {
	        this.ph = ph;
	    }

	    public Double getNh() {
	        return nh;
	    }

	    public void setNh(Double nh) {
	        this.nh = nh;
	    }
}
