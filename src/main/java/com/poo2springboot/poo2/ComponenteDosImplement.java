package com.poo2springboot.poo2;


import org.springframework.stereotype.Component;

@Component
public class ComponenteDosImplement implements ComponenteDependency {
    @Override
    public void saludar(){
        System.out.println("Hola mundo el segundo componente");
    }
}
