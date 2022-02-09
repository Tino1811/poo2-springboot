package com.poo2springboot.poo2;


import org.springframework.stereotype.Component;

@Component
public class ComponenteImplement implements ComponenteDependency{
    @Override
    public void saludar(){
        System.out.println("Hola mundo mi primer componente");
    }
}
