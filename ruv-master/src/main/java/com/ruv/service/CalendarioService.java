/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;

import com.ruv.entity.CalendarioEntity;
import com.ruv.model.CalendarioModel;

import java.util.List;

/**
 *
 * @author matias
 */
   
public interface CalendarioService {

	List<CalendarioModel> getCalendario();
	CalendarioEntity add(CalendarioModel p);
	CalendarioEntity listarId(int id);
	CalendarioEntity edit(CalendarioModel p);
	CalendarioEntity delete(int id);
}

