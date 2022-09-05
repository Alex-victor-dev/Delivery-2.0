package com.br.delivery.pedido.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import com.br.delivery.pedido.domain.OrderStatus;

import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class PedidoResponse {

	private UUID idPedido;
	private LocalDateTime HoraDoPedido;
	private OrderStatus orderStatus;
	
}
