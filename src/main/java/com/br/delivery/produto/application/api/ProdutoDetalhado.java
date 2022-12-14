package com.br.delivery.produto.application.api;

import java.util.UUID;

import com.br.delivery.produto.domain.Produto;

import lombok.Value;

@Value
public class ProdutoDetalhado {
	private UUID idProduto;
	private String nome;
	private String descricao;
	private Double preço;
	private String imgUrl;

	public ProdutoDetalhado(Produto produto) {
		this.idProduto = produto.getIdProduto();
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.preço = produto.getPreço();
		this.imgUrl = produto.getImgUrl();
	}

}
