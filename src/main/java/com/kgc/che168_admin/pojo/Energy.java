package com.kgc.che168_admin.pojo;

public class Energy {
    private Long id;

    private String energyName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnergyName() {
        return energyName;
    }

    public void setEnergyName(String energyName) {
        this.energyName = energyName == null ? null : energyName.trim();
    }
}