package com.br.delivery.pedido.application.service;

import java.util.List;
import java.util.UUID;

import com.br.delivery.pedido.application.api.PedidoResponse;
import com.br.delivery.pedido.domain.Pedido;

public interface PedidoService {

	PedidoResponse CriaPedido();

	List<Pedido> BuscaTodosPedidos();

	Pedido BuscaPedidoPorId(UUID idPedido);

	void DeletaProduto(UUID idPedido);

	void AlteraStatusEnviado(UUID idPedido);

	void AlteraStatusEntregue(UUID idPedido);

	void AlteraStatusPago(UUID idPedido);

	void AlteraStatusCancelado(UUID idPedido);
}
