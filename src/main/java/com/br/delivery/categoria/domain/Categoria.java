package com.br.delivery.categoria.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.delivery.categoria.api.CategoriaRequest;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCategoria", updatable = false, unique = true, nullable = false)
	private UUID idCategoria;
	private String nome;

	public Categoria(CategoriaRequest categoriaRequest) {

		this.nome = categoriaRequest.getNome();
	}

}