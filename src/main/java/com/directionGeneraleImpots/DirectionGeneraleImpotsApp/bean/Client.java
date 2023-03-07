package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cin;
    private String prenom;
    private String nom;
    @ManyToOne
    private Societe societeClient;



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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Societe getSociete() {
        return societeClient;
    }

    public void setSociete(Societe societe) {
        this.societeClient = societe;
    }
}
