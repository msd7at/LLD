package org.designpatterns.factory;

import org.designpatterns.factory.interfaces.CheezePizza;
import org.designpatterns.factory.interfaces.NormalPizza;
import org.designpatterns.factory.interfaces.Pizza;

public class PizzaFactory {

    public static Pizza getPizza(String type){
            switch (type.toLowerCase()){
                case "cheese" :
                    return new CheezePizza();
                case "normal":
                    return  new NormalPizza();
                default:
                    System.out.println("Invalid Pizza");
                    return null;

            }
    }
}

