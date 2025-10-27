package com.skillnest.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillnest.web.models.Persona;
import com.skillnest.web.repositories.PersonaDao;

@Service
public class PersonaService {

    @Autowired
    private PersonaDao personaDao;

    public List<Persona> listarPersonas() {
        return personaDao.obtenerTodas();
    }

    public void registrarPersona(Persona persona) {
      int retorno =  personaDao.insertar(persona);
    }

    public void eliminarPersona(int id) {
        personaDao.eliminar(id);
    }
}
