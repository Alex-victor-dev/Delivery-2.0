package com.br.delivery.ItemPedido.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.delivery.ItemPedido.domain.ItemPedido;

@RestController
@RequestMapping("/itempedido")
public interface ItemPedidoAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ItemPedidoResponse itemPedidoResponse(@RequestBody ItemPedidoRequest itemPedidoRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ItemPedido> listItemPedido();
	
	@GetMapping("/{idItemPedido}")
	@ResponseStatus(code = HttpStatus.OK)
	ItemPedido BuscaItemPedido(@PathVariable UUID idItemPedido);
	
	@DeleteMapping("/{idItemPedido}")
	@ResponseStatus(code = HttpStatus.OK)
	void deletaItemPedido(@PathVariable UUID idItemPedido);
	
	
	
	
	
	
	
}
