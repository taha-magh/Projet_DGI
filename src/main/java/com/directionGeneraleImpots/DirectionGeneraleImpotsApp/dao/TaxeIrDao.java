package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TaxeIr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeIrDao extends JpaRepository<TaxeIr, Long> {

}
