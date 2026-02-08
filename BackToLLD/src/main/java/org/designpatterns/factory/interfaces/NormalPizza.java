package org.designpatterns.factory.interfaces;

public class NormalPizza implements  Pizza{
    @Override
    public void bake() {
        System.out.println("Normal Pizza");
    }
}
