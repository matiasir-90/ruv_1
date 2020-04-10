/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.PacienteEntity;
import com.ruv.model.PacienteModel;
import com.ruv.repository.PacienteRepository;
import com.ruv.service.PacienteService;

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
public class PacienteServiceImp implements PacienteService {

@Autowired
private PacienteRepository repositorio;

@Override
public List<PacienteModel> getPaciente() {
    List<PacienteModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private PacienteModel toModel(PacienteEntity entity) {
	PacienteModel model = new PacienteModel();
	model.setId(entity.getPaciente_id());
	model.setPaciente_desc(entity.getPaciente_desc());
	model.setDni(entity.getDni());
	model.setFecha_nac(entity.getFecha_nac());
	model.setDireccion(entity.getDireccion());
	model.setCod_postal(entity.getCod_postal());
	model.setLocalidad(entity.getLocalidad());
	return model;
}

private PacienteEntity toEntity(PacienteModel model) {
	PacienteEntity entity = new PacienteEntity();
	entity.setPaciente_id(model.getId());
	entity.setPaciente_desc(model.getPaciente_desc());
	entity.setDni(model.getDni());
	entity.setFecha_nac(model.getFecha_nac());
	entity.setDireccion(model.getDireccion());
	entity.setCod_postal(model.getCod_postal());
	entity.setLocalidad(model.getLocalidad());
	
	return entity;
}
@Override
public PacienteEntity listarId(int id) {
    Optional<PacienteEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public PacienteEntity add(PacienteModel p) {
	PacienteEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public PacienteEntity edit(PacienteModel p) {
	PacienteEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public PacienteEntity delete(int id) {

    Optional<PacienteEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
