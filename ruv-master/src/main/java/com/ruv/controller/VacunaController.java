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

import com.ruv.entity.VacunaEntity;
import com.ruv.model.VacunaModel;
import com.ruv.service.VacunaService;

@RestController
@RequestMapping({"/vacuna"})

public class VacunaController {

@Autowired
VacunaService service;

@GetMapping
public List<VacunaModel> getVacuna(){
    
    return service.getVacuna();
}
@PostMapping
public VacunaEntity agregar(@RequestBody VacunaModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public VacunaEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public VacunaEntity editar(@RequestBody VacunaModel p,@PathVariable("id") int id){
    p.setVacuna_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public VacunaEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}