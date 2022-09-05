package com.br.delivery.usuario.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import com.br.delivery.usuario.application.service.UsuarioService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {
	
	private final UsuarioService usuarioService;

	@Override
	public UsuarioResponse postCliente(@Valid UsuarioRequest requestUsuario) {
		log.info("[inicia] UsuarioController - postCliente");
		UsuarioResponse clienteCriado = usuarioService.CriaUsuario(requestUsuario);
		log.info("[finaliza] UsuarioController - postCliente");
		return clienteCriado;
	}

	@Override
	public List<UsuarioListResponse> listaUsuarios() {
		log.info("[inicia] UsuarioController - listaUsuarios");
		List<UsuarioListResponse> listaTodosUsuarios = usuarioService.BuscaTodosUsuarios();
		log.info("[finaliza] UsuarioController - listaUsuarios");
		
		return listaTodosUsuarios;
	}

	@Override
	public UsuarioBuscaResponse buscaPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioController - buscaPorId");
		UsuarioBuscaResponse usuario = usuarioService.BuscaPorId(idUsuario);
		log.info("[finaliza] UsuarioController - buscaPorId");
		return usuario;
	}

	@Override
	public void deleteUsuario(UUID idUsuario) {
		log.info("[inicia] UsuarioController - deleteUsuario");
		usuarioService.DeletaUsuario(idUsuario);
		log.info("[inicia] UsuarioController - deleteUsuario");
	}

	@Override
	public void AlteraUsuario(UUID idUsuario, AlteraResponse altera) {
		usuarioService.AlteraUsuario(idUsuario, altera);	
	}

	
	
}
