package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

@Entity
public class Abonnee {
    @Id // hadi asat raha bean dyali !
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private String prenom;
    private String nom;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
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
}
