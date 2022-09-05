package com.br.delivery.pedido.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;

@Entity
@Getter
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPedido", updatable = false, unique = true, nullable = false)	
	private UUID idPedido;
	private LocalDateTime HoraDoPedido;
	@Enumerated(value = EnumType.STRING)
	private OrderStatus orderStatus;

	public Pedido() {
		this.HoraDoPedido = LocalDateTime.now();
		this.orderStatus = OrderStatus.AGUARDANDO_PAGAMENTO;
	}

	public void alteraStatusEnviado() {
		this.orderStatus = OrderStatus.ENVIADO;

	}

	public void alteraStatusEntregue() {
		this.orderStatus = OrderStatus.ENTREGUE;
	}

	public void alteraStatusPago() {
		this.orderStatus = OrderStatus.PAGO;
	}

	public void alteraStatusCancelado() {
		this.orderStatus = OrderStatus.CANCELADO;
	}

}
