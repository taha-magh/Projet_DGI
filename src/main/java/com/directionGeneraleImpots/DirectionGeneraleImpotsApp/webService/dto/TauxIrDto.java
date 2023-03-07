package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.dto;

import java.time.LocalDateTime;

public class TauxIrDto {
    private Long id;
    private LocalDateTime dateApplicationDebut;
    private LocalDateTime dateApplicationFin;
    private double salaireMaxNet;
    private double salaireMinNet;
    private double pourcentage;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDateApplicationDebut() {
        return dateApplicationDebut;
    }

    public void setDateApplicationDebut(LocalDateTime dateApplicationDebut) {
        this.dateApplicationDebut = dateApplicationDebut;
    }

    public LocalDateTime getDateApplicationFin() {
        return dateApplicationFin;
    }

    public void setDateApplicationFin(LocalDateTime dateApplicationFin) {
        this.dateApplicationFin = dateApplicationFin;
    }

    public double getSalaireMaxNet() {
        return salaireMaxNet;
    }

    public void setSalaireMaxNet(double salaireMaxNet) {
        this.salaireMaxNet = salaireMaxNet;
    }

    public double getSalaireMinNet() {
        return salaireMinNet;
    }

    public void setSalaireMinNet(double salaireMinNet) {
        this.salaireMinNet = salaireMinNet;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }
}
