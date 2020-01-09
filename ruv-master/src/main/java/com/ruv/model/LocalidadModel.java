package com.ruv.model;

import com.ruv.entity.ProvinciaEntity;

public class LocalidadModel {

	
	private int id;
	private String localidadDescripcion;
	private ProvinciaEntity provincia_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalidadDescripcion() {
		return localidadDescripcion;
	}
	public void setLocalidadDescripcion(String localidad_desc) {
		this.localidadDescripcion = localidad_desc;
	}
	public ProvinciaEntity getProvincia_id() {
		return provincia_id;
	}
	public void setPais_id(ProvinciaEntity provincia_id) {
		this.provincia_id = provincia_id;
	}
}
