package com.ruv.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "dim_vacuna")
	public class VacunaEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "vacuna_id", nullable = false)
	    private Integer vacuna_id;
	    @Basic(optional = false)
	    @Column(name = "vacuna_desc")
	    private String vacuna_desc;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="calendario_id", nullable=false, updatable=false)
	     private  CalendarioEntity calendario;
	    @Basic(optional = false)
	    @Column(name = "detalle")
	    private String detalle;
	    @Basic(optional = false)
	    @Column(name = "formula")
	    private String formula;
	    @Basic(optional = false)
	    @Column(name = "observaciones")
	    private String observaciones; 
	    
	    @Basic(optional = false)
	    @Column(name = "campania")
	    private char campania;
	    @Basic(optional = false)
	    @Column(name = "fecha_alta")
	    private LocalDate fecha_alta;
	    @Basic(optional = false)
	    @Column(name = "fecha_baja")
	    private LocalDate fecha_baja;
	    @Basic(optional = false)
	    @Column(name = "fecha_ult_md")
	    private LocalDate fecha_ult_mod;
	    
	    
	    
		public VacunaEntity() {
	    }
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
		public CalendarioEntity getCalendario() {
			return calendario;
		}
		public void setCalendario(CalendarioEntity calendario) {
			this.calendario = calendario;
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
		public char getCampania() {
			return campania;
		}
		public void setCampania(char campania) {
			this.campania = campania;
		}
		public LocalDate getFecha_alta() {
			return fecha_alta;
		}
		public void setFecha_inicio(LocalDate fecha_alta) {
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
