package com.br.delivery.pedido.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.delivery.pedido.domain.Pedido;

public interface PedidoSpringDataJPA extends JpaRepository<Pedido, UUID>{

}
