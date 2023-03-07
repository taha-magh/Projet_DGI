package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.dto;

public class EmployeDto {
    private Long id;
    private String cin;
    private String nom;
    private String prenom;
    private SocieteDto societe;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public SocieteDto getSociete() {
        return societe;
    }

    public void setSociete(SocieteDto societe) {
        this.societe = societe;
    }
}
