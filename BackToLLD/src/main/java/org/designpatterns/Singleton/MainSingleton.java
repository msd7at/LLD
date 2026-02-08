package org.designpatterns.Singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        System.out.println("system 1 : " + singletonInstance.getName());
        Singleton singletonInstancetwo = Singleton.getInstance();
        System.out.println("system 2 : " + singletonInstancetwo.getName());
    }


}
