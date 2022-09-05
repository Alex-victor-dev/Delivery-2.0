package com.br.delivery.produto.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.br.delivery.categoria.domain.Categoria;
import com.br.delivery.categoria.repository.CategoriaRepository;
import com.br.delivery.produto.application.api.ProdutoAlteracaoRequest;
import com.br.delivery.produto.application.api.ProdutoDetalhado;
import com.br.delivery.produto.application.api.ProdutoListResponse;
import com.br.delivery.produto.application.api.ProdutoRequest;
import com.br.delivery.produto.application.api.ProdutoResponse;
import com.br.delivery.produto.application.repository.ProdutoRepository;
import com.br.delivery.produto.domain.Produto;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProdutoApplicationService implements ProdutoService {

	private final ProdutoRepository produtoRepository;
	private final CategoriaRepository categoriaRepository;

	@Override
	public ProdutoResponse postProduto(@Valid ProdutoRequest produtoRequest) {
		log.info("[inicia] ProdutoApplicationService - postProduto");
		Categoria categoria = categoriaRepository.BuscaCategoriaPorId(produtoRequest.getIdCategoria()) ;
		Produto produto = produtoRepository.salva(new Produto(produtoRequest));
		log.info("[finaliza] ProdutoApplicationService - postProduto");
		return ProdutoResponse.builder()
				.idProduto(produto.getIdProduto())
				.nome(produto.getNome())
				.nomeCategoria(categoria.getNome())
				.build();
	}

	@Override
	public List<ProdutoListResponse> listaTodosProdutos() {
		log.info("[inicia] UsuarioApplicationService - buscaTodosProdutos");
		List<Produto> produto = produtoRepository.listaTodosProdutos();
		log.info("[finaliza] UsuarioApplicationService - buscaTodosProdutos");
		return ProdutoListResponse.converte(produto);
	}

	@Override
	public ProdutoDetalhado detalhaProdutoPorId(UUID idProduto) {
		log.info("[inicia] UsuarioApplicationService - detalhaProdutoPorId");
		Produto produto = produtoRepository.detalhaProduto(idProduto);
		log.info("[finaliza] UsuarioApplicationService - detalhaProdutoPorId");
		return new ProdutoDetalhado(produto);
	}

	@Override
	public void atualizaProduto(UUID idProduto, @Valid ProdutoAlteracaoRequest produtoAlteracaoRequest) {

		Produto produto = produtoRepository.detalhaProduto(idProduto);
		produto.atualizaProduto(produtoAlteracaoRequest);
		produtoRepository.salva(produto);
	}

	@Override
	public void deleta(UUID idProduto) {
		log.info("[inicia] UsuarioApplicationService - deleta");
		Produto produto = produtoRepository.detalhaProduto(idProduto);
		produtoRepository.deleta(produto);

	}

}
