/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.VacunatorioEntity;
import com.ruv.model.VacunatorioModel;

/**
 *
 * @author matias
 */
   
public interface VacunatorioService {

	List<VacunatorioModel> getVacunatorio();
	VacunatorioEntity add(VacunatorioModel p);
	VacunatorioEntity listarId(int id);
	VacunatorioEntity edit(VacunatorioModel p);
	VacunatorioEntity delete(int id);
}

