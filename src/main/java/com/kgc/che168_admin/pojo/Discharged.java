package com.kgc.che168_admin.pojo;

public class Discharged {
    private Long id;

    private String dcName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName == null ? null : dcName.trim();
    }
}