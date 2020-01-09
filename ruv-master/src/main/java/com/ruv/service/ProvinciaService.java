/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.ProvinciaEntity;
import com.ruv.model.ProvinciaModel;

/**
 *
 * @author matias
 */
   
public interface ProvinciaService {

	List<ProvinciaModel> getProvincia();
	ProvinciaEntity add(ProvinciaModel p);
	ProvinciaEntity listarId(int id);
	ProvinciaEntity edit(ProvinciaModel p);
	ProvinciaEntity delete(int id);
}

