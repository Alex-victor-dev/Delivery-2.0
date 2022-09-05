package com.br.delivery.produto.application.api;

import com.br.delivery.produto.domain.Produto;

import lombok.Value;

@Value
public class ProdutoDetalhado {
	private Integer idProduto;
	private String nome;
	private String descricao;
	private Double preço;
	private String nomeCategoria;

	public ProdutoDetalhado(Produto produto) {
		this.nomeCategoria = "";
		this.idProduto = produto.getIdProduto();
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.preço = produto.getPreço();
	}

}
