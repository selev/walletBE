package com.wallet.wallet.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WalletRepository {

    @Autowired
    private JdbcTemplate jdbctemplate;
    public void buscarValoresMonedas(){
        List<String> listmoneda = jdbctemplate.queryForList("select pais from moneda",String.class);
        System.out.print("Valor que nos sale del list moneda: ");
        System.out.print(listmoneda);
    }


}
