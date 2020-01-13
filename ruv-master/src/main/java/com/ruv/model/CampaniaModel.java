package com.ruv.model;
import java.util.Date;

public class CampaniaModel {

	
	private int id;
	private String campaniaDescripcion;
	private Date fechaAlta;
	private Date fechaBaja;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaniaDescripcion() {
		return campaniaDescripcion;
	}
	public void setCampaniaDescripcion(String campaniaDescripcion) {
		this.campaniaDescripcion = campaniaDescripcion;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
}
