package com.br.delivery.ItemPedido.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.delivery.ItemPedido.api.ItemPedidoRequest;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idItemPedido", updatable = false, unique = true, nullable = false)	
	private UUID idItemPedido;
	private Integer quantidade;
	private Double preco;
	
	public ItemPedido(ItemPedidoRequest itemPedidoRequest) {
		this.quantidade = itemPedidoRequest.getQuantidade();

	}

	@Autowired
	private Double Subtotal() {
		return preco*quantidade;
	}

}
