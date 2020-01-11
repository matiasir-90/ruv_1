/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.PacienteEntity;
import com.ruv.model.PacienteModel;

/**
 *
 * @author matias
 */
   
public interface PacienteService {

	List<PacienteModel> getPaciente();
	PacienteEntity add(PacienteModel p);
	PacienteEntity listarId(int id);
	PacienteEntity edit(PacienteModel p);
	PacienteEntity delete(int id);
}

