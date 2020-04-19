/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.CalendarioEntity;
import com.ruv.model.CalendarioModel;
import com.ruv.repository.CalendarioRepository;
import com.ruv.service.CalendarioService;

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
public class CalendarioServiceImp implements CalendarioService{

@Autowired
private CalendarioRepository repositorio;

@Override
public List<CalendarioModel> getCalendario() {
    List<CalendarioModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private CalendarioModel toModel(CalendarioEntity entity) {
	CalendarioModel model = new CalendarioModel();
	model.setCalendario_id(entity.getCalendario_id());
	model.setCalendario_desce(entity.getCalendario_desce());
	model.setFecha_inicio(entity.getFecha_inicio());
	model.setFecha_fin(entity.getFecha_fin());
	return model;
}

private CalendarioEntity toEntity(CalendarioModel model) {
	CalendarioEntity entity = new CalendarioEntity();
	entity.setCalendario_id(model.getCalendario_id());
	entity.setCalendario_desce(model.getCalendario_desce());
	entity.setFecha_inicio(model.getFecha_inicio());
	entity.setFecha_fin(model.getFecha_fin());
	return entity;
}
@Override
public CalendarioModel listarId(int id) {
    Optional<CalendarioEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return toModel(optional.get());
    }
    return null;
}
@Override
public CalendarioEntity add(CalendarioModel p) {
	CalendarioEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public CalendarioEntity edit(CalendarioModel p) {
	CalendarioEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public CalendarioEntity delete(int id) {

    Optional<CalendarioEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
