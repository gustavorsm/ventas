package com;

public class Servicio extends Producto {

    public Servicio(String nombre,Integer precio){
        super(nombre,precio);
    }
    @Override
    public boolean estaDisponible(Integer cantidad){
        return true;
    }
    @Override
    public Integer calcularTarifa(){
        return getPrecio();
    }
}
