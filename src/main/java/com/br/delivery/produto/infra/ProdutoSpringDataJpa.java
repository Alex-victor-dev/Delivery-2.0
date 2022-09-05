package com.br.delivery.produto.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.delivery.produto.domain.Produto;

public interface ProdutoSpringDataJpa extends JpaRepository<Produto, Integer> {

}
