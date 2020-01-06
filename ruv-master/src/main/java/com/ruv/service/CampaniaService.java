package com.ruv.service;

import java.util.List;

import com.ruv.entity.CampaniaEntity;
import com.ruv.model.CampaniaModel;

public interface CampaniaService {

	/**
	 *
	 * @author matias
	 */
	   

		List<CampaniaModel> getCalendario();
		CampaniaEntity add(CampaniaModel p);
		CampaniaEntity listarId(int id);
		CampaniaEntity edit(CampaniaModel p);
		CampaniaEntity delete(int id);
	}

