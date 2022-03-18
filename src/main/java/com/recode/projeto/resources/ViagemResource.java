package com.recode.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.projeto.entities.Viagem;
import com.recode.projeto.services.ViagemService;

@RestController
@RequestMapping("/viagem")
public class ViagemResource {
	
	@Autowired
	private ViagemService service;

	@GetMapping
	public List<Viagem> findAll() {
		return service.findAll();
	}
}
