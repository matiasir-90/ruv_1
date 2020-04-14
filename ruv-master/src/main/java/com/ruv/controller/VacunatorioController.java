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

import com.ruv.entity.VacunatorioEntity;
import com.ruv.model.VacunatorioModel;
import com.ruv.service.VacunatorioService;

@RestController
@RequestMapping({"/vacunatorio"})

public class VacunatorioController {

@Autowired
VacunatorioService service;

@GetMapping
public List<VacunatorioModel> getVacunatorio(){
    
    return service.getVacunatorio();
}
@PostMapping
public VacunatorioEntity agregar(@RequestBody VacunatorioModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public VacunatorioEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public VacunatorioEntity editar(@RequestBody VacunatorioModel p,@PathVariable("id") int id){
    p.setVacunatorio_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public VacunatorioEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}