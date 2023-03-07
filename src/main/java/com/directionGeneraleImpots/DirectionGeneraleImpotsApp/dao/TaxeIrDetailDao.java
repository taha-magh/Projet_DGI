package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TaxeIrDetail;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxeIrDetailDao extends JpaRepository<TaxeIrDetail, Long> {
    TaxeIrDetail findBySalaireBrut(double salaireBrut);

}
