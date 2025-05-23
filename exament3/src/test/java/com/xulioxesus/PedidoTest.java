package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {
    @Test
    void testProducto() {
        Pedido pedido = new Pedido();
        Producto producto1 = new Producto("Banana", 3, 4);
        Producto producto2 = new Producto("Mazán", 1, 2);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        assertEquals(12.0 + 2.0, pedido.calcularTotal());
    }
}
