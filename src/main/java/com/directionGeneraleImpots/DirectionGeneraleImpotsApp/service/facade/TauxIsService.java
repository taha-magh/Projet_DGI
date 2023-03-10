package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TaxeIs;

public interface TauxIsService {
    TaxeIs findByRef(String ref);
}
