package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TaxeIs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private double charge;
    private double produit;
    private double resultatAvantImpot;
    private double resultatApreImpot; // = resultat avant impot - montantIs
    private int mois;
    private int trimestre;
    private int annee;
    private double montantIs; // resulta avant impot * pourcentage TauxIs
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateSoumission;
    @ManyToOne
    private TauxIs tauxIs;
    @ManyToOne
    private Societe societe;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getProduit() {
        return produit;
    }

    public void setProduit(double produit) {
        this.produit = produit;
    }

    public double getResultatAvantImpot() {
        return resultatAvantImpot;
    }

    public void setResultatAvantImpot(double resultatAvantImpot) {
        this.resultatAvantImpot = resultatAvantImpot;
    }

    public double getResultatApreImpot() {
        return resultatApreImpot;
    }

    public void setResultatApreImpot(double resultatApreImpot) {
        this.resultatApreImpot = resultatApreImpot;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public LocalDateTime getDateSoumission() {
        return dateSoumission;
    }

    public void setDateSoumission(LocalDateTime dateSoumission) {
        this.dateSoumission = dateSoumission;
    }

    public TauxIs getTauxIs() {
        return tauxIs;
    }

    public void setTauxIs(TauxIs tauxIs) {
        this.tauxIs = tauxIs;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public double getMontantIs() {
        return montantIs;
    }

    public void setMontantIs(double montantIs) {
        this.montantIs = montantIs;
    }
}
