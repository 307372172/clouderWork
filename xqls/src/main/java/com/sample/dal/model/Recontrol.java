package com.sample.dal.model;

public class Recontrol {
    private String recontrolNo;

    private String enterpriseNo;

    private String network;

    private String valveTime;

    private String valveSet;

    private String cystate;

    private String commandStatus;

    public String getRecontrolNo() {
        return recontrolNo;
    }

    public void setRecontrolNo(String recontrolNo) {
        this.recontrolNo = recontrolNo == null ? null : recontrolNo.trim();
    }

    public String getEnterpriseNo() {
        return enterpriseNo;
    }

    public void setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo == null ? null : enterpriseNo.trim();
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    public String getValveTime() {
        return valveTime;
    }

    public void setValveTime(String valveTime) {
        this.valveTime = valveTime == null ? null : valveTime.trim();
    }

    public String getValveSet() {
        return valveSet;
    }

    public void setValveSet(String valveSet) {
        this.valveSet = valveSet == null ? null : valveSet.trim();
    }

    public String getCystate() {
        return cystate;
    }

    public void setCystate(String cystate) {
        this.cystate = cystate == null ? null : cystate.trim();
    }

    public String getCommandStatus() {
        return commandStatus;
    }

    public void setCommandStatus(String commandStatus) {
        this.commandStatus = commandStatus == null ? null : commandStatus.trim();
    }
}