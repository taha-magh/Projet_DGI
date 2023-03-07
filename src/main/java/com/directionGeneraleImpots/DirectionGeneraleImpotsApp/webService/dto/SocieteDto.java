package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.dto;

public class SocieteDto {
    private Long id;
    private String ice; //hada hoa id dialha ben charikat lkhreen
    private String libelle;
    private String description;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
