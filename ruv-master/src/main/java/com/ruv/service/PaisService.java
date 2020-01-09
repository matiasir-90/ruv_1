/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.PaisEntity;
import com.ruv.model.PaisModel;

/**
 *
 * @author matias
 */
   
public interface PaisService {

	List<PaisModel> getPais();
	PaisEntity add(PaisModel p);
	PaisEntity listarId(int id);
	PaisEntity edit(PaisModel p);
	PaisEntity delete(int id);
}

