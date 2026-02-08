package org.designpatterns.Singleton;

public class Singleton
{
    private static Singleton instance ;
    private String name ;
    private Singleton(){
        System.out.println("No work");
        this.name = "JJJJJ";
    }

    public static Singleton getInstance(){
        if (instance == null){
            System.out.println("NEW instace created");
            instance = new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
