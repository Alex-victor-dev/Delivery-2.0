package com.br.delivery.usuario.application.api;

import com.br.delivery.usuario.domain.Usuario;

import lombok.Value;

@Value
public class UsuarioBuscaResponse {
	
	private String nome;
	private String email;
	private String telefone;

	public UsuarioBuscaResponse(Usuario usuario) {

		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.telefone = usuario.getTelefone();
	}
	
}
