package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Client;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.FactureClient;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

public interface FactureClientService {
    @Transactional
    int deleteByClientCin(String cin);
    FactureClient findByClientCinAndDateFacture(String cin , LocalDateTime dateFacture);
    List<FactureClient> findBySocieteIceAndTaxeIsProduitAndTypeFactureCode(String ice, double produit, String code);

    List<FactureClient> findAll();

    int save(String cin, LocalDateTime dateFacture,  FactureClient factureClient);

    FactureClient update(FactureClient factureClient);
}
