package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TaxeIs;

public interface TaxeIsService {
    TaxeIs findByRefAndProduit(String ref, double produit);
}
