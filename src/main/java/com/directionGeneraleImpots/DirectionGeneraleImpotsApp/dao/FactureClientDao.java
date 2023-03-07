package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.FactureClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FactureClientDao extends JpaRepository<FactureClient, Long> {
    int deleteByClientCin(String cin);
    FactureClient findByClientCinAndDateFacture(String cin , LocalDateTime dateFacture);
    List<FactureClient> findBySocieteIceAndTaxeIsProduitAndTypeFactureCode(String ice, double produit, String code);

}
