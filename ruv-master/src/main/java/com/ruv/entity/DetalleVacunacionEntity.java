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
	@Table(name = "det_vacunacion")
	public class DetalleVacunacionEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "det_vac_id", nullable = false)
	    private Integer det_vac_id;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="paciente_id", nullable=false, updatable=false)
	     private  PacienteEntity paciente_id;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="vacuna_id", nullable=false, updatable=false)
	     private  VacunaEntity vacuna_id ;
	    @Basic(optional = false)
	    @Column(name = "calendario_id")
	    private String calendario_id;
	    @Basic(optional = false)
	    @Column(name = "fecha_aplicacion")
	    private Date fecha_aplicacion;
	    @Basic(optional = false)
	    @Column(name = "campania_id")
	    private String campania_id;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="usuario_id", nullable=false, updatable=false)
	     private  UsuarioEntity usuario_id;
	    
		public DetalleVacunacionEntity() {
	    }

		public Integer getDet_vac_id() {
			return det_vac_id;
		}

		public void setDet_vac_id(Integer det_vac_id) {
			this.det_vac_id = det_vac_id;
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

		public void setUsuario_id(UsuarioEntity usuario_id) {
			this.usuario_id = usuario_id;
		}
		
		
}
