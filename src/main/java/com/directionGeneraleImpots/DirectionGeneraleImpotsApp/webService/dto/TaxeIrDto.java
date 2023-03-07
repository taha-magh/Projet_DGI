package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.dto;

import java.time.LocalDateTime;

public class TaxeIrDto {
    private Long id;
    private int mois;
    private int anne;
    private double totalSalaireNet;
    private double totalSalaireBrut;
    private double totalRetard;
    private LocalDateTime dateDeclaration;
    private int nbreEmployeDeclare;
    private SocieteDto societe;
    private TauxIrDto tauxIr;

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

    public int getAnne() {
        return anne;
    }

    public void setAnne(int anne) {
        this.anne = anne;
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

    public SocieteDto getSociete() {
        return societe;
    }

    public void setSociete(SocieteDto societe) {
        this.societe = societe;
    }

    public TauxIrDto getTauxIr() {
        return tauxIr;
    }

    public void setTauxIr(TauxIrDto tauxIr) {
        this.tauxIr = tauxIr;
    }
}
