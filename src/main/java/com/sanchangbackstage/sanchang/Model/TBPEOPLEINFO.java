package com.sanchangbackstage.sanchang.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TBPEOPLEINFO {

    public TBPEOPLEINFO() {
    }

    @Id
    @GeneratedValue
    private String  ID;
    private String NAME;
    private int EAG;
    private String POSITION;
    private String DECLARATION;
    private int PAGEVIEW;
    private int QUANTITY;
    private Date UPTIME;
    private String SEX;
    private String ANIMAL;
    private String NATION;
    private String DIPLOMA;
    private String CONSTELLATION;
    private String BLOOD;
    private String INCOME;
    private Date FREETIME;
    private String FRDPOSITIONONE;
    private String FRDPOSITIONTWO;
    private String FRDPOSITIONTHREE;
    private String FREELIFE;
    private String FOOD;
    private String TOURIST;
    private String MOVIE;
    private String MUSIC;
    private String INTERNET;
    private int GREAG;
    private String GRHEIGHT;
    private String GRDIPLOMA;
    private String GRINCOME;
    private String GRFEATURE;
    private String GRMARRY;
    private String EMAIL;
    private String WECHAT;
    private String QQ;
    private String TEL;
    private String PHOHOONE;
    private String PHOHOTWO;
    private String PHOHOTHREE;
    private String PHOHOFOUR;
    private String PHOHOFIVE;
    private String PHOHOSIX;
    private String PHOHOSEVEN;
    private String PHOHOEIGHT;
    private String PHOHONINE;
    private String PHOHOTEN;
    private int COUNT;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getEAG() {
        return EAG;
    }

    public void setEAG(int EAG) {
        this.EAG = EAG;
    }

    public String getPOSITION() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }

    public String getDECLARATION() {
        return DECLARATION;
    }

    public void setDECLARATION(String DECLARATION) {
        this.DECLARATION = DECLARATION;
    }

    public int getPAGEVIEW() {
        return PAGEVIEW;
    }

    public void setPAGEVIEW(int PAGEVIEW) {
        this.PAGEVIEW = PAGEVIEW;
    }

    public int getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(int QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public Date getUPTIME() {
        return UPTIME;
    }

    public void setUPTIME(Date UPTIME) {
        this.UPTIME = UPTIME;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getANIMAL() {
        return ANIMAL;
    }

    public void setANIMAL(String ANIMAL) {
        this.ANIMAL = ANIMAL;
    }

    public String getNATION() {
        return NATION;
    }

    public void setNATION(String NATION) {
        this.NATION = NATION;
    }

    public String getDIPLOMA() {
        return DIPLOMA;
    }

    public void setDIPLOMA(String DIPLOMA) {
        this.DIPLOMA = DIPLOMA;
    }

    public String getCONSTELLATION() {
        return CONSTELLATION;
    }

    public void setCONSTELLATION(String CONSTELLATION) {
        this.CONSTELLATION = CONSTELLATION;
    }

    public String getBLOOD() {
        return BLOOD;
    }

    public void setBLOOD(String BLOOD) {
        this.BLOOD = BLOOD;
    }

    public String getINCOME() {
        return INCOME;
    }

    public void setINCOME(String INCOME) {
        this.INCOME = INCOME;
    }

    public Date getFREETIME() {
        return FREETIME;
    }

    public void setFREETIME(Date FREETIME) {
        this.FREETIME = FREETIME;
    }

    public String getFRDPOSITIONONE() {
        return FRDPOSITIONONE;
    }

    public void setFRDPOSITIONONE(String FRDPOSITIONONE) {
        this.FRDPOSITIONONE = FRDPOSITIONONE;
    }

    public String getFRDPOSITIONTWO() {
        return FRDPOSITIONTWO;
    }

    public void setFRDPOSITIONTWO(String FRDPOSITIONTWO) {
        this.FRDPOSITIONTWO = FRDPOSITIONTWO;
    }

    public String getFRDPOSITIONTHREE() {
        return FRDPOSITIONTHREE;
    }

    public void setFRDPOSITIONTHREE(String FRDPOSITIONTHREE) {
        this.FRDPOSITIONTHREE = FRDPOSITIONTHREE;
    }

    public String getFREELIFE() {
        return FREELIFE;
    }

    public void setFREELIFE(String FREELIFE) {
        this.FREELIFE = FREELIFE;
    }

    public String getFOOD() {
        return FOOD;
    }

    public void setFOOD(String FOOD) {
        this.FOOD = FOOD;
    }

    public String getTOURIST() {
        return TOURIST;
    }

    public void setTOURIST(String TOURIST) {
        this.TOURIST = TOURIST;
    }

    public String getMOVIE() {
        return MOVIE;
    }

    public void setMOVIE(String MOVIE) {
        this.MOVIE = MOVIE;
    }

    public String getMUSIC() {
        return MUSIC;
    }

    public void setMUSIC(String MUSIC) {
        this.MUSIC = MUSIC;
    }

    public String getINTERNET() {
        return INTERNET;
    }

    public void setINTERNET(String INTERNET) {
        this.INTERNET = INTERNET;
    }

    public int getGREAG() {
        return GREAG;
    }

    public void setGREAG(int GREAG) {
        this.GREAG = GREAG;
    }

    public String getGRHEIGHT() {
        return GRHEIGHT;
    }

    public void setGRHEIGHT(String GRHEIGHT) {
        this.GRHEIGHT = GRHEIGHT;
    }

    public String getGRDIPLOMA() {
        return GRDIPLOMA;
    }

    public void setGRDIPLOMA(String GRDIPLOMA) {
        this.GRDIPLOMA = GRDIPLOMA;
    }

    public String getGRINCOME() {
        return GRINCOME;
    }

    public void setGRINCOME(String GRINCOME) {
        this.GRINCOME = GRINCOME;
    }

    public String getGRFEATURE() {
        return GRFEATURE;
    }

    public void setGRFEATURE(String GRFEATURE) {
        this.GRFEATURE = GRFEATURE;
    }

    public String getGRMARRY() {
        return GRMARRY;
    }

    public void setGRMARRY(String GRMARRY) {
        this.GRMARRY = GRMARRY;
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

    public String getPHOHOONE() {
        return PHOHOONE;
    }

    public void setPHOHOONE(String PHOHOONE) {
        this.PHOHOONE = PHOHOONE;
    }

    public String getPHOHOTWO() {
        return PHOHOTWO;
    }

    public void setPHOHOTWO(String PHOHOTWO) {
        this.PHOHOTWO = PHOHOTWO;
    }

    public String getPHOHOTHREE() {
        return PHOHOTHREE;
    }

    public void setPHOHOTHREE(String PHOHOTHREE) {
        this.PHOHOTHREE = PHOHOTHREE;
    }

    public String getPHOHOFOUR() {
        return PHOHOFOUR;
    }

    public void setPHOHOFOUR(String PHOHOFOUR) {
        this.PHOHOFOUR = PHOHOFOUR;
    }

    public String getPHOHOFIVE() {
        return PHOHOFIVE;
    }

    public void setPHOHOFIVE(String PHOHOFIVE) {
        this.PHOHOFIVE = PHOHOFIVE;
    }

    public String getPHOHOSIX() {
        return PHOHOSIX;
    }

    public void setPHOHOSIX(String PHOHOSIX) {
        this.PHOHOSIX = PHOHOSIX;
    }

    public String getPHOHOSEVEN() {
        return PHOHOSEVEN;
    }

    public void setPHOHOSEVEN(String PHOHOSEVEN) {
        this.PHOHOSEVEN = PHOHOSEVEN;
    }

    public String getPHOHOEIGHT() {
        return PHOHOEIGHT;
    }

    public void setPHOHOEIGHT(String PHOHOEIGHT) {
        this.PHOHOEIGHT = PHOHOEIGHT;
    }

    public String getPHOHONINE() {
        return PHOHONINE;
    }

    public void setPHOHONINE(String PHOHONINE) {
        this.PHOHONINE = PHOHONINE;
    }

    public String getPHOHOTEN() {
        return PHOHOTEN;
    }

    public void setPHOHOTEN(String PHOHOTEN) {
        this.PHOHOTEN = PHOHOTEN;
    }

    public int getCOUNT() {
        return COUNT;
    }

    public void setCOUNT(int COUNT) {
        this.COUNT = COUNT;
    }
}
