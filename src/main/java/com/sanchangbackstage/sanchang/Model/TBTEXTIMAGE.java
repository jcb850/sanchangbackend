package com.sanchangbackstage.sanchang.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TBTEXTIMAGE {

    public TBTEXTIMAGE() {
    }

    @Id
    @GeneratedValue
    private int TIID;

    private String TINAME;
    private Date TIDATE;
    private String TIPATH;
    private String TICONTENT;
    private String TIFLAG;
    private int TIPRAISESUM;
    private int TIVISITSUM;

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

    public Date getTIDATE() {
        return TIDATE;
    }

    public void setTIDATE(Date TIDATE) {
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

    public int getTIPRAISESUM() {
        return TIPRAISESUM;
    }

    public void setTIPRAISESUM(int TIPRAISESUM) {
        this.TIPRAISESUM = TIPRAISESUM;
    }

    public int getTIVISITSUM() {
        return TIVISITSUM;
    }

    public void setTIVISITSUM(int TIVISITSUM) {
        this.TIVISITSUM = TIVISITSUM;
    }
}
