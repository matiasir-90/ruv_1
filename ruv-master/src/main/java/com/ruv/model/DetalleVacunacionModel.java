package com.ruv.model;

import java.util.Date;

import com.ruv.entity.PacienteEntity;
import com.ruv.entity.UsuarioEntity;
import com.ruv.entity.VacunaEntity;


public class DetalleVacunacionModel {


	private int id;
	private PacienteEntity paciente_id;
	private VacunaEntity vacuna_id;
	private String calendario_id;
	private Date fecha_aplicacion;
	private String campania_id;
	private  UsuarioEntity usuario_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public PacienteEntity getPaciente_id() {
		return paciente_id;
	}
	public void setPaciente_id(PacienteEntity paciente_id) {
		this.paciente_id = paciente_id;
	}
	public VacunaEntity getVacuna_id() {
		return vacuna_id;
	}
	public void setVacuna_id(VacunaEntity vacuna_id) {
		this.vacuna_id = vacuna_id;
	}
	public void setUsuario_id(UsuarioEntity usuarioEntity) {
		this.usuario_id = usuarioEntity;
	}
	public String getCalendario_id() {
		return calendario_id;
	}
	public void setCalendario_id(String calendario_id) {
		this.calendario_id = calendario_id;
	}
	public Date getFecha_aplicacion() {
		return fecha_aplicacion;
	}
	public void setFecha_aplicacion(Date fecha_aplicacion) {
		this.fecha_aplicacion = fecha_aplicacion;
	}
	public String getCampania_id() {
		return campania_id;
	}
	public void setCampania_id(String campania_id) {
		this.campania_id = campania_id;
	}
	public UsuarioEntity getUsuario_id() {
		return usuario_id;
	}
	
	
}
