package com.m5a.Guia_Practica_Mongo_Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Document(collection = "Persona")

public class Persona {

	@Id
	private Long id; 
	private String nombre;
	private String apellido;
	private String direccion;
	private Contactos contactos;
	private List<Telefonia> listTelefonia;
	
	public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String direccion, Contactos contactos, List<Telefonia> listTelefonia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.contactos = contactos;
        this.listTelefonia = listTelefonia;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Contactos getContactos() {
		return contactos;
	}
	public void setContactos(Contactos contactos) {
		this.contactos = contactos;
	}
	public List<Telefonia> getListTelefonia() {
		return listTelefonia;
	}
	public void setListTelefonia(List<Telefonia> listTelefonia) {
		this.listTelefonia = listTelefonia;
	} 
	
	
	
}
