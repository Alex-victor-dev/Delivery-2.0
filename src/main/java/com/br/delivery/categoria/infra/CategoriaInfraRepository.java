package com.br.delivery.categoria.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.br.delivery.categoria.domain.Categoria;
import com.br.delivery.categoria.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class CategoriaInfraRepository implements CategoriaRepository {

	private final CategoriaSpringDataJPA categoriaSpringDataJPA;
	
	@Override
	public Categoria Salva(Categoria categoria) {
		categoriaSpringDataJPA.save(categoria);
		return categoria;
	}

	@Override
	public List<Categoria> BuscaTodasCategorias() {
		List<Categoria> categoria = categoriaSpringDataJPA.findAll();
		return categoria;
	}

	@Override
	public Categoria BuscaCategoriaPorId(Integer idCategoria) {
		Categoria categoria = 
				categoriaSpringDataJPA.findById(idCategoria)
				.orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
		return categoria;
	}

	@Override
	public void DeletaCategoria(Categoria categoria) {
		categoriaSpringDataJPA.delete(categoria);
	}


	
	
	

}