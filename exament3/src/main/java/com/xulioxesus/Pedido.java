package com.xulioxesus;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un pedido.
 */
public class Pedido {
    private List<Producto> productos;

    /**
     * Constructor de pedido en la que inicializamos el atributo productos.
     */
    public Pedido() {
        productos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la lista de productos.
     * @param producto Producto que queremos añadir
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Método que calcula el precio total de todos los productos.
     * @return devuelve el precio total de todos los productos del pedido
     */
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getTotal();
        }
        return total;
    }
}
