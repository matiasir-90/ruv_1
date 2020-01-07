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
	@Table(name = "dim_pais")
	public class PaisEntity implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "pais_id", nullable = false)
	    private Integer pais_id;
	    @Basic(optional = false)
	    @Column(name = "pais_desc")
	    private String pais_desc;
	    
	    public PaisEntity() {
	    }
	    
		public Integer getPais_id() {
			return pais_id;
		}
		public void setPais_id(Integer pais_id) {
			this.pais_id = pais_id;
		}
		public String getPais_desc() {
			return pais_desc;
		}
		public void setPais_desc(String pais_desc) {
			this.pais_desc = pais_desc;
		}

	    

}
