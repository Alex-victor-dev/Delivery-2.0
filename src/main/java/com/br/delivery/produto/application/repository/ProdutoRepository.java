package com.br.delivery.produto.application.repository;

import java.util.List;
import java.util.UUID;

import com.br.delivery.produto.domain.Produto;

public interface ProdutoRepository {


	Produto salva(Produto produto);

	List<Produto> listaTodosProdutos();

	Produto detalhaProduto(UUID idProduto);

	void deleta(Produto produto);

	

}
