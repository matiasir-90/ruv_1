/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.UsuarioEntity;
import com.ruv.model.UsuarioModel;
import com.ruv.repository.UsuarioRepository;
import com.ruv.service.UsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matias
 *
 */
@Service
public class UsuarioServiceImp implements UsuarioService {

@Autowired
private UsuarioRepository repositorio;

@Override
public List<UsuarioModel> getUsuario() {
    List<UsuarioModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private UsuarioModel toModel(UsuarioEntity entity) {
	UsuarioModel model = new UsuarioModel();
	model.setId(entity.getUsuario_id());
	model.setUsuarioDescripcion(entity.getUsuario_desc());
	model.setRol_id(entity.getRol());
	model.setPassword(entity.getPassword());
	model.setFecha_alta(entity.getFecha_alta());
	model.setFecha_baja(entity.getFecha_baja());
	model.setContador(entity.getContador());
	model.setHabilitado(entity.getHabilitado());
	return model;
}

private UsuarioEntity toEntity(UsuarioModel model) {
	UsuarioEntity entity = new UsuarioEntity();
	entity.setUsuario_id(model.getId());
	entity.setUsuario_desc(model.getUsuarioDescripcion());
	return entity;
}
@Override
public UsuarioEntity listarId(int id) {
    Optional<UsuarioEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public UsuarioEntity add(UsuarioModel p) {
	UsuarioEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public UsuarioEntity edit(UsuarioModel p) {
	UsuarioEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public UsuarioEntity delete(int id) {

    Optional<UsuarioEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
