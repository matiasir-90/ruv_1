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

import com.ruv.entity.PaisEntity;
import com.ruv.model.PaisModel;
import com.ruv.service.PaisService;

@RestController
@RequestMapping({"/pais"})

public class PaisController {

@Autowired
PaisService service;

@GetMapping
public List<PaisModel> getPais(){
    
    return service.getPais();
}
@PostMapping
public PaisEntity agregar(@RequestBody PaisModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public PaisEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public PaisEntity editar(@RequestBody PaisModel p,@PathVariable("id") int id){
    p.setPais_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public PaisEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}