/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.DetalleVacunacionEntity;
import com.ruv.model.DetalleVacunacionModel;

/**
 *
 * @author matias
 */
   
public interface DetalleVacunacionService {

	List<DetalleVacunacionModel> getDetalleVacunacion();
	DetalleVacunacionEntity add(DetalleVacunacionModel p);
	DetalleVacunacionEntity listarId(int id);
	DetalleVacunacionEntity edit(DetalleVacunacionModel p);
	DetalleVacunacionEntity delete(int id);
}

