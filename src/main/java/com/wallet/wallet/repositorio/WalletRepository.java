package com.wallet.wallet.repositorio;

import com.wallet.wallet.dto.MonedaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WalletRepository {


    private List<MonedaDto> md = new ArrayList<MonedaDto>();

    @Autowired
    private JdbcTemplate jdbctemplate;
    public List<MonedaDto> buscarValoresMonedas(){
        md = new ArrayList<MonedaDto>();
        System.out.print("Repuesta ya tomada");
            List<String> listmoneda = new ArrayList<>();
            List<String> ls = jdbctemplate.queryForList("select ID from moneda",String.class);
            List<String> ls2 = jdbctemplate.queryForList("select pais from moneda",String.class);
            System.out.print("Valor que nos sale del list moneda: ");
            listmoneda.addAll(ls);
            listmoneda.addAll(ls2);
            System.out.print(listmoneda);
            for(int i=0;i<ls.size();i++) {
                MonedaDto aaa = new MonedaDto();
                aaa.id = ls.get(i);
                aaa.pais = ls2.get(i);
                md.add(aaa);
            }
            System.out.print(md.get(0).id+"  segundo pais: "+md.get(1).pais);


        return md;
    }



}

