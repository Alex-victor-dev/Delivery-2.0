package com.br.delivery.ItemPedido.repository;

import java.util.List;
import java.util.UUID;

import com.br.delivery.ItemPedido.domain.ItemPedido;

public interface ItemPedidoRepository {

	ItemPedido Salva(ItemPedido itemPedido);

	List<ItemPedido> BuscaTodosItemPedido();

	ItemPedido BuscaPorId(UUID idItemPedido);

	void Deleta(ItemPedido itemPedido);


}
