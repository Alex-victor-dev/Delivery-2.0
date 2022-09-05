package com.br.delivery.produto.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import com.br.delivery.produto.application.service.ProdutoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ProdutoController implements ProdutoAPI {

	private final ProdutoService produtoService;

	@Override
	public ProdutoResponse postProduto(ProdutoRequest produtoRequest) {
		log.info("[inicia] ProdutoController - postProduto");
		ProdutoResponse produto = produtoService.postProduto(produtoRequest);
		log.info("[finaliza] ProdutoController - postProduto");
		return produto;
	}

	@Override
	public List<ProdutoListResponse> ListaTodosProdutos() {
		log.info("[inicia] ProdutoController - postProduto");
		List<ProdutoListResponse> produtos = produtoService.listaTodosProdutos();
		log.info("[finaliza] ProdutoController - postProduto");
		return produtos;
	}

	@Override
	public ProdutoDetalhado detalhaProdutoPorId(Integer idProduto) {
		ProdutoDetalhado produto = produtoService.detalhaProdutoPorId(idProduto);
		return produto;
	}

	@Override
	public void atualiizaProduto(Integer idProduto, @Valid ProdutoAlteracaoRequest produtoAlteracaoRequest) {
		log.info("[inicia] ProdutoController - atualiizaProduto");
		produtoService.atualizaProduto(idProduto, produtoAlteracaoRequest);
		log.info("[finaliza] ProdutoController - atualiizaProduto");
	
		
	}

	@Override
	public void deleta(Integer idProduto) {
		log.info("[inicia] ProdutoController - deleta");
		produtoService.deleta(idProduto);
		log.info("[finaliza] ProdutoController - deleta");
		
	}

}
