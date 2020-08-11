package com.ruv.model;

import java.time.LocalDate;
import java.util.Date;

import com.ruv.entity.LocalidadEntity;

public class PacienteModel {


	private int paciente_id;
	private String paciente_desc;
	private String dni;
	private LocalDate fecha_nac;
	private String direccion;
	private String cod_postal;
	private LocalidadEntity localidad ;
	
	

	public int getPaciente_id() {
		return paciente_id;
	}
	public void setPaciente_id(int paciente_id) {
		this.paciente_id = paciente_id;
	}
	public String getPaciente_desc() {
		return paciente_desc;
	}
	public void setPaciente_desc(String paciente_desc) {
		this.paciente_desc = paciente_desc;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCod_postal() {
		return cod_postal;
	}
	public void setCod_postal(String cod_postal) {
		this.cod_postal = cod_postal;
	}
	public LocalidadEntity getLocalidad() {
		return localidad;
	}
	public void setLocalidad(LocalidadEntity localidad) {
		this.localidad = localidad;
	}

}
