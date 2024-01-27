package com.m5a.Guia_Practica_Mongo_Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Telefonia")
public class Telefonia {

	private String tipo_telefonia;
	private String telefono;
	public String getTipo_telefonia() {
		return tipo_telefonia;
	}
	public void setTipo_telefonia(String tipo_telefonia) {
		this.tipo_telefonia = tipo_telefonia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
