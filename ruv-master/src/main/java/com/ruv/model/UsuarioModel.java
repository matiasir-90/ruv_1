package com.ruv.model;

import java.util.Date;

import com.ruv.entity.RolEntity;
public class UsuarioModel {

	
	private int id;
	private String usuarioDescripcion;
	private RolEntity rol_id;
	private String password;
    private String mail;
    private Date fecha_alta;
    private Date fecha_baja;
    private int contador;
    private char habilitado;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuarioDescripcion() {
		return usuarioDescripcion;
	}
	public void setUsuarioDescripcion(String usuarioDescripcion) {
		this.usuarioDescripcion = usuarioDescripcion;
	}
	public RolEntity getRol_id() {
		return rol_id;
	}
	public void setRol_id(RolEntity rol_id) {
		this.rol_id = rol_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public Date getFecha_baja() {
		return fecha_baja;
	}
	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public char getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(char habilitado) {
		this.habilitado = habilitado;
	}
	
}