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
	@Table(name = "dim_rol")
	public class RolEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "rol_id", nullable = false)
	    private Integer rol_id;
	    @Basic(optional = false)
	    @Column(name = "rol_desc")
	    private String rol_desc;
	    
	    public RolEntity() {
	    }

		public Integer getRol_id() {
			return rol_id;
		}

		public void setRol_id(Integer rol_id) {
			this.rol_id = rol_id;
		}

		public String getRol_desc() {
			return rol_desc;
		}

		public void setRol_desc(String rol_desc) {
			this.rol_desc = rol_desc;
		}


	    
	
}
