package com.objetos.fabricas;

import com.objetos.productos.Celular;
import com.objetos.productos.Note8;

public class RedmiFabrica implements Fabrica{
    @Override
    public Celular CrearCelu() {
        return new Note8();
    }
}
