package com.xulioxesus;

/**
 * Esta clase representa un producto.
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    /**
     * Contructor de producto que crea un producto con nombre, precio y cantidad.
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param cantidad Cantidad del producto
     */
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Método para obtener el nombre del producto.
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el precio del producto.
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para obtener la cantidad del producto.
     * @return cantidad del producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Método para obtener el precio total del producto.
     * @return precio total del producto
     */
    public double getTotal() {
        return precio * cantidad;
    }

    /**
     * Método para imprimir los objetos Producto.
     */
    @Override
    public String toString() {
        return nombre + " - " + cantidad + " x " + precio + " = " + getTotal();
    }
}
