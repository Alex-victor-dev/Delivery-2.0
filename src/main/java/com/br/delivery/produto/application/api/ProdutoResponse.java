package com.br.delivery.produto.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
	
@Value
@Builder
public class ProdutoResponse {

	private UUID idProduto;
	private String nome;

}
