package com.br.delivery.produto.application.api;

import lombok.Value;

@Value

public class ProdutoRequest {

	private String nome;
	private String descricao;
	private Double preço;
	private String imgUrl;
}
