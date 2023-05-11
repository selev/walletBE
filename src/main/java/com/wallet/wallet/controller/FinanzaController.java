package com.wallet.wallet.controller;

import com.wallet.wallet.dto.FinanzaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanzaController {


    @CrossOrigin
    @PostMapping(path="/finanza")
    public ResponseEntity crearFinanza(@RequestBody FinanzaDto dd){
        


        return ResponseEntity.status(201).build();
    }

}
