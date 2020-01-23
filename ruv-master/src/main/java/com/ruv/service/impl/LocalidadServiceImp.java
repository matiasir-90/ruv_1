/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.LocalidadEntity;
import com.ruv.model.LocalidadModel;
import com.ruv.repository.LocalidadRepository;
import com.ruv.service.LocalidadService;

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
public class LocalidadServiceImp implements LocalidadService {

@Autowired
private LocalidadRepository repositorio;

@Override
public List<LocalidadModel> getLocalidad() {
    List<LocalidadModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private LocalidadModel toModel(LocalidadEntity entity) {
	LocalidadModel model = new LocalidadModel();
	model.setId(entity.getLocalidad_id());
	model.setLocalidadDescripcion(entity.getLocalidad_desc());
	model.setProvincia(entity.getProvincia());
	return model;
}

private LocalidadEntity toEntity(LocalidadModel model) {
	LocalidadEntity entity = new LocalidadEntity();
	entity.setLocalidad_id(model.getId());
	entity.setLocalidad_desc(model.getLocalidadDescripcion());
	entity.setProvincia(model.getProvincia());
	return entity;
}
@Override
public LocalidadEntity listarId(int id) {
    Optional<LocalidadEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public LocalidadEntity add(LocalidadModel p) {
	LocalidadEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public LocalidadEntity edit(LocalidadModel p) {
	LocalidadEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public LocalidadEntity delete(int id) {

    Optional<LocalidadEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
