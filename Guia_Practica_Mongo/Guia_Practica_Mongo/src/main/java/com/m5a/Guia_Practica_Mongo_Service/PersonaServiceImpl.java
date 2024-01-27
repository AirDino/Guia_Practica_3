package com.m5a.Guia_Practica_Mongo_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.m5a.Guia_Practica_Mongo_Model.Persona;
import com.m5a.Guia_Practica_Mongo_Repository.PersonaRepository;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;
    
    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }

}
