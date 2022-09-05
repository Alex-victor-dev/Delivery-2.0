package com.br.delivery.usuario.application.repository;

import java.util.List;
import java.util.UUID;

import com.br.delivery.usuario.domain.Usuario;

public interface UsuarioRepository {

	Usuario Salva(Usuario usuario);

	List<Usuario> BuscaTodosCLientes();

	Usuario BuscaPorId(UUID idUsuario);

	void DeletaUsuario(Usuario usuario);



}
