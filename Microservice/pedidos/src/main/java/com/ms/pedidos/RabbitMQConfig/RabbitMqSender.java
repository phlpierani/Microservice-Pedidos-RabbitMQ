package com.ms.pedidos.RabbitMQConfig;

import com.ms.pedidos.domain.PedidoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMqSender {

    private final RabbitTemplate rabbitTemplate; // Injeta o RabbitTemplate
    private final Queue queue; // Injeta a fila RabbitMQ

    public void send(PedidoModel pedidoModel) { // Metodo para enviar mensagens para a fila RabbitMQ
        rabbitTemplate.convertAndSend(queue.getName(), pedidoModel); // Agora envia o objeto
    }
}
