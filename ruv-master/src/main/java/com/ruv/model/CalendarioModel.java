package com.ruv.model;

import java.time.LocalDate;


public class CalendarioModel {
	
	    private Integer calendario_id;
	    private String calendario_desce;
	    private LocalDate fecha_inicio;
	    private LocalDate fecha_fin;

	    public CalendarioModel() {
	    }

	    public CalendarioModel(Integer calendario_id, String calendario_desce, LocalDate fecha_inicio, LocalDate fecha_fin) {
	        this.calendario_id = calendario_id;
	        this.calendario_desce = calendario_desce;
	        this.fecha_inicio = fecha_inicio;
	        this.fecha_fin = fecha_fin;
	    }

	    public Integer getCalendario_id() {
	        return calendario_id;
	    }

	    public void setCalendario_id(Integer calendario_id) {
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

	    public LocalDate getFecha_fin() {
	        return fecha_fin;
	    }

	    public void setFecha_fin(LocalDate fecha_fin) {
	        this.fecha_fin = fecha_fin;
	    }

	    @Override
	    public String toString() {
	        return "Calendarios{" + "calendario_id=" + calendario_id + ", calendario_desce=" + calendario_desce + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + '}';
	    }

	    
	}