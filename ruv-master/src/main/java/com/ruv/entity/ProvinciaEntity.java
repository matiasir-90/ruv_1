package com.ruv.entity;

import java.io.Serializable;
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
	@Table(name = "dim_provincia")
	public class ProvinciaEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "provincia_id", nullable = false)
	    private Integer provincia_id;
	    @Basic(optional = false)
	    @Column(name = "provincia_desc")
	    private String provincia_desc;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="pais_id", nullable=false, updatable=false)
	     private  PaisEntity pais ;


	    public Integer getProvincia_id() {
			return provincia_id;
		}


		public void setProvincia_id(Integer provincia_id) {
			this.provincia_id = provincia_id;
		}


		public String getProvincia_desc() {
			return provincia_desc;
		}


		public void setProvincia_desc(String provincia_desc) {
			this.provincia_desc = provincia_desc;
		}


		public PaisEntity getPais() {
			return pais;
		}


		public void setPais(PaisEntity pais) {
			this.pais = pais;
		}

		public ProvinciaEntity() {
	    }
	  

	    

}
