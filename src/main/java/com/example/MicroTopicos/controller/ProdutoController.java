package com.example.MicroTopicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MicroTopicos.model.Produto;
import com.example.MicroTopicos.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> getAll () {
		return produtoRepository.findAll();
	}
	
	@PostMapping
	public Produto store (Produto produto) {
		return produtoRepository.save(produto);
	}
}
