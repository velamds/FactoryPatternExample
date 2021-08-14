package com.objetos;

import com.objetos.fabricas.AppleFabrica;
import com.objetos.fabricas.Fabrica;
import com.objetos.fabricas.HuaweiFabrica;
import com.objetos.productos.Celular;

public class Main {

    public static void main(String[] args) {
        Fabrica appleF = new AppleFabrica();
        Celular iphone = appleF.CrearCelu();

        System.out.println(iphone.Encender());
        System.out.println(iphone.Apagar());

        Fabrica huaweiF = new HuaweiFabrica();
        Celular y7 = huaweiF.CrearCelu();

        System.out.println(y7.Encender());
        System.out.println(y7.Apagar());
    }
}
