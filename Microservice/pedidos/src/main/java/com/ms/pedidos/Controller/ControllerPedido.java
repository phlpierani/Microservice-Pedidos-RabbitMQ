package com.ms.pedidos.Controller;

import com.ms.pedidos.domain.PedidoModel;
import com.ms.pedidos.services.OrderService;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Builder
@RequiredArgsConstructor
@RequestMapping("/orders")
@RestController
public class ControllerPedido {

    private final OrderService orderService;

    @PostMapping
    public String createOrder(@RequestBody PedidoModel pedidoModel) {
        pedidoModel.setPedidoId(null); // Garante INSERT e não UPDATE
        orderService.createOrder(pedidoModel);
        return "Order created successfully!";
    }

}
