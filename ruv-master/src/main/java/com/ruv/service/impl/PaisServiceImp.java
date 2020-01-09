/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.PaisEntity;
import com.ruv.model.PaisModel;
import com.ruv.repository.PaisRepository;
import com.ruv.service.PaisService;

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
public class PaisServiceImp implements PaisService {

@Autowired
private PaisRepository repositorio;

@Override
public List<PaisModel> getPais() {
    List<PaisModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private PaisModel toModel(PaisEntity entity) {
	PaisModel model = new PaisModel();
	model.setId(entity.getPais_id());
	model.setPaisDescripcion(entity.getPais_desc());
	return model;
}

private PaisEntity toEntity(PaisModel model) {
	PaisEntity entity = new PaisEntity();
	entity.setPais_id(model.getId());
	entity.setPais_desc(model.getPaisDescripcion());
	return entity;
}
@Override
public PaisEntity listarId(int id) {
    Optional<PaisEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public PaisEntity add(PaisModel p) {
	PaisEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public PaisEntity edit(PaisModel p) {
	PaisEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public PaisEntity delete(int id) {

    Optional<PaisEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
