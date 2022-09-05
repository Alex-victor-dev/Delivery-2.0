package com.br.delivery.produto.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public interface ProdutoAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ProdutoResponse postProduto(@Valid @RequestBody ProdutoRequest produtoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ProdutoListResponse> ListaTodosProdutos();

	@GetMapping(value = "/{idProduto}")
	@ResponseStatus(code = HttpStatus.OK)
	ProdutoDetalhado detalhaProdutoPorId(@PathVariable Integer idProduto);

	@PatchMapping(value = "/{idProduto}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void atualiizaProduto(@PathVariable Integer idProduto,
			@Valid @RequestBody ProdutoAlteracaoRequest produtoAlteracaoRequest);

	@DeleteMapping(value = "/{idProduto}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deleta(@PathVariable Integer idProduto);

}
