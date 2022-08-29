package com.example.MicroTopicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MicroTopicos.model.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

	@Query("SELECT est FROM Estoque est WHERE produto_id = :id")
	List<Estoque> findByProduto(@Param("id") Long id);
	
}
