package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.impl;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Client;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.FactureClient;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Societe;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao.ClientDao;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao.FactureClientDao;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.ClientService;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.FactureClientService;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class FactureClientServiceImpl implements FactureClientService {

    @Override
    @Transactional
    public int deleteByTypeFactureCode(String code) {
        return factureClientDao.deleteByTypeFactureCode(code);
    }

    @Override
    public FactureClient findByTypeFactureCodeAndDateFacture(String code, LocalDateTime dateFacture) {
        return factureClientDao.findByTypeFactureCodeAndDateFacture(code, dateFacture);
    }
    @Override
    public List<FactureClient> findBySocieteIceAndTaxeIsProduitAndTypeFactureCode(String ice, double produit, String code) {
        return factureClientDao.findBySocieteIceAndTaxeIsProduitAndTypeFactureCode(ice, produit, code);
    }

    @Override
    public List<FactureClient> findAll() {
        return factureClientDao.findAll();
    }

    @Override
    public int save(String cin, LocalDateTime dateFacture){
        Societe societe = societeService.
    }

    @Override
    public FactureClient update(FactureClient factureClient) {
        return factureClientDao.save(factureClient);
    }

    @Autowired
    private FactureClientDao factureClientDao ;

    @Autowired
    private ClientService clientService;
    @Autowired
    private SocieteService societeService;
}

