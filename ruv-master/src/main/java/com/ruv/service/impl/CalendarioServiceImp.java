/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.service.impl;

import com.ruv.entity.CalendarioEntity;
import com.ruv.service.CalendarioService;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author matias
 */
public class CalendarioServiceImp  implements CalendarioService {
    private List<CalendarioEntity> calendarios = null;

    public CalendarioServiceImp() {
        calendarios = new LinkedList<CalendarioEntity>();
            
}

    @Override
    public List<CalendarioEntity> getCalendario() {
     return calendarios;
    }
}
