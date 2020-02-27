package com;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    @Test
    public void calcular(){
        Producto prod1 = new Articulo("jabon",5,15);
        Producto prod2 = new Servicio("jabon",15);
        Assert.assertEquals("no calculo de forma correcta",15,prod1.calcularTarifa());
        Assert.assertEquals("no calculo de forma correcta",15,prod2.calcularTarifa());
    }
}