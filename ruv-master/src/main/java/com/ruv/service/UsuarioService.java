/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service;


import java.util.List;

import com.ruv.entity.UsuarioEntity;
import com.ruv.model.UsuarioModel;

/**
 *
 * @author matias
 */
   
public interface UsuarioService {

	List<UsuarioModel> getUsuario();
	UsuarioEntity add(UsuarioModel p);
	UsuarioEntity listarId(int id);
	UsuarioEntity edit(UsuarioModel p);
	UsuarioEntity delete(int id);
}

