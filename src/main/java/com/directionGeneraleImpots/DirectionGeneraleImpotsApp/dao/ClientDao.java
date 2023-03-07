package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.dao;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
    Client findByCin(String cin);
    int deleteByCin(String cin);
    List<Client> findBySocieteIce(Long ice);
}
