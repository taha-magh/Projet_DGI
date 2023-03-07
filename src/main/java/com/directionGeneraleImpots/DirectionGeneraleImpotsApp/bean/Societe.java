package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

@Entity
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ice; //hada hoa id dialha ben charikat lkhreen
    private String libelle;
    private String description;
    @ManyToOne
    private Abonnee abonnee;

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

    public Abonnee getAbonnee() {
        return abonnee;
    }

    public void setAbonnee(Abonnee abonnee) {
        this.abonnee = abonnee;
    }
}
