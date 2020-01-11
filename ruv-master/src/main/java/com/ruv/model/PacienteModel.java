package com.ruv.model;

import java.util.Date;

import com.ruv.entity.LocalidadEntity;
import com.ruv.entity.PaisEntity;
import com.ruv.entity.ProvinciaEntity;

public class PacienteModel {


	private int id;
	private String paciente_desc;
	private ProvinciaEntity provincia_id;
	private String dni;
	private Date fecha_nac;
	private String direccion;
	private String cod_postal;
	private LocalidadEntity localidad ;
	private ProvinciaEntity provincia;
	private PaisEntity pais ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaciente_desc() {
		return paciente_desc;
	}
	public void setPaciente_desc(String paciente_desc) {
		this.paciente_desc = paciente_desc;
	}
	public ProvinciaEntity getProvincia_id() {
		return provincia_id;
	}
	public void setProvincia_id(ProvinciaEntity provincia_id) {
		this.provincia_id = provincia_id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
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
