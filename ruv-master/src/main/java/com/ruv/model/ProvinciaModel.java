package com.ruv.model;

import com.ruv.entity.PaisEntity;

public class ProvinciaModel {

	
	private int id;
	private String provinciaDescripcion;
	private PaisEntity pais;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinciaDescripcion() {
		return provinciaDescripcion;
	}
	public void setProvinciaDescripcion(String provincia_desc) {
		this.provinciaDescripcion = provincia_desc;
	}
	public PaisEntity getPais() {
		return pais;
	}
	public void setPais(PaisEntity pais_id) {
		this.pais = pais_id;
	}
}
