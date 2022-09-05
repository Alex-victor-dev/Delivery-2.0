package com.br.delivery.categoria.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CategoriaResponse {
	
	private Integer idCategoria;
	private String nome;
	
}