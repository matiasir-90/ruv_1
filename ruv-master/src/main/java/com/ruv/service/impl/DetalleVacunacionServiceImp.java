/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.DetalleVacunacionEntity;
import com.ruv.model.DetalleVacunacionModel;
import com.ruv.repository.DetalleVacunacionRepository;
import com.ruv.service.DetalleVacunacionService;

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
public class DetalleVacunacionServiceImp implements DetalleVacunacionService {

@Autowired
private DetalleVacunacionRepository repositorio;

@Override
public List<DetalleVacunacionModel> getDetalleVacunacion() {
    List<DetalleVacunacionModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private DetalleVacunacionModel toModel(DetalleVacunacionEntity entity) {
	DetalleVacunacionModel model = new DetalleVacunacionModel();
	model.setDet_vac_id(entity.getDet_vac_id());
	model.setPaciente_id(entity.getPaciente_id());
	model.setVacuna_id(entity.getVacuna_id());
	model.setCalendario_id(entity.getCalendario_id());
	model.setFecha_aplicacion(entity.getFecha_aplicacion());
	model.setCampania_id(entity.getCampania_id());
	model.setUsuario_id(entity.getUsuario_id());
	return model;
}

private DetalleVacunacionEntity toEntity(DetalleVacunacionModel model) {
	DetalleVacunacionEntity entity = new DetalleVacunacionEntity();
	entity.setDet_vac_id(model.getDet_vac_id());
	entity.setPaciente_id(model.getPaciente_id());
	entity.setVacuna_id(model.getVacuna_id());
	entity.setCalendario_id(model.getCalendario_id());
	entity.setFecha_aplicacion(entity.getFecha_aplicacion());
	entity.setCampania_id(model.getCampania_id());
	entity.setUsuario_id(model.getUsuario_id());
	return entity;
}
@Override
public DetalleVacunacionEntity listarId(int id) {
    Optional<DetalleVacunacionEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public DetalleVacunacionEntity add(DetalleVacunacionModel p) {
	DetalleVacunacionEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public DetalleVacunacionEntity edit(DetalleVacunacionModel p) {
	DetalleVacunacionEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public DetalleVacunacionEntity delete(int id) {

    Optional<DetalleVacunacionEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
