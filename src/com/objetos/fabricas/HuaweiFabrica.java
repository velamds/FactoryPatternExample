package com.objetos.fabricas;

import com.objetos.productos.Celular;
import com.objetos.productos.Y7;

public class HuaweiFabrica implements Fabrica{
    @Override
    public Celular CrearCelu() {
        return new Y7();
    }
}
