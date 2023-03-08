package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Societe;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SocieteService {
    Societe findByIce(String ice);
    @Transactional
    int deleteByIce(String ice);
    List<Societe> findAll();
    int save(Societe societe);

}
