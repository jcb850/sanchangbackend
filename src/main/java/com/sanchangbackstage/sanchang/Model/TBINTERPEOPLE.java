package com.sanchangbackstage.sanchang.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBINTERPEOPLE {

    @Id
    private String id;
    private String starname;
    private String starposition;
    private String starwechat;
    private String starqq;
    private String startel;
    private String email;
    private String wecchat;
    private String qq;
    private String tel;
    private String name;

    public TBINTERPEOPLE() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStarname() {
        return starname;
    }

    public void setStarname(String starname) {
        this.starname = starname;
    }

    public String getStarposition() {
        return starposition;
    }

    public void setStarposition(String starposition) {
        this.starposition = starposition;
    }

    public String getStarwechat() {
        return starwechat;
    }

    public void setStarwechat(String starwechat) {
        this.starwechat = starwechat;
    }

    public String getStarqq() {
        return starqq;
    }

    public void setStarqq(String starqq) {
        this.starqq = starqq;
    }

    public String getStartel() {
        return startel;
    }

    public void setStartel(String startel) {
        this.startel = startel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWecchat() {
        return wecchat;
    }

    public void setWecchat(String wecchat) {
        this.wecchat = wecchat;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
