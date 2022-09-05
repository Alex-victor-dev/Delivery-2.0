package com.br.delivery.ItemPedido.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.br.delivery.ItemPedido.api.ItemPedidoRequest;
import com.br.delivery.ItemPedido.api.ItemPedidoResponse;
import com.br.delivery.ItemPedido.domain.ItemPedido;
import com.br.delivery.ItemPedido.repository.ItemPedidoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ItemPedidoApplicationService implements ItemPedidoService {

	private final ItemPedidoRepository itemPedidoRepository;

	@Override
	public ItemPedidoResponse CriaItemPedido(ItemPedidoRequest itemPedidoRequest) {
		ItemPedido itemPedido = itemPedidoRepository.Salva(new ItemPedido(itemPedidoRequest));
		return ItemPedidoResponse.builder()
				.idItemPedido(itemPedido.getIdItemPedido())
				.build();
	}

	@Override
	public List<ItemPedido> BuscaTodos() {
		List<ItemPedido> lista = itemPedidoRepository.BuscaTodosItemPedido();
		return (lista);
	}

	@Override
	public ItemPedido BuscaPorId(UUID idItemPedido) {
		ItemPedido itemPedido = itemPedidoRepository.BuscaPorId(idItemPedido);
		return itemPedido;
	}

	@Override
	public void DeletaItemPedido(UUID idItemPedido) {
		ItemPedido itemPedido = itemPedidoRepository.BuscaPorId(idItemPedido);
		itemPedidoRepository.Deleta(itemPedido);
	}
	
	

}
