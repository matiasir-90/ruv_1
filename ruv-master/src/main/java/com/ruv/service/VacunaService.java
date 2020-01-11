/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.VacunaEntity;
import com.ruv.model.VacunaModel;

/**
 *
 * @author matias
 */
   
public interface VacunaService {

	List<VacunaModel> getVacuna();
	VacunaEntity add(VacunaModel p);
	VacunaEntity listarId(int id);
	VacunaEntity edit(VacunaModel p);
	VacunaEntity delete(int id);
}

