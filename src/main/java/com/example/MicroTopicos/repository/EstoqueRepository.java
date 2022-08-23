package com.example.MicroTopicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MicroTopicos.model.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

}
