package com.ruv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruv.entity.CalendarioEntity;
import com.ruv.model.CalendarioModel;
import com.ruv.service.CalendarioService;

@CrossOrigin(origins = "http://localhost:9876",maxAge=3600)
@RestController
@RequestMapping({"/calendario"})

public class CalendarioController {

@Autowired
CalendarioService service;

@GetMapping
public List<CalendarioModel> getcalendario(){
    
    return service.getCalendario();
}
@PostMapping
public CalendarioEntity agregarC(@RequestBody CalendarioModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public CalendarioModel listarId(@PathVariable("id")int id){

    System.out.println(service.listarId(id));
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public CalendarioEntity editar(@RequestBody CalendarioModel p,@PathVariable("id") int id){
	
    p.setCalendario_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public CalendarioEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}


}