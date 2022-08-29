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

import com.example.MicroTopicos.model.Estoque;
import com.example.MicroTopicos.model.Produto;
import com.example.MicroTopicos.repository.EstoqueRepository;
import com.example.MicroTopicos.repository.ProdutoRepository;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Autowired
	private ProdutoRepository prod;

	@GetMapping
	List<Estoque> getAll () {
		return estoqueRepository.findAll();
	}
	
	@GetMapping("/{id}")
	Optional<Estoque> getOne (@PathVariable Long id) {
		return estoqueRepository.findById(id);
	}

	@GetMapping("/produto/{id}")
	List<Estoque> getAllByProduct (@PathVariable Long id) {
		return estoqueRepository.findByProduto(id);
	}
	
	@PostMapping
	Estoque store (@RequestBody Estoque estoque) {
		
		estoque = estoqueRepository.save(estoque);
		
		Optional<Produto> p = prod.findById(estoque.getProduto().getId());
		
		System.out.println(p.get().getDescricao());

		int quantidade = estoque.getLabel().equals("SAI") ?
				p.get().getQuantidade() - estoque.getQuantidade() :
				p.get().getQuantidade() + estoque.getQuantidade();

		p.get().setQuantidade(quantidade);
		
		prod.save(p.get());
		
		return estoque;
	}
}
