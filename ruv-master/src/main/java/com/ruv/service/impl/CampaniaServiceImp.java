package com.ruv.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruv.entity.CampaniaEntity;
import com.ruv.model.CampaniaModel;
import com.ruv.repository.CampaniaRepository;
import com.ruv.service.CampaniaService;


/**
 *
 * @author matias
 *
 */
@Service
public class CampaniaServiceImp implements CampaniaService{

@Autowired
private CampaniaRepository repositorio;

@Override
public List<CampaniaModel> getCalendario() {
    List<CampaniaModel> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(toModel(obj)));
    return listaDao;
}

private CampaniaModel toModel(CampaniaEntity entity) {
	CampaniaModel model = new CampaniaModel();
	model.setId(entity.getCampania_id());
	model.setCampaniaDescripcion(entity.getCampania_desce());
	model.setFechaAlta(entity.getFecha_alta());
	model.setFechaBaja(entity.getFecha_baja());
	return model;
}

private CampaniaEntity toEntity(CampaniaModel model) {
	CampaniaEntity entity = new CampaniaEntity();
	entity.setCampania_id(model.getId());
	entity.setCampania_desce(model.getCampaniaDescripcion());
	entity.setFecha_alta(model.getFechaAlta());
	entity.setFecha_baja(model.getFechaBaja());
	return entity;
}
@Override
public CampaniaEntity listarId(int id) {
    Optional<CampaniaEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        return optional.get();
    }
    return null;
}
@Override
public CampaniaEntity add(CampaniaModel p) {
	CampaniaEntity entity = toEntity(p);
    return repositorio.save(entity);
}
@Override
public CampaniaEntity edit(CampaniaModel p) {
	CampaniaEntity entity = toEntity(p);
    return repositorio.save(entity);    }

@Override
public CampaniaEntity delete(int id) {

    Optional<CampaniaEntity> optional = repositorio.findById(id);
    if (optional.isPresent()){
        repositorio.delete(optional.get());
        return (optional.get());
    }
    return null;
}
}
