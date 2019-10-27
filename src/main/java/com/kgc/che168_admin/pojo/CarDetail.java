package com.kgc.che168_admin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CarDetail {
    private Long id;

    private Long carId;

    private Long userId;

    private BigDecimal mileage;

    private Date productYear;

    private BigDecimal price;

    private BigDecimal oldPrice;

    private BigDecimal minimumPay;

    private String cityId;

    private Byte transferNum;

    private String usage;

    private Boolean isHonest;

    private Boolean isLoan;

    private Boolean isQualified;

    private Boolean isPersonal;

    private Date annualDate;

    private Date insuranceDate;

    private Date qualifiedDate;

    private Date createTime;

    private Long createdBy;

    private String picture;

    private Date uptime;

    private Boolean isgo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public Date getProductYear() {
        return productYear;
    }

    public void setProductYear(Date productYear) {
        this.productYear = productYear;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public BigDecimal getMinimumPay() {
        return minimumPay;
    }

    public void setMinimumPay(BigDecimal minimumPay) {
        this.minimumPay = minimumPay;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public Byte getTransferNum() {
        return transferNum;
    }

    public void setTransferNum(Byte transferNum) {
        this.transferNum = transferNum;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
    }

    public Boolean getIsHonest() {
        return isHonest;
    }

    public void setIsHonest(Boolean isHonest) {
        this.isHonest = isHonest;
    }

    public Boolean getIsLoan() {
        return isLoan;
    }

    public void setIsLoan(Boolean isLoan) {
        this.isLoan = isLoan;
    }

    public Boolean getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(Boolean isQualified) {
        this.isQualified = isQualified;
    }

    public Boolean getIsPersonal() {
        return isPersonal;
    }

    public void setIsPersonal(Boolean isPersonal) {
        this.isPersonal = isPersonal;
    }

    public Date getAnnualDate() {
        return annualDate;
    }

    public void setAnnualDate(Date annualDate) {
        this.annualDate = annualDate;
    }

    public Date getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(Date insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public Date getQualifiedDate() {
        return qualifiedDate;
    }

    public void setQualifiedDate(Date qualifiedDate) {
        this.qualifiedDate = qualifiedDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Boolean getIsgo() {
        return isgo;
    }

    public void setIsgo(Boolean isgo) {
        this.isgo = isgo;
    }
}