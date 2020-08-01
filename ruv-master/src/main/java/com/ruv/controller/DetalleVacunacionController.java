package com.ruv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruv.entity.DetalleVacunacionEntity;
import com.ruv.model.DetalleVacunacionModel;
import com.ruv.service.DetalleVacunacionService;

@RestController
@RequestMapping({"/detalle_vacunacion"})

public class DetalleVacunacionController {

@Autowired
DetalleVacunacionService service;

@GetMapping
public List<DetalleVacunacionModel> getDetalleVacunacion(){
    
    return service.getDetalleVacunacion();
}
@PostMapping
public DetalleVacunacionEntity agregar(@RequestBody DetalleVacunacionModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public DetalleVacunacionEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public DetalleVacunacionEntity editar(@RequestBody DetalleVacunacionModel p,@PathVariable("id") int id){
    p.setDet_vac_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public DetalleVacunacionEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}