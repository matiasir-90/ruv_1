package com.ruv.model;


import com.ruv.entity.LocalidadEntity;
import com.ruv.entity.PaisEntity;
import com.ruv.entity.ProvinciaEntity;

public class VacunatorioModel {


	private int id;
	private String vacunatorio_desc;
	private String direccion;
	private LocalidadEntity localidad ;
	private ProvinciaEntity provincia;
	private PaisEntity pais ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVacunatorio_desc() {
		return vacunatorio_desc;
	}
	public void setVacunatorio_desc(String vacunatorio_desc) {
		this.vacunatorio_desc = vacunatorio_desc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public LocalidadEntity getLocalidad() {
		return localidad;
	}
	public void setLocalidad(LocalidadEntity localidad) {
		this.localidad = localidad;
	}
	public ProvinciaEntity getProvincia() {
		return provincia;
	}
	public void setProvincia(ProvinciaEntity provincia) {
		this.provincia = provincia;
	}
	public PaisEntity getPais() {
		return pais;
	}
	public void setPais(PaisEntity pais) {
		this.pais = pais;
	}
}
