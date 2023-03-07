package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class FactureClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double mtHt;
    private double mtTtc;
    private double tva;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateFacture;
    @ManyToOne
    private TypeFacture typeFacture;
    @ManyToOne
    private Societe societe;
    @ManyToOne
    private TaxeIs taxeIs;
    @ManyToOne
    private Client client;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public double getMtHt() {
        return mtHt;
    }

    public void setMtHt(double mtHt) {
        this.mtHt = mtHt;
    }

    public double getMtTtc() {
        return mtTtc;
    }

    public void setMtTtc(double mtTtc) {
        this.mtTtc = mtTtc;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public LocalDateTime getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(LocalDateTime dateFacture) {
        this.dateFacture = dateFacture;
    }

    public TypeFacture getTypeFacture() {
        return typeFacture;
    }

    public void setTypeFacture(TypeFacture typeFacture) {
        this.typeFacture = typeFacture;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public TaxeIs getTaxeIs() {
        return taxeIs;
    }

    public void setTaxeIs(TaxeIs taxeIs) {
        this.taxeIs = taxeIs;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
