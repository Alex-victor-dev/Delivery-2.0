package com.br.delivery.usuario.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.br.delivery.usuario.domain.Usuario;

import lombok.Value;

@Value
public class UsuarioListResponse {

	private UUID idCliente;
	private String nome;
	private String email;
	private String telefone;
	
	
	public static List<UsuarioListResponse> Converte(List<Usuario> usuario) {
		
		return usuario.stream()
		.map(u -> new UsuarioListResponse(u))
		.collect(Collectors.toList());
		
		
	}


	public UsuarioListResponse(Usuario usuario) {
	
		this.idCliente = usuario.getIdUsuario();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.telefone = usuario.getTelefone();
	}
	
	
	
}
