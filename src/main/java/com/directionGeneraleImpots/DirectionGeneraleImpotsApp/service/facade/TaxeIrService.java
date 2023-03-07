package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TauxIr;

import java.util.List;

public interface TaxeIrService {

    TauxIr findBySalaireBrut(double salaireBrut);
    List<TauxIr> findAll();
    int save(TauxIr tauxIr);

}
