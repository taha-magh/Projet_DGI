package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.impl;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TaxeIs;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.TauxIsService;

public class TauxIsServiceImpl implements TauxIsService {
    @Override
    public TaxeIs findByRefAndProduit(String ref, double produit);

    @Override
    public TaxeIs findByRef(String ref) {
        return null;
    }
}
