package com.br.delivery.ItemPedido.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.delivery.ItemPedido.domain.ItemPedido;

public interface ItemPedidoSpringDataJPA extends JpaRepository<ItemPedido, UUID>{

}
