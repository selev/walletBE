package com.wallet.wallet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/hola")
    public ResponseEntity hola(){
        System.out.print("hola mundo");
        return ResponseEntity.ok("hola mundo");
    }
}
