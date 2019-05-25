package com.sanchangbackstage.sanchang.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBINTERPEOPLE {

    @Id
    private String ID;
    private String STARNAME;
    private String STARPOSITION;
    private String STARWECHAT;
    private String STARQQ;
    private String STARTEL;
    private String EMAIL;
    private String WECHAT;
    private String QQ;
    private String TEL;
    private String NAME;

    public TBINTERPEOPLE() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSTARNAME() {
        return STARNAME;
    }

    public void setSTARNAME(String STARNAME) {
        this.STARNAME = STARNAME;
    }

    public String getSTARPOSITION() {
        return STARPOSITION;
    }

    public void setSTARPOSITION(String STARPOSITION) {
        this.STARPOSITION = STARPOSITION;
    }

    public String getSTARWECHAT() {
        return STARWECHAT;
    }

    public void setSTARWECHAT(String STARWECHAT) {
        this.STARWECHAT = STARWECHAT;
    }

    public String getSTARQQ() {
        return STARQQ;
    }

    public void setSTARQQ(String STARQQ) {
        this.STARQQ = STARQQ;
    }

    public String getSTARTEL() {
        return STARTEL;
    }

    public void setSTARTEL(String STARTEL) {
        this.STARTEL = STARTEL;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getWECHAT() {
        return WECHAT;
    }

    public void setWECHAT(String WECHAT) {
        this.WECHAT = WECHAT;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
