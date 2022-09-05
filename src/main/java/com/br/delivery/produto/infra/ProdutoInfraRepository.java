package com.br.delivery.produto.infra;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.br.delivery.handler.APIException;
import com.br.delivery.produto.application.repository.ProdutoRepository;
import com.br.delivery.produto.domain.Produto;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ProdutoInfraRepository implements ProdutoRepository {

	private final ProdutoSpringDataJpa produtoSpringDataJpa;

	@Override
	public Produto salva(Produto produto) {
		log.info("[inicia] ProdutoInfraRepository - postProduto");
		produtoSpringDataJpa.save(produto);
		log.info("[finaliza] ProdutoInfraRepository - postProduto");
		return produto;
	}

	@Override
	public List<Produto> listaTodosProdutos() {
		log.info("[inicia] ProdutoInfraRepository - listaTodosProdutos");
		List<Produto> produtos = produtoSpringDataJpa.findAll();
		log.info("[finaliza] ProdutoInfraRepository - listaTodosProdutos");
		return produtos;
	}

	@Override
	public Produto detalhaProduto(Integer idProduto) {
		log.info("[inicia] ProdutoInfraRepository - detalhaProduto");
		Produto produto = produtoSpringDataJpa.findById(idProduto)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Produto não encontrado!"));
		log.info("[finaliza] ProdutoInfraRepository - detalhaProduto");
		return produto;
	}

	@Override
	public void deleta(Produto produto) {
		log.info("[inicia] ProdutoInfraRepository - deleta");
		produtoSpringDataJpa.delete(produto);
		log.info("[finaliza] ProdutoInfraRepository - deleta");
		
	}

}
