package com.ms.pedidos.RabbitMQConfig;

import com.ms.pedidos.domain.PedidoModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoConsumer { // Classe responsável por consumir mensagens da fila RabbitMQ
    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receive(PedidoModel pedido) { //Metodo que consome mensagens da fila
        System.out.println("✅ Verificando estoque do produto " + pedido.getProdutoId() + // Log de recebimento
                " (Qtd: " + pedido.getQuantify() + ") para o cliente " + pedido.getCustomerEmail()); // Log de recebimento
    }
}
