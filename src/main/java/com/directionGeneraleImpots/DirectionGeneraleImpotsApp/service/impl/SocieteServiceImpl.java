package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.impl;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Societe;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao.SocieteDao;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class SocieteServiceImpl implements SocieteService {

    @Override
    public Societe findByIce(String ice) {
        Societe societe = null ;
        if (findByIce(societe.getIce())!= null){
            societe = societeDao.findByIce(ice);
        }
        return societe;
    }

    @Override
    @Transactional
    public int deleteByIce(String ice) {
        if (findByIce(ice) == null){
            return 0;
        }
        return societeDao.deleteByIce(ice);
    }

    @Override
    public List<Societe> findAll() {
        return societeDao.findAll();
    }

    @Override
    public int save(Societe societe) {
        if (findByIce(societe.getIce()) != null){
            return -1;
        }else{
            societeDao.save(societe);
            return 1;
        }
    }

    @Autowired
    private SocieteDao societeDao;
}
