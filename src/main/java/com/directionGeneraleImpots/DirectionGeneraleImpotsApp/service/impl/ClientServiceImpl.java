package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.impl;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Client;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao.ClientDao;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public Client findByCin(String cin) {
        return clientDao.findByCin(cin);
    }

    @Override
    @Transactional
    public int deleteByCin(String cin) {
        return clientDao.deleteByCin(cin);
    }

    @Override
    public List<Client> findBySocieteIce(Long ice) {
        return clientDao.findBySocieteIce(ice);
    }

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public int save(Client client) {
        if (findByCin(client.getCin()) != null){
            return -1;
        }else{
            clientDao.save(client);
            return 1;
        }
    }

    @Autowired
    private ClientDao clientDao;
}
