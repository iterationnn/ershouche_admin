package com.kgc.che168_admin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SaleOnLine {
    private Long id;

    private Long carDetailId;

    private Long userId;

    private String realName;

    private String phone;

    private String brandName;

    private String seriesName;

    private String carName;

    private BigDecimal price;

    private BigDecimal oldPrice;

    private BigDecimal minimumPay;

    private BigDecimal mileage;

    private Date productYear;

    private String cityName;

    private Byte transferNum;

    private String usage;

    private String dcName;

    private String dpName;

    private String energyName;

    private String levelName;

    private String bsBox;

    private String driver;

    private Boolean isHonest;

    private Boolean isLoan;

    private Boolean isqualified;

    private Boolean isPersonal;

    private Date annualDate;

    private Date insuranceDate;

    private Date qualifiedDate;

    private Date createTime;

    private Date onSaleTime;

    private String picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarDetailId() {
        return carDetailId;
    }

    public void setCarDetailId(Long carDetailId) {
        this.carDetailId = carDetailId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
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

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName == null ? null : dcName.trim();
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName == null ? null : dpName.trim();
    }

    public String getEnergyName() {
        return energyName;
    }

    public void setEnergyName(String energyName) {
        this.energyName = energyName == null ? null : energyName.trim();
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public String getBsBox() {
        return bsBox;
    }

    public void setBsBox(String bsBox) {
        this.bsBox = bsBox == null ? null : bsBox.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
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

    public Boolean getIsqualified() {
        return isqualified;
    }

    public void setIsqualified(Boolean isqualified) {
        this.isqualified = isqualified;
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

    public Date getOnSaleTime() {
        return onSaleTime;
    }

    public void setOnSaleTime(Date onSaleTime) {
        this.onSaleTime = onSaleTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}