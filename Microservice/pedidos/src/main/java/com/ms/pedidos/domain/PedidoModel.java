package com.ms.pedidos.domain;

import com.ms.pedidos.Enum.StatusPedido;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_PEDIDO")
public class PedidoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue()
    private UUID pedidoId; // id do pedido
    private Long produtoId; // id do produto
    private String nameProduct; // nome do produto
    private Double price; // preço do produto
    private double quantify; // quantidade
    private String customerEmail; // email do cliente

    @Enumerated(EnumType.STRING) // define o tipo de enumeração
    private StatusPedido statusPedido; // status do pedido

    private LocalDateTime statusDate; // data do status

}
