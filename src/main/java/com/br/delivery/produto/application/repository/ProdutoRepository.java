package com.br.delivery.produto.application.repository;

import java.util.List;

import com.br.delivery.produto.domain.Produto;

public interface ProdutoRepository {


	Produto salva(Produto produto);

	List<Produto> listaTodosProdutos();

	Produto detalhaProduto(Integer idProduto);

	void deleta(Produto produto);

	

}
