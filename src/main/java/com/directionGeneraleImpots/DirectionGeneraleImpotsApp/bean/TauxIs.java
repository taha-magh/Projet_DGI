package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class TauxIs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateApplicationDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateApplicationFin;
    private double pourcentage;
    private double resultatMin;
    private double resultatMax;
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

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public double getResultatMin() {
        return resultatMin;
    }

    public void setResultatMin(double resultatMin) {
        this.resultatMin = resultatMin;
    }

    public double getResultatMax() {
        return resultatMax;
    }

    public void setResultatMax(double resultatMax) {
        this.resultatMax = resultatMax;
    }

    public double getMontantRetard() {
        return montantRetard;
    }

    public void setMontantRetard(double montantRetard) {
        this.montantRetard = montantRetard;
    }
}
