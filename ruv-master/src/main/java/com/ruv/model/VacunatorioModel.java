package com.ruv.model;


import com.ruv.entity.LocalidadEntity;

public class VacunatorioModel {


	private int id;
	private String vacunatorio_desc;
	private String direccion;
	private LocalidadEntity localidad ;
	
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
}
