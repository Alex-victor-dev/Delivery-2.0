package com.br.delivery.ItemPedido.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.br.delivery.ItemPedido.domain.ItemPedido;
import com.br.delivery.ItemPedido.repository.ItemPedidoRepository;
import com.br.delivery.handler.APIException;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemPedidoInfraRepository implements ItemPedidoRepository {

	private final ItemPedidoSpringDataJPA itemPedidoSpringDataJPA;

	@Override
	public ItemPedido Salva(ItemPedido itemPedido) {
		ItemPedido itemPedidoRetorno = itemPedidoSpringDataJPA.save(itemPedido);
		return itemPedidoRetorno;
	}

	@Override
	public List<ItemPedido> BuscaTodosItemPedido() {
		List<ItemPedido> lista = itemPedidoSpringDataJPA.findAll();
		return lista;
	}

	@Override
	public ItemPedido BuscaPorId(UUID idItemPedido) {
		ItemPedido itemPedido = 
				itemPedidoSpringDataJPA.findById(idItemPedido)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "itemPedido não encontrado!"));
		return itemPedido;
	}

	@Override
	public void Deleta(ItemPedido itemPedido) {
		itemPedidoSpringDataJPA.delete(itemPedido);
	}

}
