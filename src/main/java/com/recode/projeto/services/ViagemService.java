package com.recode.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.projeto.entities.Viagem;
import com.recode.projeto.repositories.ViagemRepository;

@Service
public class ViagemService {
	
	@Autowired
	private ViagemRepository repository;
	
	@Transactional(readOnly = true)
	public List<Viagem> findAll() {
		List<Viagem> resultado = repository.findAll();
		return resultado;
	}
}

