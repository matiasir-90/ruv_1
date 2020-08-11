package com.ruv.entity;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
	@Table(name = "dim_campania")
	public class CampaniaEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "campania_id", nullable = false)
	    private Integer campania_id;
	    @Basic(optional = false)
	    @Column(name = "campania_desc")
	    private String campania_desce;
	    @Basic(optional = false)
	    @Column(name = "fecha_alta")
	    private LocalDate fecha_alta;
	    @Basic(optional = false)
	    @Column(name = "fecha_baja")
	    private LocalDate fecha_baja;

	    public CampaniaEntity() {
	    }

		public Integer getCampania_id() {
			return campania_id;
		}

		public void setCampania_id(Integer campania_id) {
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
