# 🧾 Microserviço de Pedidos com RabbitMQ

Projeto desenvolvido com Spring Boot que simula a criação e processamento de pedidos utilizando mensageria com RabbitMQ.

## 🚀 Funcionalidades

- Criar pedidos via requisição HTTP `POST`
- Enviar mensagens para a fila RabbitMQ
- Consumir mensagens da fila e processar internamente
- Persistência de dados com banco em memória H2

## 🛠️ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- RabbitMQ
- H2 Database
- Lombok

## 💡 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/phlpierani/Microservice-Pedidos-RabbitMQ.git
   cd Microservice-Pedidos-RabbitMQ
