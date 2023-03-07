package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TaxeIrDetail;

import java.util.List;

public interface TaxeIrDetailService {
    List<TaxeIrDetail>  findAll();
    TaxeIrDetail findBySalaireBrut(double salaireBrut);
    int save(TaxeIrDetail taxeIrDetail);
}
