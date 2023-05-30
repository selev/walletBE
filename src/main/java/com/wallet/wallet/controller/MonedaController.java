package com.wallet.wallet.controller;

import com.wallet.wallet.dto.MonedaDto;
import com.wallet.wallet.repositorio.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MonedaController {

    @Autowired
    private WalletRepository wr;



    @CrossOrigin
    @GetMapping(path="/moneda")
    public ResponseEntity ListaMonedas(){
        ArrayList<MonedaDto> moneda = new ArrayList<>();
        moneda.addAll(wr.buscarValoresMonedas());


        return ResponseEntity.ok(moneda);
    }




}
