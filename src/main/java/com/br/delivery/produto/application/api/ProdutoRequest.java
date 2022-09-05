package com.br.delivery.produto.application.api;

import java.util.UUID;

import lombok.Value;

@Value

public class ProdutoRequest {

	private String nome;
	private String descricao;
	private Double preço;
	private UUID idCategoria;
}
