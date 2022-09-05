package com.br.delivery.ItemPedido.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ItemPedidoResponse {

	private UUID idItemPedido;
	private Integer quantidade;
	private Double preco;
	
//	@Autowired
//	private static Double Subtotal() {
//		double valor = preco*quantidade;
//		return valor;
//	}
}
