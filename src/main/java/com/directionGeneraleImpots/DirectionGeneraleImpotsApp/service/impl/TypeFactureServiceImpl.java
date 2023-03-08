package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.impl;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.TypeFacture;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao.TypeFactureDao;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.TypeFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeFactureServiceImpl implements TypeFactureService {
    @Override
    public TypeFacture findByCode(String code) {
        return typeFactureDao.findByCode(code);
    }
    @Override
    @Transactional
    public int deleteByCode(String code) {
        return typeFactureDao.deleteByCode(code);
    }
    @Override
    public List<TypeFacture> findAll() {
        return typeFactureDao.findAll();
    }

    @Autowired
    private TypeFactureDao typeFactureDao;
}
