package com.vigjoaopaulo.investimento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.investimento.modal.Carro;
import com.vigjoaopaulo.investimento.repository.CarroRepository;

@RestController
public class CarroController {
		
	@Autowired
	private CarroRepository _carRep;
	
	
	@GetMapping("/carro")
	public List<Carro> get(){
		return _carRep.findAll();
	}
}
