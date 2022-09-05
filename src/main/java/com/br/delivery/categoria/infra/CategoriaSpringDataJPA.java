package com.br.delivery.categoria.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.delivery.categoria.domain.Categoria;

public interface CategoriaSpringDataJPA extends JpaRepository<Categoria, Integer>{
}