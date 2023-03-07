package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TauxIr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateApplicationDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateApplicationFin;
    private double salaireMaxNet;
    private double salaireMinNet;
    private double pourcentage;
    private double pourcentageCotisationPatronale;
    private double pourcentageCotisationSalariale;
    private double montantRetard;

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

    public double getPourcentageCotisationPatronale() {
        return pourcentageCotisationPatronale;
    }

    public void setPourcentageCotisationPatronale(double pourcentageCotisationPatronale) {
        this.pourcentageCotisationPatronale = pourcentageCotisationPatronale;
    }

    public double getPourcentageCotisationSalariale() {
        return pourcentageCotisationSalariale;
    }

    public void setPourcentageCotisationSalariale(double pourcentageCotisationSalariale) {
        this.pourcentageCotisationSalariale = pourcentageCotisationSalariale;
    }

    public double getMontantRetard() {
        return montantRetard;
    }

    public void setMontantRetard(double montantRetard) {
        this.montantRetard = montantRetard;
    }
}
