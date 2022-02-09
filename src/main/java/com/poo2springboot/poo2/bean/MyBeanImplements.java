package com.poo2springboot.poo2.bean;

public class MyBeanImplements implements MyBean{
    @Override
    public void imprimir() {
        System.out.println("Hola mi primera implementacion BEAN");
    }
}
