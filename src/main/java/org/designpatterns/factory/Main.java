package org.designpatterns.factory;

import org.designpatterns.factory.interfaces.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza chese = PizzaFactory.getPizza("cheese");
        Pizza nor = PizzaFactory.getPizza("normal");
        Pizza non = PizzaFactory.getPizza("xxx");

        if (chese != null){
            chese.bake();
        }
        else {
            System.out.println("Main : chese empty");
        }
        if (nor != null){
            nor.bake();
        }
        else {
            System.out.println("Main : nor empty");
        }
        if (non != null){
            non.bake();
        }
        else {
            System.out.println("Main : nom empty");
        }
    }
}
