package com.br.delivery.usuario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UsuarioResponse
{
	private String nome;
	private UUID idUsuario;
	
}
