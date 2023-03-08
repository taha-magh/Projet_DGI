package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.impl;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Client;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.FactureClient;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Societe;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TypeFacture;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao.FactureClientDao;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.ClientService;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.FactureClientService;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.SocieteService;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.TypeFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class FactureClientServiceImpl implements FactureClientService {


    @Override
    @Transactional
    public int deleteByClientCin(String cin) {
        return factureClientDao.deleteByClientCin(cin);
    }

    @Override
    public FactureClient findByClientCinAndDateFacture(String cin, LocalDateTime dateFacture) {
        return factureClientDao.findByClientCinAndDateFacture(cin,dateFacture);
    }
    @Override
    public List<FactureClient> findBySocieteIceAndTaxeIsProduitAndClientCin(String ice, double produit, String cin) {
        return factureClientDao.findBySocieteIceAndTaxeIsProduitAndTypeFactureCode(ice, produit, cin);
    }

    @Override
    public List<FactureClient> findAll() {
        return factureClientDao.findAll();
    }
    @Override
    public int save(String cin, LocalDateTime dateFacture){
        Client client = clientService.findByCin(cin);
        if (client == null){
            return -1;
        }
        Societe societe = client.getSociete();
        if (societe == null){
            return -2;
        }
        TypeFacture typeFacture = societe.getTypeFacture() ;
        if (typeFacture == null) {
            return -3;
        }
        TaxeIs taxeIs = typeFacture.getTaxeIs();
        // produit de TaxeIs n'existe pas
        if (taxeIs == null {
            return -4;
        }else if (taxeIs.getProduit() == null){
            return -5;
        }else {


        }

    }

    @Override
    public FactureClient update(FactureClient factureClient) {
        return factureClientDao.save(factureClient);
    }

    @Autowired
    private FactureClientDao factureClientDao ;
    @Autowired
    private TypeFactureService typeFactureService;

    @Autowired
    private ClientService clientService;
    @Autowired
    private SocieteService societeService;
}

