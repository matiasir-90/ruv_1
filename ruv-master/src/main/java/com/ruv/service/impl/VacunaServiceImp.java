/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.VacunaEntity;
import com.ruv.model.VacunaModel;
import com.ruv.repository.VacunaRepository;
import com.ruv.service.VacunaService;

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
public class VacunaServiceImp implements VacunaService {

@Autowired
private VacunaRepository repositorio;

@Override
public List<VacunaModel> getVacuna() {
    List<VacunaModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private VacunaModel toModel(VacunaEntity entity) {
	VacunaModel model = new VacunaModel();
	model.setVacuna_id(entity.getVacuna_id());
	model.setVacuna_desc(entity.getVacuna_desc());
	model.setDetalle(entity.getDetalle());
	model.setFormula(entity.getFormula());
	model.setObservaciones(entity.getObservaciones());
	model.setCalendario(entity.getCalendario());
	model.setCampania(entity.getCampania());
	model.setFecha_alta(entity.getFecha_alta());
	model.setFecha_baja(entity.getFecha_baja());
	model.setFecha_ult_mod(entity.getFecha_ult_mod());
	
	return model;
}

private VacunaEntity toEntity(VacunaModel model) {
	VacunaEntity entity = new VacunaEntity();
	entity.setVacuna_id(model.getVacuna_id());
	entity.setVacuna_desc(model.getVacuna_desc());

	return entity;
}
@Override
public VacunaEntity listarId(int id) {
    Optional<VacunaEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public VacunaEntity add(VacunaModel p) {
	VacunaEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public VacunaEntity edit(VacunaModel p) {
	VacunaEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public VacunaEntity delete(int id) {

    Optional<VacunaEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
