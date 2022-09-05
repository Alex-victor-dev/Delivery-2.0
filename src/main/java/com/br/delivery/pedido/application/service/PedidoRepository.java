package com.br.delivery.pedido.application.service;

import java.util.List;
import java.util.UUID;

import com.br.delivery.pedido.domain.Pedido;

public interface PedidoRepository {

	Pedido Salva(Pedido pedidoRequest);

	List<Pedido> BuscaPedidos();

	Pedido BuscarPedidoPorId(UUID idPedido);

	void DeletaProduto(Pedido pedido);

}
