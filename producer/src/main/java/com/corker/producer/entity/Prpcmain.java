package com.corker.producer.entity;

import java.io.Serializable;

public class Prpcmain implements Serializable{

    private String policyNo;

    private String insuredName;

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }
}
