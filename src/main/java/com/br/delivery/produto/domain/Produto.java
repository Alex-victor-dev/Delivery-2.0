package com.br.delivery.produto.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.br.delivery.produto.application.api.ProdutoAlteracaoRequest;
import com.br.delivery.produto.application.api.ProdutoRequest;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idProduto", updatable = false, unique = true, nullable = false)
	private UUID idProduto;
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	@NotNull
	private Double preço;
	private String imgUrl;

	public Produto(@Valid ProdutoRequest produtoRequest) {
		this.nome = produtoRequest.getNome();
		this.descricao = produtoRequest.getDescricao();
		this.preço = produtoRequest.getPreço();
		this.imgUrl = produtoRequest.getImgUrl();

	}

	public void atualizaProduto(@Valid ProdutoAlteracaoRequest produtoAltera) {

		this.nome = produtoAltera.getNome();
		this.descricao = produtoAltera.getDescricao();
		this.preço = produtoAltera.getPreço();
		this.imgUrl = produtoAltera.getImgUrl();

	}
}
