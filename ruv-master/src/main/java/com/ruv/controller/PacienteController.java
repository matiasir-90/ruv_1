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

import com.ruv.entity.PacienteEntity;
import com.ruv.model.PacienteModel;
import com.ruv.service.PacienteService;

@RestController
@RequestMapping({"/paciente"})

public class PacienteController {

@Autowired
PacienteService service;

@GetMapping
public List<PacienteModel> getPaciente(){
    
    return service.getPaciente();
}
@PostMapping
public PacienteEntity agregar(@RequestBody PacienteModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public PacienteEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public PacienteEntity editar(@RequestBody PacienteModel p,@PathVariable("id") int id){
    p.setPaciente_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public PacienteEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}