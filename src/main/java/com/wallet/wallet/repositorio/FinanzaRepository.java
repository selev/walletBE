package com.wallet.wallet.repositorio;

import com.wallet.wallet.dto.FinanzaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FinanzaRepository {
    @Autowired
    private JdbcTemplate jdbctemplate;

    public void GuardarFinanzas(FinanzaDto FD){

        String sql = "INSERT INTO FINANZAS (ID,Nombre,Salario,Gastos,Moneda) values ("+FD.id+",'"+ FD.nombre+"','"+FD.salario+"',"+FD.gastos+","+FD.moneda+")";
        jdbctemplate.update(sql);

    }
}
