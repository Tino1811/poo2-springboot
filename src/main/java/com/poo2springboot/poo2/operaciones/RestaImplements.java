package com.poo2springboot.poo2.operaciones;

import org.springframework.stereotype.Component;

@Component
public class RestaImplements implements RestaDependency {
    @Override
    public void respuesta(){
        int num1 = 10, num2 = 5, respuesta = 0;
        respuesta = num1 - num2;

        System.out.println("El resultado de la resta es:"  + respuesta);
    }
}

