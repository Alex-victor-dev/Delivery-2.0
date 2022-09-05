package com.br.delivery.categoria.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public interface CategoriaAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	CategoriaResponse response(@RequestBody CategoriaRequest caregoriaRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<CategoriaListResponse> listaCategorias();
	
	@GetMapping("/{idCategoria}")
	@ResponseStatus(code = HttpStatus.OK)
	CategoriaListResponse buscaCategoria(@PathVariable UUID idCategoria);
	
	@DeleteMapping("/{idCategoria}")
	@ResponseStatus(code = HttpStatus.OK)
	void deletaCategoria(@PathVariable UUID idCategoria);

	

}