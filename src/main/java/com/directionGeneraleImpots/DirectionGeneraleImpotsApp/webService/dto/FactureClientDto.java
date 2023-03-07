package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.dto;

import java.time.LocalDateTime;

public class FactureClientDto {
    private Long id;
    private double mtHt;
    private double mtTtc;
    private double tva;

    private LocalDateTime dateFacture;
    private TypeFactureDto typeFacture;
    private SocieteDto societeClient;
    private TaxeIsDto taxeIs;

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

    public TypeFactureDto getTypeFacture() {
        return typeFacture;
    }

    public void setTypeFacture(TypeFactureDto typeFacture) {
        this.typeFacture = typeFacture;
    }

    public SocieteDto getSocieteClient() {
        return societeClient;
    }

    public void setSocieteClient(SocieteDto societeClient) {
        this.societeClient = societeClient;
    }

    public TaxeIsDto getTaxeIs() {
        return taxeIs;
    }

    public void setTaxeIs(TaxeIsDto taxeIs) {
        this.taxeIs = taxeIs;
    }
}
