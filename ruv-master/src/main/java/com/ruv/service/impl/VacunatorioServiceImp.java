/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.VacunatorioEntity;
import com.ruv.model.VacunatorioModel;
import com.ruv.repository.VacunatorioRepository;
import com.ruv.service.VacunatorioService;

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
public class VacunatorioServiceImp implements VacunatorioService {

@Autowired
private VacunatorioRepository repositorio;

@Override
public List<VacunatorioModel> getVacunatorio() {
    List<VacunatorioModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private VacunatorioModel toModel(VacunatorioEntity entity) {
	VacunatorioModel model = new VacunatorioModel();
	model.setId(entity.getVacunatorio_id());
	model.setVacunatorio_desc(entity.getVacunatorio_desc());
	model.setDireccion(entity.getDireccion());
	model.setCod_postal(entity.getCod_postal());
	model.setLocalidad(entity.getLocalidad());
	return model;
}

private VacunatorioEntity toEntity(VacunatorioModel model) {
	VacunatorioEntity entity = new VacunatorioEntity();
	entity.setVacunatorio_id(model.getId());
	entity.setVacunatorio_desc(model.getVacunatorio_desc());
	entity.setDireccion(model.getDireccion());
	entity.setCod_postal(model.getCod_postal());
	entity.setLocalidad(model.getLocalidad());
	
	return entity;
}
@Override
public VacunatorioEntity listarId(int id) {
    Optional<VacunatorioEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public VacunatorioEntity add(VacunatorioModel p) {
	VacunatorioEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public VacunatorioEntity edit(VacunatorioModel p) {
	VacunatorioEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public VacunatorioEntity delete(int id) {

    Optional<VacunatorioEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
