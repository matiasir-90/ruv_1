package com.ruv.model;


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
    private Date fecha_alta;
    private Date fecha_baja;
    private Date fecha_ult_mod;
    
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
	public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public Date getFecha_baja() {
		return fecha_baja;
	}
	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	public Date getFecha_ult_mod() {
		return fecha_ult_mod;
	}
	public void setFecha_ult_mod(Date fecha_ult_mod) {
		this.fecha_ult_mod = fecha_ult_mod;
	}
    
    
}
