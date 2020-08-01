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

import com.ruv.entity.RolEntity;
import com.ruv.model.RolModel;
import com.ruv.service.RolService;

@RestController
@RequestMapping({"/rol"})

public class RolController {

@Autowired
RolService service;

@GetMapping
public List<RolModel> getRol(){
    
    return service.getRol();
}
@PostMapping
public RolEntity agregar(@RequestBody RolModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public RolEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public RolEntity editar(@RequestBody RolModel p,@PathVariable("id") int id){
    p.setRol_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public RolEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}