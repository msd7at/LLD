package org.designpatterns.factory.interfaces;

public class CheezePizza implements  Pizza{

    @Override
    public void bake() {
        System.out.println("Baking  Cheese");
    }
}
