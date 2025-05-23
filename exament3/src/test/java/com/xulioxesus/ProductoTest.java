package com.xulioxesus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void testConstructorYGetters() {
        Producto producto = new Producto("Banana", 3, 4);

        assertEquals("Banana", producto.getNombre());
        assertEquals(3, producto.getPrecio());
        assertEquals(4, producto.getCantidad());
    }

    @Test
    void testGetTotal() {
        Producto producto = new Producto("Banana", 3, 4);
        assertEquals(12.0, producto.getTotal());
    }

    @Test
    void testToString() {
        Producto producto = new Producto("Banana", 3, 4);
        String esperado = "Banana - 4 x 3.0 = 12.0";
        assertEquals(esperado, producto.toString());
    }
}