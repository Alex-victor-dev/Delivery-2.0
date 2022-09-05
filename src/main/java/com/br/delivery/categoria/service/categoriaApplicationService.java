package com.br.delivery.categoria.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.br.delivery.categoria.api.CategoriaListResponse;
import com.br.delivery.categoria.api.CategoriaRequest;
import com.br.delivery.categoria.api.CategoriaResponse;
import com.br.delivery.categoria.domain.Categoria;
import com.br.delivery.categoria.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class categoriaApplicationService implements CategoriaService {

	private final CategoriaRepository categoriaRepository;

	@Override
	public CategoriaResponse CriaCategoria(CategoriaRequest categoriaRequest) {
		log.info("[inicia] CategoriaController - CriaCategoria");
		Categoria categoria = categoriaRepository.Salva(new Categoria(categoriaRequest));
		log.info("[finaliza] CategoriaController - CriaCategoria");
		return CategoriaResponse.builder().idCategoria(categoria.getIdCategoria()).nome(categoria.getNome()).build();
	}

	@Override
	public List<CategoriaListResponse> BuscaTodosCategorias() {

		log.info("[inicia] CategoriaApplicationService - BuscaTodosCategorias");
		List<Categoria> categoria = categoriaRepository.BuscaTodasCategorias();
		log.info("[finaliza] CategoriaApplicationService - BuscaTodosCategorias");
		return CategoriaListResponse.Converte(categoria);

	}

	@Override
	public CategoriaListResponse BuscaPorID(UUID idCategoria) {
		Categoria categoria = categoriaRepository.BuscaCategoriaPorId(idCategoria);
		return new CategoriaListResponse(categoria);
	}

	@Override
	public void DeletaCategoria(UUID idCategoria) {
		Categoria categoria = categoriaRepository.BuscaCategoriaPorId(idCategoria);
		categoriaRepository.DeletaCategoria(categoria);
	}
}