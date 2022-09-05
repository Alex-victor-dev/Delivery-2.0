package com.br.delivery.pagamento.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.delivery.pagamento.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, UUID> {

}
