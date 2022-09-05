package com.br.delivery.ItemPedido.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import com.br.delivery.ItemPedido.domain.ItemPedido;
import com.br.delivery.ItemPedido.service.ItemPedidoService;

import lombok.RequiredArgsConstructor;

@RestController	
@RequiredArgsConstructor
public class ItemPedidoController implements ItemPedidoAPI {

	private final ItemPedidoService itemPedidoService;

	@Override
	public ItemPedidoResponse itemPedidoResponse(ItemPedidoRequest itemPedidoRequest) {
		ItemPedidoResponse itemPedidoResponse = itemPedidoService.CriaItemPedido(itemPedidoRequest);
		return itemPedidoResponse;
	}

	@Override
	public List<ItemPedido> listItemPedido() {
		List<ItemPedido> lista = itemPedidoService.BuscaTodos();
		return lista;
	}

	@Override
	public ItemPedido BuscaItemPedido(UUID idItemPedido) {
		ItemPedido itemPedido = itemPedidoService.BuscaPorId(idItemPedido);
		return itemPedido;
	}

	@Override
	public void deletaItemPedido(UUID idItemPedido) {
		itemPedidoService.DeletaItemPedido(idItemPedido);
	}

}
