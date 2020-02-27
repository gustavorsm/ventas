package com;

public abstract class Producto {

    private String nombre;
    private Integer precio;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    protected abstract boolean estaDisponible(Integer cantidad);

    protected abstract Integer calcularTarifa();
}
