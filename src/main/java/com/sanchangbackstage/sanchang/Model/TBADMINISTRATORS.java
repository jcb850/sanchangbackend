package com.sanchangbackstage.sanchang.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TBADMINISTRATORS {

    @Id
    private int ADMINID;
    private String name;
    private String PASSWORD;

    public TBADMINISTRATORS() {
    }

    public int getADMINID() {
        return ADMINID;
    }

    public void setADMINID(int ADMINID) {
        this.ADMINID = ADMINID;
    }

    public String getNAME() {
        return name;
    }

    public void setNAME(String NAME) {
        this.name = NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
}
