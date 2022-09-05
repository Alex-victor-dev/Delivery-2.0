package com.br.delivery.usuario.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.br.delivery.usuario.application.api.AlteraResponse;
import com.br.delivery.usuario.application.api.UsuarioBuscaResponse;
import com.br.delivery.usuario.application.api.UsuarioListResponse;
import com.br.delivery.usuario.application.api.UsuarioRequest;
import com.br.delivery.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

	UsuarioResponse CriaUsuario(@Valid UsuarioRequest requestUsuario);

	List<UsuarioListResponse> BuscaTodosUsuarios();

	UsuarioBuscaResponse BuscaPorId(UUID idUsuario);

	void DeletaUsuario(UUID idUsuario);

	void AlteraUsuario(UUID idUsuario, AlteraResponse altera);

	

}
