package com.ruv.model;


import java.time.LocalDate;
import java.util.Date;

import com.ruv.entity.CalendarioEntity;

public class VacunaModel {

    private Integer vacuna_id;
    private String vacuna_desc;
    private String detalle;
    private String formula;
    private String observaciones; 

    private  CalendarioEntity calendario;
    private char campania;
    private LocalDate fecha_alta;
    private LocalDate fecha_baja;
    private LocalDate fecha_ult_mod;
    
	public Integer getVacuna_id() {
		return vacuna_id;
	}
	public void setVacuna_id(Integer vacuna_id) {
		this.vacuna_id = vacuna_id;
	}
	public String getVacuna_desc() {
		return vacuna_desc;
	}
	public void setVacuna_desc(String vacuna_desc) {
		this.vacuna_desc = vacuna_desc;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public CalendarioEntity getCalendario() {
		return calendario;
	}
	public void setCalendario(CalendarioEntity calendario) {
		this.calendario = calendario;
	}
	public char getCampania() {
		return campania;
	}
	public void setCampania(char campania) {
		this.campania = campania;
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
	public LocalDate getFecha_ult_mod() {
		return fecha_ult_mod;
	}
	public void setFecha_ult_mod(LocalDate fecha_ult_mod) {
		this.fecha_ult_mod = fecha_ult_mod;
	}
    
    
}
