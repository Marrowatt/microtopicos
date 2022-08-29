package com.example.MicroTopicos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	List<Produto> getAll () {
		return produtoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	Optional<Produto> getOne (@PathVariable Long id) {
		return produtoRepository.findById(id);
	}
	
	@PostMapping
	Produto store (@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
}
