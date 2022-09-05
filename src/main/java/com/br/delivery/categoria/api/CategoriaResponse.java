package com.br.delivery.categoria.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CategoriaResponse {
	
	private UUID idCategoria;
	private String nome;
	
}