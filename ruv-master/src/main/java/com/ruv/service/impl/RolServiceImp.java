/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.RolEntity;
import com.ruv.model.RolModel;
import com.ruv.repository.RolRepository;
import com.ruv.service.RolService;

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
public class RolServiceImp implements RolService {

@Autowired
private RolRepository repositorio;

@Override
public List<RolModel> getRol() {
    List<RolModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private RolModel toModel(RolEntity entity) {
	RolModel model = new RolModel();
	model.setRol_id(entity.getRol_id());
	model.setRolDescripcion(entity.getRol_desc());
	return model;
}

private RolEntity toEntity(RolModel model) {
	RolEntity entity = new RolEntity();
	entity.setRol_id(model.getRol_id());
	entity.setRol_desc(model.getRolDescripcion());
	return entity;
}
@Override
public RolEntity listarId(int id) {
    Optional<RolEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public RolEntity add(RolModel p) {
	RolEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public RolEntity edit(RolModel p) {
	RolEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public RolEntity delete(int id) {

    Optional<RolEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
