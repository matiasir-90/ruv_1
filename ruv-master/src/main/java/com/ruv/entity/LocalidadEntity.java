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
	@Table(name = "dim_localidad")
	public class LocalidadEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "localidad_id", nullable = false)
	    private Integer localidad_id;
	    @Basic(optional = false)
	    @Column(name = "localidad_desc")
	    private String localidad_desc;
	    @ManyToOne(optional=false) 
	     @JoinColumn(name="provincia_id", nullable=false, updatable=false)
	     private  ProvinciaEntity provincia ;

	    public Integer getLocalidad_id() {
			return localidad_id;
		}

		public void setLocalidad_id(Integer localidad_id) {
			this.localidad_id = localidad_id;
		}

		public String getLocalidad_desc() {
			return localidad_desc;
		}

		public void setLocalidad_desc(String localidad_desc) {
			this.localidad_desc = localidad_desc;
		}

		public ProvinciaEntity getProvincia() {
			return provincia;
		}

		public void setProvincia(ProvinciaEntity provincia) {
			this.provincia = provincia;
		}

		public LocalidadEntity() {
	    }
	  

	    

}
