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
	@Table(name = "dim_paciente")
	public class PacienteEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "paciente_id", nullable = false)
	    private Integer paciente_id;
	    @Basic(optional = false)
	    @Column(name = "paciente_desc")
	    private String paciente_desc;
	    @Basic(optional = false)
	    @Column(name = "dni")
	    private String dni;
	    @Basic(optional = false)
	    @Column(name = "fecha_nac")
	    private Date fecha_nac;
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
	    
		public PacienteEntity() {
	    }
		public Integer getPaciente_id() {
			return paciente_id;
		}
		public void setPaciente_id(Integer paciente_id) {
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
