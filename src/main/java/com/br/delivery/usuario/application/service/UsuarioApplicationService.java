package com.br.delivery.usuario.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.br.delivery.usuario.application.api.AlteraResponse;
import com.br.delivery.usuario.application.api.UsuarioBuscaResponse;
import com.br.delivery.usuario.application.api.UsuarioListResponse;
import com.br.delivery.usuario.application.api.UsuarioRequest;
import com.br.delivery.usuario.application.api.UsuarioResponse;
import com.br.delivery.usuario.application.repository.UsuarioRepository;
import com.br.delivery.usuario.domain.Usuario;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RequiredArgsConstructor
@Service
@Log4j2
public class UsuarioApplicationService implements UsuarioService {

	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioResponse CriaUsuario(@Valid UsuarioRequest requestUsuario) {
		log.info("[inicia] UsuarioApplicationService - CriaUsuario");
		Usuario usuario = usuarioRepository.Salva(new Usuario(requestUsuario));
		log.info("[finaliza] UsuarioApplicationService - CriaUsuario");
		
		return UsuarioResponse.builder()
				.idUsuario(usuario.getIdUsuario())
				.nome(usuario.getNome())
				.build();
	}

	@Override
	public List<UsuarioListResponse> BuscaTodosUsuarios() {
		
		log.info("[inicia] UsuarioApplicationService - BuscaTodosUsuarios");
		List<Usuario> usuario = usuarioRepository.BuscaTodosCLientes();
		log.info("[finaliza] UsuarioApplicationService - BuscaTodosUsuarios");
	
		return UsuarioListResponse.Converte(usuario);
	}

	@Override
	public UsuarioBuscaResponse BuscaPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioApplicationService - BuscaPorId");
		Usuario usuario = usuarioRepository.BuscaPorId(idUsuario);
		log.info("[finaliza] UsuarioApplicationService - BuscaPorId");
		return new UsuarioBuscaResponse(usuario);
	}

	@Override
	public void DeletaUsuario(UUID idUsuario) {
		log.info("[inicia] UsuarioApplicationService - DeletaUsuario");
		Usuario usuario = usuarioRepository.BuscaPorId(idUsuario);
		usuarioRepository.DeletaUsuario(usuario);
		log.info("[finaliza] UsuarioApplicationService - DeletaUsuario");
		
	}

	@Override
	public void AlteraUsuario(UUID idUsuario, AlteraResponse altera) {
		Usuario usuario = usuarioRepository.BuscaPorId(idUsuario);
		usuario.altera(altera);
		usuarioRepository.Salva(usuario);
		
	}

	

}
