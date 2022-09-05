package com.br.delivery.ItemPedido.service;

import java.util.List;
import java.util.UUID;

import com.br.delivery.ItemPedido.api.ItemPedidoRequest;
import com.br.delivery.ItemPedido.api.ItemPedidoResponse;
import com.br.delivery.ItemPedido.domain.ItemPedido;

public interface ItemPedidoService {

	ItemPedidoResponse CriaItemPedido(ItemPedidoRequest itemPedidoRequest);

	List<ItemPedido> BuscaTodos();

	ItemPedido BuscaPorId(UUID idItemPedido);

	void DeletaItemPedido(UUID idItemPedido);

	

}
