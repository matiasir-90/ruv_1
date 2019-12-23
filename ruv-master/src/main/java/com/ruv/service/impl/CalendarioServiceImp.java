/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.CalendarioEntity;
import com.ruv.repository.CalendarioRepository;
import com.ruv.service.CalendarioService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matias
 *
 */
@Service
public class CalendarioServiceImp implements CalendarioService{

@Autowired
private CalendarioRepository repositorio;

@Override
public List<CalendarioEntity> getCalendario() {
    List<CalendarioEntity> listaDao = new ArrayList<>();
    repositorio.findAll().forEach(obj -> listaDao.add(obj));
    return listaDao;
}
}
