package com.ruv.entity;

import java.io.Serializable;
import java.util.Date;

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
	@Table(name = "dim_vacunatorio")
	public class VacunatorioEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "vacunatorio_id", nullable = false)
	    private Integer vacunatorio_id;
	    @Basic(optional = false)
	    @Column(name = "vacunatorio_desc")
	    private String vacunatorio_desc;
	    @Basic(optional = false)
	    @Column(name = "direccion")
	    private String direccion;
	    @Basic(optional = false)
	    @Column(name = "cod_postal")
	    private String cod_postal;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="localidad_id", nullable=false, updatable=false)
	     private  LocalidadEntity localidad ;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="provincia_id", nullable=false, updatable=false)
	     private ProvinciaEntity provincia;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="pais_id", nullable=false, updatable=false)
	     private  PaisEntity pais ;
	    
		public VacunatorioEntity() {
	    }
		public Integer getVacunatorio_id() {
			return vacunatorio_id;
		}
		public void setVacunatorio_id(Integer vacunatorio_id) {
			this.vacunatorio_id = vacunatorio_id;
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
