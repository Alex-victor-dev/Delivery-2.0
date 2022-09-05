package com.br.delivery.usuario.application.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.br.delivery.usuario.application.repository.UsuarioRepository;
import com.br.delivery.usuario.domain.Usuario;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Repository
@Log4j2
public class UsuarioInfraRepository implements UsuarioRepository {

	private final UsuarioSpringDataJpa usuarioSpringDataJpa;

	@Override
	public Usuario Salva(Usuario usuario) {
		log.info("[inicia] UsuarioInfraRepository - Salva");
		usuarioSpringDataJpa.save(usuario);
		log.info("[finaliza] UsuarioInfraRepository - Salva");
		return usuario;
	}

	@Override
	public List<Usuario> BuscaTodosCLientes() {
		log.info("[inicia] UsuarioInfraRepository - BuscaTodosCLientes");
		List<Usuario> usuarios = usuarioSpringDataJpa.findAll();
		log.info("[finaliza] UsuarioInfraRepository - BuscaTodosCLientes");
		return usuarios;
	}

	@Override
	public Usuario BuscaPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioInfraRepository - BuscaPorId");
		Usuario usuario = usuarioSpringDataJpa.findById(idUsuario)
				.orElseThrow(() -> new RuntimeException("usuario não encontrado"));
		log.info("[finaliza] UsuarioInfraRepository - BuscaPorId");
		return usuario;
	}

	@Override
	public void DeletaUsuario(Usuario usuario) {
		log.info("[inicia] UsuarioInfraRepository - DeletaUsuario");
		usuarioSpringDataJpa.delete(usuario);
		log.info("[finaliza] UsuarioInfraRepository - DeletaUsuario");
	}
	
	

}
