package com.ruv.model;

import com.ruv.entity.ProvinciaEntity;

public class LocalidadModel {

	
	private int id;
	private String localidadDescripcion;
	private ProvinciaEntity provincia;
	
	
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
	public ProvinciaEntity getProvincia() {
		return provincia;
	}
	public void setProvincia (ProvinciaEntity provincia_id) {
		this.provincia= provincia_id;
	}
}
