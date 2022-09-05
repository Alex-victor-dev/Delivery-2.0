package com.br.delivery.usuario.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.delivery.usuario.domain.Usuario;

public interface UsuarioSpringDataJpa extends JpaRepository<Usuario, UUID>{

}
