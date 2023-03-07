package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TaxeIr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int mois;
    private int annee;
    private double totalSalaireNet;
    private double totalSalaireBrut;
    private double totaleCotisationPatronale;
    private double totaleCotisationSalariale;
    private double totalRetard; // pourcentage pinalite (valeur fix !) + les interits de retard (relie a combien des mois vous n'avez pas paye)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateDeclaration;
    private int nbreEmployeDeclare;
    @ManyToOne
    private Societe societe;
    @ManyToOne
    private TauxIr tauxIr;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getTotalSalaireNet() {
        return totalSalaireNet;
    }

    public void setTotalSalaireNet(double totalSalaireNet) {
        this.totalSalaireNet = totalSalaireNet;
    }

    public double getTotalSalaireBrut() {
        return totalSalaireBrut;
    }

    public void setTotalSalaireBrut(double totalSalaireBrut) {
        this.totalSalaireBrut = totalSalaireBrut;
    }

    public double getTotaleCotisationPatronale() {
        return totaleCotisationPatronale;
    }

    public void setTotaleCotisationPatronale(double totaleCotisationPatronale) {
        this.totaleCotisationPatronale = totaleCotisationPatronale;
    }

    public double getTotaleCotisationSalariale() {
        return totaleCotisationSalariale;
    }

    public void setTotaleCotisationSalariale(double totaleCotisationSalariale) {
        this.totaleCotisationSalariale = totaleCotisationSalariale;
    }

    public double getTotalRetard() {
        return totalRetard;
    }

    public void setTotalRetard(double totalRetard) {
        this.totalRetard = totalRetard;
    }

    public LocalDateTime getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(LocalDateTime dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public int getNbreEmployeDeclare() {
        return nbreEmployeDeclare;
    }

    public void setNbreEmployeDeclare(int nbreEmployeDeclare) {
        this.nbreEmployeDeclare = nbreEmployeDeclare;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public TauxIr getTauxIr() {
        return tauxIr;
    }

    public void setTauxIr(TauxIr tauxIr) {
        this.tauxIr = tauxIr;
    }
}
