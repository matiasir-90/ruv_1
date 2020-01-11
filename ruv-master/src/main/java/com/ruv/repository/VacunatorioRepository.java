/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.repository;

import com.ruv.entity.VacunatorioEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matias
 */

public interface VacunatorioRepository extends CrudRepository<VacunatorioEntity, Integer> {
	
}