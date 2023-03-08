package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TypeFacture;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TypeFactureService {

    TypeFacture findByCode(String code);

    @Transactional
    int deleteByCode(String code);

    List<TypeFacture> findAll();
}
