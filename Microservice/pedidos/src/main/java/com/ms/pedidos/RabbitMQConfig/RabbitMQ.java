package com.ms.pedidos.RabbitMQConfig;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ {

    @Value("${spring.rabbitmq.queue}")
    private String queue;

    @Bean
    public Queue queue(){ // Declare the queue bean
        return new Queue(queue, true); // Queue will be durable
    }

    @Bean
    Jackson2JsonMessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter(); // Message converter for JSON
    }
}
