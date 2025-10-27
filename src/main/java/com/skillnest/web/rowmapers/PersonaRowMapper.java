package com.skillnest.web.rowmapers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.skillnest.web.models.Persona;

public class PersonaRowMapper implements RowMapper<Persona> {
    
	@Override
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
        Persona persona = new Persona();
        persona.setId(rs.getInt("id"));
        persona.setNombre(rs.getString("nombre"));
        persona.setEmail(rs.getString("email"));
        return persona;
    }


}
