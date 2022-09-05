package com.br.delivery.categoria.service;

import java.util.List;

import com.br.delivery.categoria.api.CategoriaListResponse;
import com.br.delivery.categoria.api.CategoriaRequest;
import com.br.delivery.categoria.api.CategoriaResponse;

public interface CategoriaService {

	CategoriaResponse CriaCategoria(CategoriaRequest categoriaRequest);

	List<CategoriaListResponse> BuscaTodosCategorias();

	CategoriaListResponse BuscaPorID(Integer idCategoria);

	void DeletaCategoria(Integer idCategoria);



	

}