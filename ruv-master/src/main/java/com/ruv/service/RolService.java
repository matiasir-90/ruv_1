/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.RolEntity;
import com.ruv.model.RolModel;

/**
 *
 * @author matias
 */
   
public interface RolService {

	List<RolModel> getRol();
	RolEntity add(RolModel p);
	RolEntity listarId(int id);
	RolEntity edit(RolModel p);
	RolEntity delete(int id);
}

