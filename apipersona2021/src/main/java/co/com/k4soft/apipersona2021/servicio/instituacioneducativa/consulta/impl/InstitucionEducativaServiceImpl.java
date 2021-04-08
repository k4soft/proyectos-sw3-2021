package co.com.k4soft.apipersona2021.servicio.instituacioneducativa.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.k4soft.apipersona2021.model.InstitucionEducativa;
import co.com.k4soft.apipersona2021.repository.InstitucionEducativaRepository;
import co.com.k4soft.apipersona2021.servicio.instituacioneducativa.consulta.InstitucionEducativaService;

@Service
public class InstitucionEducativaServiceImpl implements InstitucionEducativaService{
	
	@Autowired
	private InstitucionEducativaRepository institucionEducativaRepository;

	@Override
	public Iterable<InstitucionEducativa> findAll() {
		return institucionEducativaRepository.findAll();
	}

}
