package com.m5a.Guia_Practica_Mongo_Service;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Usuario
 *
 * @param <T>
 * @param <String>
 */

public interface GenericService <T, ID extends Serializable>{
	public T save(T entity);
	public T findById(ID id);
	public List<T> findByAll();
	public void delete(ID id);

}
