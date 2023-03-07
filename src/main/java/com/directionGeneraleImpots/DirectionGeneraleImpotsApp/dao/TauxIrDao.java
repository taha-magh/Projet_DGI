package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TauxIr;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TauxIrDao extends JpaRepository<TauxIr, Long> {

    TauxIr findBySalaireBrut(double salaireBrut);

}
