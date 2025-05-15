package com.ms.pedidos.repositories;

import com.ms.pedidos.domain.PedidoModel;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositoryPedido extends JpaRepository<PedidoModel, UUID> {

}
