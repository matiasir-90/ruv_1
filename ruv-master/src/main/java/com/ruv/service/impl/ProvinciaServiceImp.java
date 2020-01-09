/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.ProvinciaEntity;
import com.ruv.model.ProvinciaModel;
import com.ruv.repository.ProvinciaRepository;
import com.ruv.service.ProvinciaService;

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
public class ProvinciaServiceImp implements ProvinciaService {

@Autowired
private ProvinciaRepository repositorio;

@Override
public List<ProvinciaModel> getProvincia() {
    List<ProvinciaModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private ProvinciaModel toModel(ProvinciaEntity entity) {
	ProvinciaModel model = new ProvinciaModel();
	model.setId(entity.getProvincia_id());
	model.setProvinciaDescripcion(entity.getProvincia_desc());
	model.setPais_id(entity.getPais());
	return model;
}

private ProvinciaEntity toEntity(ProvinciaModel model) {
	ProvinciaEntity entity = new ProvinciaEntity();
	entity.setProvincia_id(model.getId());
	entity.setProvincia_desc(model.getProvinciaDescripcion());
	return entity;
}
@Override
public ProvinciaEntity listarId(int id) {
    Optional<ProvinciaEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public ProvinciaEntity add(ProvinciaModel p) {
	ProvinciaEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public ProvinciaEntity edit(ProvinciaModel p) {
	ProvinciaEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public ProvinciaEntity delete(int id) {

    Optional<ProvinciaEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
