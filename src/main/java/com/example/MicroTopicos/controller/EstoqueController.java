package com.example.MicroTopicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MicroTopicos.model.Estoque;
import com.example.MicroTopicos.repository.EstoqueRepository;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

	@Autowired
	private EstoqueRepository estoqueRepository;

	@GetMapping
	public List<Estoque> getAll () {
		return estoqueRepository.findAll();
	}
	
	@PostMapping
	public Estoque store (Estoque estoque) {
		return estoqueRepository.save(estoque);
	}
}
