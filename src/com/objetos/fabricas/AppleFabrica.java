package com.objetos.fabricas;

import com.objetos.productos.Celular;
import com.objetos.productos.iPhone13;

public class AppleFabrica implements Fabrica{
    @Override
    public Celular CrearCelu() {
        return new iPhone13();
    }
}
