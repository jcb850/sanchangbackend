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
<<<<<<< HEAD
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
=======
    private String  id;
    private String name;
    private int eag;
    private String position;
    private String declaration;
    private int pageview;
    private int quantity;
    private Date uptime;
    private String sex;
    private String animal;
    private String nation;
    private String diploma;
    private String constellation;
    private String blood;
    private String income;
    private Date freetime;
    private String frdpositionone;
    private String frdpositiontwo;
    private String frdpositionthree;
    private String freelife;
    private String food;
    private String tourist;
    private String movie;
    private String music;
    private String internet;
    private int greag;
    private String grheight;
    private String grdiploma;
    private String grincome;
    private String grfeature;
    private String grmarry;
    private String email;
    private String wechat;
    private String qq;
    private String tel;
    private String photoone;
    private String phototwo;
    private String photothree;
    private String photofour;
    private String photofive;
    private String photosix;
    private String photoseven;
    private String photoeight;
    private String photonine;
    private String phototen;
    private int count;
>>>>>>> c0abff89929925f9e61344a50b0a512f9eb204eb

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEag() {
        return eag;
    }

    public void setEag(int eag) {
        this.eag = eag;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public int getPageview() {
        return pageview;
    }

    public void setPageview(int pageview) {
        this.pageview = pageview;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Date getFreetime() {
        return freetime;
    }

    public void setFreetime(Date freetime) {
        this.freetime = freetime;
    }

    public String getFrdpositionone() {
        return frdpositionone;
    }

    public void setFrdpositionone(String frdpositionone) {
        this.frdpositionone = frdpositionone;
    }

    public String getFrdpositiontwo() {
        return frdpositiontwo;
    }

    public void setFrdpositiontwo(String frdpositiontwo) {
        this.frdpositiontwo = frdpositiontwo;
    }

    public String getFrdpositionthree() {
        return frdpositionthree;
    }

    public void setFrdpositionthree(String frdpositionthree) {
        this.frdpositionthree = frdpositionthree;
    }

    public String getFreelife() {
        return freelife;
    }

    public void setFreelife(String freelife) {
        this.freelife = freelife;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getTourist() {
        return tourist;
    }

    public void setTourist(String tourist) {
        this.tourist = tourist;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getGreag() {
        return greag;
    }

    public void setGreag(int greag) {
        this.greag = greag;
    }

    public String getGrheight() {
        return grheight;
    }

    public void setGrheight(String grheight) {
        this.grheight = grheight;
    }

    public String getGrdiploma() {
        return grdiploma;
    }

    public void setGrdiploma(String grdiploma) {
        this.grdiploma = grdiploma;
    }

    public String getGrincome() {
        return grincome;
    }

    public void setGrincome(String grincome) {
        this.grincome = grincome;
    }

    public String getGrfeature() {
        return grfeature;
    }

    public void setGrfeature(String grfeature) {
        this.grfeature = grfeature;
    }

    public String getGrmarry() {
        return grmarry;
    }

    public void setGrmarry(String grmarry) {
        this.grmarry = grmarry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhotoone() {
        return photoone;
    }

    public void setPhotoone(String photoone) {
        this.photoone = photoone;
    }

    public String getPhototwo() {
        return phototwo;
    }

    public void setPhototwo(String phototwo) {
        this.phototwo = phototwo;
    }

    public String getPhotothree() {
        return photothree;
    }

    public void setPhotothree(String photothree) {
        this.photothree = photothree;
    }

    public String getPhotofour() {
        return photofour;
    }

    public void setPhotofour(String photofour) {
        this.photofour = photofour;
    }

    public String getPhotofive() {
        return photofive;
    }

    public void setPhotofive(String photofive) {
        this.photofive = photofive;
    }

    public String getPhotosix() {
        return photosix;
    }

    public void setPhotosix(String photosix) {
        this.photosix = photosix;
    }

    public String getPhotoseven() {
        return photoseven;
    }

    public void setPhotoseven(String photoseven) {
        this.photoseven = photoseven;
    }

    public String getPhotoeight() {
        return photoeight;
    }

    public void setPhotoeight(String photoeight) {
        this.photoeight = photoeight;
    }

    public String getPhotonine() {
        return photonine;
    }

    public void setPhotonine(String photonine) {
        this.photonine = photonine;
    }

    public String getPhototen() {
        return phototen;
    }

    public void setPhototen(String phototen) {
        this.phototen = phototen;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
