package com.m5a.Guia_Practica_Mongo_Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.m5a.Guia_Practica_Mongo_Model.Persona;


@Repository
public interface PersonaRepository extends MongoRepository<Persona, Long>{

}
