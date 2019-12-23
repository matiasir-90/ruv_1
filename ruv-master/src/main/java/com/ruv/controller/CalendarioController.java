package com.ruv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruv.entity.CalendarioEntity;
import com.ruv.service.CalendarioService;

@RestController
@RequestMapping({"/listar"})

public class CalendarioController {



@Autowired
CalendarioService service;

@GetMapping
public List<CalendarioEntity>listar(){
    
    return service.getCalendario();
}
}