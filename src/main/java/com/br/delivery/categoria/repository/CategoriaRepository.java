package com.br.delivery.categoria.repository;

import java.util.List;

import com.br.delivery.categoria.domain.Categoria;

public interface CategoriaRepository {

	Categoria Salva(Categoria categoria);

	List<Categoria> BuscaTodasCategorias();

	
	Categoria BuscaCategoriaPorId(Integer idCategoria);

	void DeletaCategoria(Categoria categoria);

}