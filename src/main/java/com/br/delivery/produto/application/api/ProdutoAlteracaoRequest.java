package com.br.delivery.produto.application.api;

import javax.validation.constraints.NotBlank;

import lombok.Value;

@Value
public class ProdutoAlteracaoRequest {
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	private Double preço;
	@NotBlank
	private String imgUrl;
	
}
