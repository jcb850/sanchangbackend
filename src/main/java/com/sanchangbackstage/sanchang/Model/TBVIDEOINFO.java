package com.sanchangbackstage.sanchang.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TBVIDEOINFO {

    @Id
    @GeneratedValue
    private int VIDEOID;
    private String VIDEONAME;
    private String VIDEOCONTENT;
    private String VIDEOPATH;
    private String VIDEOPLAYSUM;
    private String PRAISESUM;
    private String VIDEODATE;
    private String VIDEOFLAG;


    public TBVIDEOINFO() {
    }

    public int getVIDEOID() {
        return VIDEOID;
    }

    public void setVIDEOID(int VIDEOID) {
        this.VIDEOID = VIDEOID;
    }

    public String getVIDEONAME() {
        return VIDEONAME;
    }

    public void setVIDEONAME(String VIDEONAME) {
        this.VIDEONAME = VIDEONAME;
    }

    public String getVIDEOCONTENT() {
        return VIDEOCONTENT;
    }

    public void setVIDEOCONTENT(String VIDEOCONTENT) {
        this.VIDEOCONTENT = VIDEOCONTENT;
    }

    public String getVIDEOPATH() {
        return VIDEOPATH;
    }

    public void setVIDEOPATH(String VIDEOPATH) {
        this.VIDEOPATH = VIDEOPATH;
    }

    public String getVIDEOPLAYSUM() {
        return VIDEOPLAYSUM;
    }

    public void setVIDEOPLAYSUM(String VIDEOPLAYSUM) {
        this.VIDEOPLAYSUM = VIDEOPLAYSUM;
    }

    public String getPRAISESUM() {
        return PRAISESUM;
    }

    public void setPRAISESUM(String PRAISESUM) {
        this.PRAISESUM = PRAISESUM;
    }

    public String getVIDEODATE() {
        return VIDEODATE;
    }

    public void setVIDEODATE(String VIDEODATE) {
        this.VIDEODATE = VIDEODATE;
    }

    public String getVIDEOFLAG() {
        return VIDEOFLAG;
    }

    public void setVIDEOFLAG(String VIDEOFLAG) {
        this.VIDEOFLAG = VIDEOFLAG;
    }
}
