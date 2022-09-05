package com.br.delivery.produto.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.br.delivery.produto.domain.Produto;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class ProdutoListResponse {
	

	
	private UUID idProduto;
	private String nome;
	private String descricao;
	private Double preço;
	
	

	public static List<ProdutoListResponse> converte(List<Produto> produto) {

		return produto.stream()
				.map(ProdutoListResponse::new)
				.collect(Collectors.toList());
	}

	public ProdutoListResponse(Produto produto) {
		
		this.idProduto = produto.getIdProduto();
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.preço = produto.getPreço();
	}

}
