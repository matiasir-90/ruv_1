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

import com.ruv.entity.UsuarioEntity;
import com.ruv.model.UsuarioModel;
import com.ruv.service.UsuarioService;

@RestController
@RequestMapping({"/usuario"})

public class UsuarioController {

@Autowired
UsuarioService service;

@GetMapping
public List<UsuarioModel> getUsuario(){
    
    return service.getUsuario();
}
@PostMapping
public UsuarioEntity agregar(@RequestBody UsuarioModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public UsuarioEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public UsuarioEntity editar(@RequestBody UsuarioModel p,@PathVariable("id") int id){
    p.setUsuario_id(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public UsuarioEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}