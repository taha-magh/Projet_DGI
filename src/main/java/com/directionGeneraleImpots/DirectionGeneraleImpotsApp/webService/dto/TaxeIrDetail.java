package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.dto;

public class TaxeIrDetail {
    private Long id;
    private double salaireBrut;
    private double salaireNet;
    private double cotisationPatronal;
    private double cotisationSalarial;
    private double cotisationTotal;
    private EmployeDto employe;
    private TaxeIrDto taxeIr;
    private TauxIrDto tauxIr;

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

    public EmployeDto getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDto employe) {
        this.employe = employe;
    }

    public TaxeIrDto getTaxeIr() {
        return taxeIr;
    }

    public void setTaxeIr(TaxeIrDto taxeIr) {
        this.taxeIr = taxeIr;
    }

    public TauxIrDto getTauxIr() {
        return tauxIr;
    }

    public void setTauxIr(TauxIrDto tauxIr) {
        this.tauxIr = tauxIr;
    }
}
