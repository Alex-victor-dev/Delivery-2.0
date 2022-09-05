package com.br.delivery.usuario.application.api;

import lombok.Value;

@Value
public class AlteraResponse {

	private String nome;
	private String email;
	private String telefone;
	private String senha;
	
}
