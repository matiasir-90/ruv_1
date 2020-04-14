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

import com.ruv.entity.ProvinciaEntity;
import com.ruv.model.ProvinciaModel;
import com.ruv.service.ProvinciaService;

@RestController
@RequestMapping({"/provincia"})

public class ProvinciaController {

@Autowired
ProvinciaService service;

@GetMapping
public List<ProvinciaModel> getProvincia(){
    
    return service.getProvincia();
}
@PostMapping
public ProvinciaEntity agregar(@RequestBody ProvinciaModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public ProvinciaEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public ProvinciaEntity editar(@RequestBody ProvinciaModel p,@PathVariable("id") int id){
    p.setProvincia_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public ProvinciaEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}