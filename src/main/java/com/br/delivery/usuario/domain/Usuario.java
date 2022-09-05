package com.br.delivery.usuario.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.br.delivery.usuario.application.api.AlteraResponse;
import com.br.delivery.usuario.application.api.UsuarioRequest;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idUsuario", updatable = false, unique = true, nullable = false)
	private UUID idUsuario;
	@NotNull
	private String nome;
	@NotEmpty
	@Email
	private String email;
	private String telefone;
	
	private String senha;

	public Usuario(@Valid UsuarioRequest requestUsuario) {
		this.nome = requestUsuario.getNome();
		this.email = requestUsuario.getEmail();
		this.telefone = requestUsuario.getTelefone();
		this.senha = requestUsuario.getSenha();
	}

	public void altera(AlteraResponse altera) {
	
		this.nome = altera.getNome();
		this.email = altera.getEmail();
		this.telefone = altera.getTelefone();
		this.senha = altera.getSenha();
	}
	
	
	

}
