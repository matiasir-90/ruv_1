/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.LocalidadEntity;
import com.ruv.model.LocalidadModel;

/**
 *
 * @author matias
 */
   
public interface LocalidadService {

	List<LocalidadModel> getLocalidad();
	LocalidadEntity add(LocalidadModel p);
	LocalidadEntity listarId(int id);
	LocalidadEntity edit(LocalidadModel p);
	LocalidadEntity delete(int id);
}

