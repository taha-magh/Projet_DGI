package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocieteDao extends JpaRepository<Societe, Long> {
}
