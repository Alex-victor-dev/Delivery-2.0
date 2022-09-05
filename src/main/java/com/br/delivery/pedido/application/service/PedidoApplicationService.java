package com.br.delivery.pedido.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.br.delivery.pedido.application.api.PedidoResponse;
import com.br.delivery.pedido.domain.Pedido;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class PedidoApplicationService implements PedidoService {

	private final PedidoRepository pedidoRepository;

	@Override
	public PedidoResponse CriaPedido() {
		log.info("[inicia] PedidoApplicationService - CriaPedido");
		Pedido pedido = pedidoRepository.Salva(new Pedido());
		log.info("[finaliza] PedidoApplicationService - CriaPedido");
		return PedidoResponse.builder()
				.idPedido(pedido.getIdPedido())
				.HoraDoPedido(pedido.getHoraDoPedido())
				.orderStatus(pedido.getOrderStatus())
				.build();
	}

	@Override
	public List<Pedido> BuscaTodosPedidos() {
		log.info("[inicia] PedidoApplicationService - BuscaTodosPedidos");
		List<Pedido> lista = pedidoRepository.BuscaPedidos();
		log.info("[finaliza] PedidoApplicationService - BuscaTodosPedidos");
		return lista;
	}

	@Override
	public Pedido BuscaPedidoPorId(UUID idPedido) {
		log.info("[inicia] PedidoApplicationService - BuscaPedidoPorId");
		Pedido pedido = pedidoRepository.BuscarPedidoPorId(idPedido);
		log.info("[finaliza] PedidoApplicationService - BuscaPedidoPorId");
		return pedido;
	}

	@Override
	public void DeletaProduto(UUID idPedido) {
		log.info("[inicia] PedidoApplicationService - DeletaProduto");
		Pedido pedido = BuscaPedidoPorId(idPedido);
		pedidoRepository.DeletaProduto(pedido);
		log.info("[finaliza] PedidoApplicationService - DeletaProduto");
		
	}

	@Override
	public void AlteraStatusEnviado(UUID idPedido) {
		log.info("[inicia] PedidoApplicationService - AlteraProduto");
		Pedido pedido = BuscaPedidoPorId(idPedido);
		pedido.alteraStatusEnviado();
		pedidoRepository.Salva(pedido);
		log.info("[inicia] PedidoApplicationService - AlteraProduto");
	}

	public void AlteraStatusEntregue(UUID idPedido) {
		log.info("[inicia] PedidoApplicationService - alteraStatusEntregue");
		Pedido pedido = BuscaPedidoPorId(idPedido);
		pedido.alteraStatusEntregue();
		pedidoRepository.Salva(pedido);
		log.info("[inicia] PedidoApplicationService - alteraStatusEntregue");
	}
	public void AlteraStatusPago(UUID idPedido) {
		log.info("[inicia] PedidoApplicationService - alteraStatusEntregue");
		Pedido pedido = BuscaPedidoPorId(idPedido);
		pedido.alteraStatusPago();
		pedidoRepository.Salva(pedido);
		log.info("[inicia] PedidoApplicationService - alteraStatusEntregue");
	}
	
	public void AlteraStatusCancelado(UUID idPedido) {
		log.info("[inicia] PedidoApplicationService - alteraStatusEntregue");
		Pedido pedido = BuscaPedidoPorId(idPedido);
		pedido.alteraStatusCancelado();
		pedidoRepository.Salva(pedido);
		log.info("[inicia] PedidoApplicationService - alteraStatusEntregue");
	}


	
	
}
