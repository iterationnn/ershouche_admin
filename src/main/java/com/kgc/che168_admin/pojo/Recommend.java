package com.kgc.che168_admin.pojo;

import java.util.Date;

public class Recommend {
    private Long id;

    private Long carDetailId;

    private Byte categoryId;

    private Byte sortId;

    private Boolean isDelete;

    private Date onShowTime;

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

    public Byte getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getSortId() {
        return sortId;
    }

    public void setSortId(Byte sortId) {
        this.sortId = sortId;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getOnShowTime() {
        return onShowTime;
    }

    public void setOnShowTime(Date onShowTime) {
        this.onShowTime = onShowTime;
    }
}