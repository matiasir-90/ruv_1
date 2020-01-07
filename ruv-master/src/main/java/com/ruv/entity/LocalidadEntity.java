package com.ruv.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	    
	    public LocalidadEntity() {
	    }
	  

	    

}
