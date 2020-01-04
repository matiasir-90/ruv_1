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

import com.ruv.entity.CalendarioEntity;
import com.ruv.service.CalendarioService;

@RestController
@RequestMapping({"/calendario"})

public class CalendarioController {

@Autowired
CalendarioService servicec;

@GetMapping
public List<CalendarioEntity>getcalendario(){
    
    return servicec.getCalendario();
}
@PostMapping
public CalendarioEntity agregarC(@RequestBody CalendarioEntity p){
    return servicec.add(p);
}
@GetMapping(path = {"/{id}"})
public CalendarioEntity listarId(@PathVariable("id")int id){
    return servicec.listarId(id);
}
@PutMapping(path = {"/{id}"})
public CalendarioEntity editar(@RequestBody CalendarioEntity p,@PathVariable("id") int id){
    p.setCalendario_id(id);
    return servicec.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public CalendarioEntity delete(@PathVariable("id") int  id){
    return servicec.delete(id);
}

}