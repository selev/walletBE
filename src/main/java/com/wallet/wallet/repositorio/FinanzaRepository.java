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
        jdbctemplate.update("");

    }
}
