package com.ruv.model;

import com.ruv.entity.ProvinciaEntity;

public class LocalidadModel {

	
	private int localidad_id;
	private String localidad_desc;
	private ProvinciaEntity provincia;
	
	
	public int getLocalidad_id() {
		return localidad_id;
	}
	public void setLocalidad_id(int localidad_id) {
		this.localidad_id = localidad_id;
	}
	public String getLocalidad_desc() {
		return localidad_desc;
	}
	public void setLocalidad_desc(String localidad_desc) {
		this.localidad_desc = localidad_desc;
	}
	public ProvinciaEntity getProvincia() {
		return provincia;
	}
	public void setProvincia (ProvinciaEntity provincia_id) {
		this.provincia= provincia_id;
	}
}
