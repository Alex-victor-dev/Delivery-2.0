package com.br.delivery.produto.application.api;

import lombok.Builder;
import lombok.Value;
	
@Value
@Builder
public class ProdutoResponse {

	private Integer idProduto;
	private String nome;
	private String nomeCategoria;
}
