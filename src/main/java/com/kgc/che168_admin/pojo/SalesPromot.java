package com.kgc.che168_admin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SalesPromot {
    private Long id;

    private String brandName;

    private String seriesName;

    private String carName;

    private BigDecimal price;

    private String picture;

    private String promotName;

    private Date createTime;

    private Date promotTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName == null ? null : seriesName.trim();
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getPromotName() {
        return promotName;
    }

    public void setPromotName(String promotName) {
        this.promotName = promotName == null ? null : promotName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPromotTime() {
        return promotTime;
    }

    public void setPromotTime(Date promotTime) {
        this.promotTime = promotTime;
    }
}