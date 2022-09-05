package com.br.delivery.pedido.application.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.br.delivery.pedido.application.service.PedidoRepository;
import com.br.delivery.pedido.domain.Pedido;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@Repository
public class PedidoInfraRepository implements PedidoRepository {
	private final PedidoSpringDataJPA pedidoSpringDataJPA;

	
	@Override
	public Pedido Salva(Pedido pedido) {
		log.info("[inicia] PedidoInfraRepository - Salva");
		pedidoSpringDataJPA.save(pedido);
		log.info("[finaliza] PedidoInfraRepository - Salva");
		return pedido;
	}


	@Override
	public List<Pedido> BuscaPedidos() {
		log.info("[inicia] PedidoInfraRepository - BuscaPedidos");
		List<Pedido> pedidos = pedidoSpringDataJPA.findAll();
		log.info("[finaliza] PedidoInfraRepository - BuscaPedidos");
		return pedidos;
	}


	@Override
	public Pedido BuscarPedidoPorId(UUID idPedido) {
		log.info("[inicia] PedidoInfraRepository - BuscarPedidoPorId");
		Pedido pedido = pedidoSpringDataJPA.findById(idPedido)
				.orElseThrow(() -> new RuntimeException("Pedido não Encontrado"));
		log.info("[finaliza] PedidoInfraRepository - BuscarPedidoPorId");
		return pedido;
	}


	@Override
	public void DeletaProduto(Pedido pedido) {
		log.info("[inicia] PedidoInfraRepository - DeletaProduto");
		pedidoSpringDataJPA.delete(pedido);
		log.info("[finaliza] PedidoInfraRepository - DeletaProduto");
		
		
	}

}
