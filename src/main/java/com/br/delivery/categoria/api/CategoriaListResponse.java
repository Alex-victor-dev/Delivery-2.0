package com.br.delivery.categoria.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.br.delivery.categoria.domain.Categoria;

import lombok.Value;

@Value
public class CategoriaListResponse {

	private UUID idCategoria;
	private String nome;
	
	public static List<CategoriaListResponse> Converte(List<Categoria> categoria) {
		return categoria.stream()
				.map(c -> new CategoriaListResponse(c))
				.collect(Collectors.toList());
				
	}

	public CategoriaListResponse(Categoria categoria) {
		this.idCategoria = categoria.getIdCategoria();
		this.nome = categoria.getNome();
	}
	
}