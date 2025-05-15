package com.ms.pedidos.services;

import com.ms.pedidos.Enum.StatusPedido;
import com.ms.pedidos.RabbitMQConfig.RabbitMqSender;
import com.ms.pedidos.domain.PedidoModel;
import com.ms.pedidos.repositories.RepositoryPedido;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final RepositoryPedido repositoryPedido;
    private final RabbitMqSender rabbitMqSender;


    public void createOrder(PedidoModel pedidoModel) { // Method to create an order
        pedidoModel.setStatusPedido(StatusPedido.PENDING); // Set initial status
        pedidoModel.setStatusDate(LocalDateTime.now()); // Set current date and time
        repositoryPedido.save(pedidoModel); // Save the order to the database

        rabbitMqSender.send(pedidoModel); // Envia o pedido para a fila

    }
}
