package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.dto;

import java.time.LocalDateTime;

public class TaxeIsDto {
    private Long id;
    private double charge;
    private double produit;
    private double resultatAvantImpot;
    private double resultatApreImpot;
    private int mois;
    private int trimestre;
    private int annee;
    private LocalDateTime dateSoumission;
    private TauxIsDto tauxIs;
    private SocieteDto societe;

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

    public TauxIsDto getTauxIs() {
        return tauxIs;
    }

    public void setTauxIs(TauxIsDto tauxIs) {
        this.tauxIs = tauxIs;
    }

    public SocieteDto getSociete() {
        return societe;
    }

    public void setSociete(SocieteDto societe) {
        this.societe = societe;
    }
}
