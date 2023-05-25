package com.wallet.wallet.controller;

import com.wallet.wallet.dto.FinanzaDto;
import com.wallet.wallet.repositorio.FinanzaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanzaController {

    FinanzaRepository FR = new FinanzaRepository();


    @CrossOrigin
    @PostMapping(path="/finanza")
    public ResponseEntity crearFinanza(@RequestBody FinanzaDto dd){

        FR.GuardarFinanzas(dd);


        return ResponseEntity.status(201).build();
    }

}
