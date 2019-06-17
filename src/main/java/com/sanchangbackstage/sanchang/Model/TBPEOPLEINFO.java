package com.sanchangbackstage.sanchang.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TBPEOPLEINFO {

    public TBPEOPLEINFO() {
    }

//    public TBPEOPLEINFO(TBPEOPLEINFO tbpeopleinfo) {
//        this.id = tbpeopleinfo.id==""?this.id:tbpeopleinfo.id;
//        this.name = tbpeopleinfo.name==""?this.id:tbpeopleinfo.id;
//        this.eag = tbpeopleinfo.eag==""?this.id:tbpeopleinfo.id;
//        this.position = tbpeopleinfo.position==""?this.id:tbpeopleinfo.id;
//        this.declaration = tbpeopleinfo.declaration==""?this.id:tbpeopleinfo.id;
//        this.pageview = tbpeopleinfo.pageview==""?this.id:tbpeopleinfo.id;
//        this.quantity = tbpeopleinfo.quantity==""?this.id:tbpeopleinfo.id;
//        this.uptime = tbpeopleinfo.uptime==""?this.id:tbpeopleinfo.id;
//        this.sex = tbpeopleinfo.sex==""?this.id:tbpeopleinfo.id;
//        this.animal = tbpeopleinfo.animal==""?this.id:tbpeopleinfo.id;
//        this.nation = tbpeopleinfo.nation==""?this.id:tbpeopleinfo.id;
//        this.diploma = tbpeopleinfo.diploma==""?this.id:tbpeopleinfo.id;
//        this.constellation = tbpeopleinfo.constellation==""?this.id:tbpeopleinfo.id;
//        this.blood = tbpeopleinfo.blood==""?this.id:tbpeopleinfo.id;
//        this.income = tbpeopleinfo.income==""?this.id:tbpeopleinfo.id;
//        this.freetime = tbpeopleinfo.freetime==""?this.id:tbpeopleinfo.id;
//        this.frdpositionone = tbpeopleinfo.frdpositionone==""?this.id:tbpeopleinfo.id;
//        this.frdpositiontwo = tbpeopleinfo.frdpositiontwo==""?this.id:tbpeopleinfo.id;
//        this.frdpositionthree = tbpeopleinfo.frdpositionthree==""?this.id:tbpeopleinfo.id;
//        this.freelife = tbpeopleinfo.freelife==""?this.id:tbpeopleinfo.id;
//        this.food = tbpeopleinfo.food==""?this.id:tbpeopleinfo.id;
//        this.tourist = tbpeopleinfo.tourist==""?this.id:tbpeopleinfo.id;
//        this.movie = tbpeopleinfo.movie==""?this.id:tbpeopleinfo.id;
//        this.music = tbpeopleinfo.music==""?this.id:tbpeopleinfo.id;
//        this.internet = tbpeopleinfo.internet==""?this.id:tbpeopleinfo.id;
//        this.greag = tbpeopleinfo.greag==?this.greag:tbpeopleinfo.greag;
//        this.grheight = tbpeopleinfo.grheight==""?this.grheight:tbpeopleinfo.grheight;
//        this.grdiploma = tbpeopleinfo.grdiploma==""?this.grdiploma:tbpeopleinfo.grdiploma;
//        this.grincome = tbpeopleinfo.grincome==""?this.grincome:tbpeopleinfo.grincome;
//        this.grfeature = tbpeopleinfo.grfeature==""?this.grfeature:tbpeopleinfo.grfeature;
//        this.grmarry = tbpeopleinfo.grmarry==""?this.grmarry:tbpeopleinfo.grmarry;
//        this.email = tbpeopleinfo.email==""?this.email:tbpeopleinfo.email;
//        this.wechat = tbpeopleinfo.wechat==""?this.wechat:tbpeopleinfo.wechat;
//        this.qq = tbpeopleinfo.qq==""?this.qq:tbpeopleinfo.qq;
//        this.tel = tbpeopleinfo.tel==""?this.tel:tbpeopleinfo.tel;
//        this.photoone = tbpeopleinfo.photoone==""?this.photoone:tbpeopleinfo.photoone;
//        this.phototwo = tbpeopleinfo.phototwo==""?this.phototwo:tbpeopleinfo.phototwo;
//        this.photothree = tbpeopleinfo.photothree==""?this.photothree:tbpeopleinfo.photothree;
//        this.photofour = tbpeopleinfo.photofour==""?this.photofour:tbpeopleinfo.photofour;
//        this.photofive = tbpeopleinfo.photofive==""?this.photofive:tbpeopleinfo.photofive;
//        this.photosix = tbpeopleinfo.photosix==""?this.photosix:tbpeopleinfo.photosix;
//        this.photoseven = tbpeopleinfo.photoseven==""?this.photoseven:tbpeopleinfo.photoseven;
//        this.photoeight = tbpeopleinfo.photoeight==""?this.photoeight:tbpeopleinfo.photoeight;
//        this.photonine = tbpeopleinfo.photonine==""?this.photonine:tbpeopleinfo.photonine;
//        this.phototen = tbpeopleinfo.phototen==""?this.phototen:tbpeopleinfo.phototen;
//        this.count = tbpeopleinfo.count==""?this.count:tbpeopleinfo.count;
//    }

    @Id

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
