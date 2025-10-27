package com.skillnest.web.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.skillnest.web.models.Persona;
import com.skillnest.web.rowmapers.PersonaRowMapper;

@Repository
public class PersonaDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Métodos CRUD aquí
    
    public List<Persona> obtenerTodas() {
        String sql = "SELECT * FROM personas";
        return jdbcTemplate.query(sql, new PersonaRowMapper());
    }

    public Persona obtenerPorId(int id) {
        String sql = "SELECT * FROM personas WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new PersonaRowMapper(), id);
    }
    
    public Persona obtenerPorEmail(String email) {
        String sql = "SELECT * FROM personas WHERE email = ?";
        return jdbcTemplate.queryForObject(sql, new PersonaRowMapper(), email);
    }
    
 // INSERT
    public int insertar(Persona persona) {
        String sql = "INSERT INTO personas (nombre, email) VALUES (?, ?)";
        return jdbcTemplate.update(sql, persona.getNombre(), persona.getEmail());
    }

    // UPDATE
    public int actualizar(Persona persona) {
        String sql = "UPDATE personas SET nombre = ?, email = ? WHERE id = ?";
        return jdbcTemplate.update(sql, persona.getNombre(), persona.getEmail(), persona.getId());
    }

    // DELETE
    public int eliminar(int id) {
        String sql = "DELETE FROM personas WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
