package com.kgc.che168_admin.pojo;

import java.util.Date;

public class Banner {
    private Integer id;

    private Boolean isShow;

    private String description;

    private String pictureName;

    private String pictureUrl;

    private Date onShowTime;

    private Date offshowTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public Date getOnShowTime() {
        return onShowTime;
    }

    public void setOnShowTime(Date onShowTime) {
        this.onShowTime = onShowTime;
    }

    public Date getOffshowTime() {
        return offshowTime;
    }

    public void setOffshowTime(Date offshowTime) {
        this.offshowTime = offshowTime;
    }
}