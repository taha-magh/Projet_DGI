package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

@Entity
public class TaxeIrDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double salaireBrut;
    private double salaireNet; // salaire net = salaire brute - ((salaire brute * pourcentage) + (cotisation salariale))
    private double cotisationPatronal; // salaire brute * pourcentage cotisation patronale
    private double cotisationSalarial; // salaire brute * % cotisation slariale
    private double cotisationTotal;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private TaxeIr taxeIr;
    @ManyToOne
    private TauxIr tauxIr;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public void setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public double getSalaireNet() {
        return salaireNet;
    }

    public void setSalaireNet(double salaireNet) {
        this.salaireNet = salaireNet;
    }

    public double getCotisationPatronal() {
        return cotisationPatronal;
    }

    public void setCotisationPatronal(double cotisationPatronal) {
        this.cotisationPatronal = cotisationPatronal;
    }

    public double getCotisationSalarial() {
        return cotisationSalarial;
    }

    public void setCotisationSalarial(double cotisationSalarial) {
        this.cotisationSalarial = cotisationSalarial;
    }

    public double getCotisationTotal() {
        return cotisationTotal;
    }

    public void setCotisationTotal(double cotisationTotal) {
        this.cotisationTotal = cotisationTotal;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public TaxeIr getTaxeIr() {
        return taxeIr;
    }

    public void setTaxeIr(TaxeIr taxeIr) {
        this.taxeIr = taxeIr;
    }

    public TauxIr getTauxIr() {
        return tauxIr;
    }

    public void setTauxIr(TauxIr tauxIr) {
        this.tauxIr = tauxIr;
    }
}
