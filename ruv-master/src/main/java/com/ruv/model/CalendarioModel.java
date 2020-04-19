package com.ruv.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CalendarioModel {
	
	private int calendario_id;

	private String calendario_desce;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate fecha_inicio;
	private Date fecha_fin;
	
	public int getCalendario_id() {
		return calendario_id;
	}
	public void setCalendario_id(int calendario_id) {
		this.calendario_id = calendario_id;
	}
	public String getCalendario_desce() {
		return calendario_desce;
	}
	public void setCalendario_desce(String calendario_desce) {
		this.calendario_desce = calendario_desce;
	}
	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
}
