package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TypeFacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeFactureDao extends JpaRepository<TypeFacture, Long> {
    TypeFacture findByCode(String code);
    int deleteByCode(String code);

}
