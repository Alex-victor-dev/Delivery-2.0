package com.br.delivery.produto.application.service;

import java.util.List;

import javax.validation.Valid;

import com.br.delivery.produto.application.api.ProdutoAlteracaoRequest;
import com.br.delivery.produto.application.api.ProdutoDetalhado;
import com.br.delivery.produto.application.api.ProdutoListResponse;
import com.br.delivery.produto.application.api.ProdutoRequest;
import com.br.delivery.produto.application.api.ProdutoResponse;

public interface ProdutoService {

	ProdutoResponse postProduto(@Valid ProdutoRequest produtoRequest);

	List<ProdutoListResponse> listaTodosProdutos();

	ProdutoDetalhado detalhaProdutoPorId(Integer idProduto);

	void atualizaProduto(Integer idProduto, @Valid ProdutoAlteracaoRequest produtoAlteracaoRequest);

	void deleta(Integer idProduto);

}
