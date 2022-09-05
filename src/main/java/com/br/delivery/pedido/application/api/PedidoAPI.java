package com.br.delivery.pedido.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.delivery.pedido.domain.Pedido;

@RequestMapping("/pedido")
@RestController
public interface PedidoAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PedidoResponse pedidoResponse(Pedido pedido);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<Pedido> pedidos();
	
	@GetMapping("/{idPedido}")
	@ResponseStatus(code = HttpStatus.OK)
	Pedido buscaPedidoPorId(@PathVariable UUID idPedido);
	
	@DeleteMapping("/{idPedido}")
	@ResponseStatus(code = HttpStatus.OK)
	void deletaPedido(@PathVariable UUID idPedido);
	
	@PatchMapping("/{idPedido}/enviado")
	@ResponseStatus(code = HttpStatus.OK)
	void alteraStatusEnviado(@PathVariable UUID idPedido);

	@PatchMapping("/{idPedido}/pago")
	@ResponseStatus(code = HttpStatus.OK)
	void alteraStatusPago(@PathVariable UUID idPedido);
	
	@PatchMapping("/{idPedido}/entregue")
	@ResponseStatus(code = HttpStatus.OK)
	void alteraStatusEntregue(@PathVariable UUID idPedido);
	
	@PatchMapping("/{idPedido}/cancelado")
	@ResponseStatus(code = HttpStatus.OK)
	void alteraStatusCancelado(@PathVariable UUID idPedido);

}
