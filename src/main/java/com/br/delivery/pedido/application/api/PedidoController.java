package com.br.delivery.pedido.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import com.br.delivery.pedido.application.service.PedidoService;
import com.br.delivery.pedido.domain.Pedido;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {

	private final PedidoService pedidoService;

	@Override
	public PedidoResponse pedidoResponse(Pedido pedido) {
		log.info("[inicia] PedidoController - pedidoResponse");
		PedidoResponse novopedido = pedidoService.CriaPedido();
		log.info("[finaliza] PedidoController - pedidoResponse");
		return novopedido;
	}

	@Override
	public List<Pedido> pedidos() {
		log.info("[inicia] PedidoController - pedidos");
		List<Pedido> listaPedidos = pedidoService.BuscaTodosPedidos();
		log.info("[finaliza] PedidoController - pedidos");
		return listaPedidos;
	}

	@Override
	public Pedido buscaPedidoPorId(UUID idPedido) {
		log.info("[inicia] PedidoController - buscaPedidoPorId");
		Pedido pedido = pedidoService.BuscaPedidoPorId(idPedido);
		log.info("[finaliza] PedidoController - buscaPedidoPorId");
		return pedido;
	}

	@Override
	public void deletaPedido(UUID idPedido) {
		log.info("[inicia] PedidoController - DeletaPedido");
		pedidoService.DeletaProduto(idPedido);
		log.info("[inicia] PedidoController - DeletaPedido");
		
	}

	@Override
	public void alteraStatusEnviado(UUID idPedido) {
		log.info("[inicia] PedidoController - AlteraPedido");
		pedidoService.AlteraStatusEnviado(idPedido);
		log.info("[inicia] PedidoController - AlteraPedido");
	}

	@Override
	public void alteraStatusEntregue(UUID idPedido) {
		log.info("[inicia] PedidoController - alteraStatusEntregue");
		pedidoService.AlteraStatusEntregue(idPedido);
		log.info("[inicia] PedidoController - alteraStatusEntregue");
	}
	
	public void alteraStatusPago(UUID idPedido) {
		log.info("[inicia] PedidoController - alteraStatusPago");
		pedidoService.AlteraStatusPago(idPedido);
		log.info("[inicia] PedidoController - alteraStatusPago");
	}
	
	public void alteraStatusCancelado(UUID idPedido) {
		log.info("[inicia] PedidoController - alteraStatusCancelado");
		pedidoService.AlteraStatusCancelado(idPedido);
		log.info("[inicia] PedidoController - alteraStatusCancelado");
	}
	

	}


