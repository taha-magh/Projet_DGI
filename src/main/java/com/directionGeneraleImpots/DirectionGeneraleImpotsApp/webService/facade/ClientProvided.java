package com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.facade;

import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.bean.Client;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.service.impl.ClientServiceImpl;
import com.directionGeneraleImpots.DirectionGeneraleImpotsApp.webService.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/client")
public class ClientProvided {
    @GetMapping("/cin/{cin}")
    public ClientDto findByCin(@PathVariable String cin){

    }

    @DeleteMapping("/cin/{cin}")
    public ClientDto deleteByCin(@PathVariable String cin){

    }

    @GetMapping("/ice/{ice}")
    public ClientDto findBySocieteIce(@PathVariable String ice){

    }


    @Autowired
    private ClientServiceImpl clientService;
}
