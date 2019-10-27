package com.kgc.che168_admin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Publish {
    private Long id;

    private Long saleCarId;

    private Long buyCarId;

    private String phone;

    private Date uptime;

    private Long saleCityId;

    private BigDecimal mileage;

    private Boolean isgo;

    private Long userId;

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

    public Long getBuyCarId() {
        return buyCarId;
    }

    public void setBuyCarId(Long buyCarId) {
        this.buyCarId = buyCarId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}