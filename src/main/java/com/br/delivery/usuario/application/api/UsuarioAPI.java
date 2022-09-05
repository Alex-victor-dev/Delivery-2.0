package com.br.delivery.usuario.application.api;

import java.util.List;
import java.util.UUID;

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
@RequestMapping("/usuario")
public interface UsuarioAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	UsuarioResponse postCliente(@Valid @RequestBody UsuarioRequest requestUsuario);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<UsuarioListResponse> listaUsuarios();
	
	@GetMapping("/{idUsuario}")
	@ResponseStatus(code = HttpStatus.OK)
	UsuarioBuscaResponse buscaPorId(@PathVariable UUID idUsuario);
	
	@DeleteMapping("/{idUsuario}")
	@ResponseStatus(code = HttpStatus.OK)
	void deleteUsuario(@PathVariable UUID idUsuario);

	@PatchMapping("/{idUsuario}")
	@ResponseStatus(code = HttpStatus.OK)
	void AlteraUsuario(@PathVariable UUID idUsuario, @RequestBody AlteraResponse altera);
	
}
