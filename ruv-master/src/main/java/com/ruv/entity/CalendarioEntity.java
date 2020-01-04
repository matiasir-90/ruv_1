/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matias
 */

// This class will manage calendars.
@Entity
@Table(name = "dim_calendario")
public class CalendarioEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "calendario_id", nullable = false)
    private Integer calendario_id;
    @Basic(optional = false)
    @Column(name = "calendario_desc")
    private String calendario_desce;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    private Date fecha_inicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin")
    private Date fecha_fin;

    public CalendarioEntity() {
    }

    public CalendarioEntity(Integer calendario_id, String calendario_desce, Date fecha_inicio, Date fecha_fin) {
        this.calendario_id = calendario_id;
        this.calendario_desce = calendario_desce;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Integer getCalendario_id() {
        return calendario_id;
    }

    public void setCalendario_id(Integer calendario_id) {
        this.calendario_id = calendario_id;
    }

    public String getCalendario_desce() {
        return calendario_desce;
    }

    public void setCalendario_desce(String calendario_desce) {
        this.calendario_desce = calendario_desce;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return "Calendarios{" + "calendario_id=" + calendario_id + ", calendario_desce=" + calendario_desce + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + '}';
    }

    
}

