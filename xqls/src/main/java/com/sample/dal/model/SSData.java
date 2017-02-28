package com.sample.dal.model;


public class SSData {
	private String ssdata_no;

    private Enterprise enterprise;

    private String net;

    private String valve_ss;

    private String valve_set;

    private String instrument_state;

    private String  instrument_inwater;

    private String water_level;

    private Double i;

    private String door;

    private String dianyuan;

    public String getSsdata_no() {
        return ssdata_no;
    }

    public void setSsdata_no(String ssdata_no) {
        this.ssdata_no = ssdata_no == null ? null : ssdata_no.trim();
    }

    public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net == null ? null : net.trim();
    }

    public String getValve_ss() {
        return valve_ss;
    }

    public void setValve_ss(String valve_ss) {
        this.valve_ss = valve_ss == null ? null : valve_ss.trim();
    }

    public String getValve_set() {
        return valve_set;
    }

    public void setValve_set(String valve_set) {
        this.valve_set = valve_set == null ? null : valve_set.trim();
    }

    public String getInstrument_state() {
        return instrument_state;
    }

    public void setInstrument_state(String instrument_state) {
        this.instrument_state = instrument_state == null ? null : instrument_state.trim();
    }

    public String getInstrument_inwater() {
		return instrument_inwater;
	}

	public void setInstrument_inwater(String instrument_inwater) {
		this.instrument_inwater = instrument_inwater;
	}

	public String getWater_level() {
        return water_level;
    }

    public void setWater_level(String water_level) {
        this.water_level = water_level == null ? null : water_level.trim();
    }

    public Double getI() {
        return i;
    }

    public void setI(Double i) {
        this.i = i;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door == null ? null : door.trim();
    }

    public String getDianyuan() {
        return dianyuan;
    }

    public void setDianyuan(String dianyuan) {
        this.dianyuan = dianyuan == null ? null : dianyuan.trim();
    }

	@Override
	public String toString() {
		return "SSDataBean [ssdata_no=" + ssdata_no + ", enterprise="
				+ enterprise + ", net=" + net + ", valve_ss=" + valve_ss
				+ ", valve_set=" + valve_set + ", instrument_state="
				+ instrument_state + ", instrument_inwater="
				+ instrument_inwater + ", water_level=" + water_level + ", i="
				+ i + ", door=" + door + ", dianyuan=" + dianyuan + "]";
	}
    
}