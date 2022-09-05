package com.br.delivery.categoria.api;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.Value;

@Value
public class CategoriaRequest {

private String nome;

@JsonCreator
public CategoriaRequest(String nome) {
	this.nome = nome;
}


}