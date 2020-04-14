package com.ruv.model;

import com.ruv.entity.PaisEntity;

public class ProvinciaModel {

	
	private int provincia_id;
	private String provincia_desc;
	private PaisEntity pais;
	

	public int getProvincia_id() {
		return provincia_id;
	}
	public void setProvincia_id(int provincia_id) {
		this.provincia_id = provincia_id;
	}
	public String getProvincia_desc() {
		return provincia_desc;
	}
	public void setProvincia_desc(String provincia_desc) {
		this.provincia_desc = provincia_desc;
	}
	public PaisEntity getPais() {
		return pais;
	}
	public void setPais(PaisEntity pais_id) {
		this.pais = pais_id;
	}
}
