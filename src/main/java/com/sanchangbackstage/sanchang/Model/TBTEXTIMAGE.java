package com.sanchangbackstage.sanchang.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TBTEXTIMAGE {

    public TBTEXTIMAGE() {
    }

    @Id
    @GeneratedValue
    private int TIID;

    private String TINAME;
    private String TIDATE;
    private String TIPATH;
    private String TICONTENT;
    private String TIFLAG;
    private String TIPRAISESUM;
    private String TIVISITSUM;

    public int getTIID() {
        return TIID;
    }

    public void setTIID(int TIID) {
        this.TIID = TIID;
    }

    public String getTINAME() {
        return TINAME;
    }

    public void setTINAME(String TINAME) {
        this.TINAME = TINAME;
    }

    public String getTIDATE() {
        return TIDATE;
    }

    public void setTIDATE(String TIDATE) {
        this.TIDATE = TIDATE;
    }

    public String getTIPATH() {
        return TIPATH;
    }

    public void setTIPATH(String TIPATH) {
        this.TIPATH = TIPATH;
    }

    public String getTICONTENT() {
        return TICONTENT;
    }

    public void setTICONTENT(String TICONTENT) {
        this.TICONTENT = TICONTENT;
    }

    public String getTIFLAG() {
        return TIFLAG;
    }

    public void setTIFLAG(String TIFLAG) {
        this.TIFLAG = TIFLAG;
    }

    public String getTIPRAISESUM() {
        return TIPRAISESUM;
    }

    public void setTIPRAISESUM(String TIPRAISESUM) {
        this.TIPRAISESUM = TIPRAISESUM;
    }

    public String getTIVISITSUM() {
        return TIVISITSUM;
    }

    public void setTIVISITSUM(String TIVISITSUM) {
        this.TIVISITSUM = TIVISITSUM;
    }
}
