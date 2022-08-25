package com.example.MicroTopicos.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="estoque")
public class Estoque {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name="produto_id", nullable=false)
    private Produto produto;
	// private Long produto_id;
	
	@NotBlank
	private String label;
	
	@NotBlank
	private int quantidade;
	
	@NotBlank
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate data_criacao;
	
	@NotBlank
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate data_atualizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Long produto_id) {
		this.produto_id = produto_id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(LocalDate data_criacao) {
		this.data_criacao = data_criacao;
	}

	public LocalDate getData_atualizacao() {
		return data_atualizacao;
	}

	public void setData_atualizacao(LocalDate data_atualizacao) {
		this.data_atualizacao = data_atualizacao;
	}

	
}
