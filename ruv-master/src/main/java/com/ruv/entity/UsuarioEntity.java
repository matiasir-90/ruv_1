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
@Table(name = "dim_usuario")
public class UsuarioEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usuario_id", nullable = false)
    private Integer usuario_id;
    @Basic(optional = false)
    @Column(name = "usuario_desc")
    private String usuario_desc;
    @ManyToOne(optional=false) 
     @JoinColumn(name="rol_id", nullable=false, updatable=false)
     private  RolEntity rol;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = true)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = true)
    @Column(name = "fecha_alta")
    private Date fecha_alta;
    @Basic(optional = true)
    @Column(name = "fecha_baja")
    private Date fecha_baja;
    @Basic(optional = true)
    @Column(name = "contador")
    private int contador;
    @Basic(optional = true)
    @Column(name = "habilitado")
    private char habilitado;
    

	public  UsuarioEntity() {}
    
	public Integer getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Integer usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getUsuario_desc() {
		return usuario_desc;
	}
	public void setUsuario_desc(String usuario_desc) {
		this.usuario_desc = usuario_desc;
	}
	public RolEntity getRol() {
		return rol;
	}
	public void setRol(RolEntity rol) {
		this.rol = rol;
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