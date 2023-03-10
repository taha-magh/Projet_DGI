package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TaxeIs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeIsDao extends JpaRepository<TaxeIs, Long> {
    TaxeIs findByRefAndProduit(String ref, double produit);

}
