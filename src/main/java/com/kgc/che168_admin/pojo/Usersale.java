package com.kgc.che168_admin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Usersale {
    private Long id;

    private Long saleCarId;

    private String phone;

    private Date uptime;

    private Long saleCityId;

    private BigDecimal mileage;

    private Boolean isgo;

    private BigDecimal price;

    private Long userid;

    private String picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSaleCarId() {
        return saleCarId;
    }

    public void setSaleCarId(Long saleCarId) {
        this.saleCarId = saleCarId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Long getSaleCityId() {
        return saleCityId;
    }

    public void setSaleCityId(Long saleCityId) {
        this.saleCityId = saleCityId;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public Boolean getIsgo() {
        return isgo;
    }

    public void setIsgo(Boolean isgo) {
        this.isgo = isgo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}