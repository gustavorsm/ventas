package com;

public class Articulo extends Producto {

    private Integer saldo;

    public Articulo(String nombre, Integer saldo, Integer precio) {
        super(nombre,precio);
        this.saldo = saldo;
    }

    @Override
    public boolean estaDisponible(Integer cantidad){
        boolean disponible;
        if(cantidad <= this.saldo)
            disponible = true;
        else
            disponible = false;
        return true;
    }

    @Override
    public Integer calcularTarifa(){
        return getPrecio();
    }
}
