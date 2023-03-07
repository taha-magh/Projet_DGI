package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Client;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ClientService {
    Client findByCin(String cin);
    @Transactional
    int deleteByCin(String cin);
    List<Client> findBySocieteIce(Long ice);
    List<Client> findAll();
    int save (Client client);

}
