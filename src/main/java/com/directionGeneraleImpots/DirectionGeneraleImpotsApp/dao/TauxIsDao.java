package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TauxIs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxIsDao extends JpaRepository<TauxIs, Long> {
}
