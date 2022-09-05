package com.br.delivery.categoria.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import com.br.delivery.categoria.service.CategoriaService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CategoriaController implements CategoriaAPI {

	private final CategoriaService categoriaService;

	@Override
	public CategoriaResponse response(CategoriaRequest categoriaRequest) {
		log.info("[inicia] CategoriaController - response");
		CategoriaResponse categoria = categoriaService.CriaCategoria(categoriaRequest);
		log.info("[finaliza] CategoriaController - response");
		return categoria;
	}

	@Override
	public List<CategoriaListResponse> listaCategorias() {
		log.info("[inicia] CategoriaController - listaCategorias");
		List<CategoriaListResponse> listaTodosCategorias = categoriaService.BuscaTodosCategorias();
		log.info("[finaliza] CategoriaController - listaCategorias");
		return listaTodosCategorias;
	}

	@Override
	public CategoriaListResponse buscaCategoria(UUID idCategoria) {
		CategoriaListResponse categoriaResponse = categoriaService.BuscaPorID(idCategoria);
		return categoriaResponse;
	}

	@Override
	public void deletaCategoria(UUID idCategoria) {
		categoriaService.DeletaCategoria(idCategoria);
	}

}