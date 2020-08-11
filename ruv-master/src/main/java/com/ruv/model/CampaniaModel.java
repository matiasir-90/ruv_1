package com.ruv.model;

import java.time.LocalDate;

public class CampaniaModel {

	
	private int campania_id;
	private String campania_desce;
	private LocalDate fecha_alta;
	private LocalDate fecha_baja;
	public int getCampania_id() {
		return campania_id;
	}
	public void setCampania_id(int campania_id) {
		this.campania_id = campania_id;
	}
	public String getCampania_desce() {
		return campania_desce;
	}
	public void setCampania_desce(String campania_desce) {
		this.campania_desce = campania_desce;
	}
	public LocalDate getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(LocalDate fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public LocalDate getFecha_baja() {
		return fecha_baja;
	}
	public void setFecha_baja(LocalDate fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

}
