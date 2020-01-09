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

import com.ruv.entity.LocalidadEntity;
import com.ruv.model.LocalidadModel;
import com.ruv.service.LocalidadService;

@RestController
@RequestMapping({"/localidad"})

public class LocalidadController {

@Autowired
LocalidadService service;

@GetMapping
public List<LocalidadModel> getLocalidad(){
    
    return service.getLocalidad();
}
@PostMapping
public LocalidadEntity agregar(@RequestBody LocalidadModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public LocalidadEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public LocalidadEntity editar(@RequestBody LocalidadModel p,@PathVariable("id") int id){
    p.setId(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public LocalidadEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}