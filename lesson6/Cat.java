package ru.gb.lesson6;

public class Cat extends Animal {
    String color;
    private static int catCount;
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        catCount++;
    }
    public static int getCatCount(){
        return catCount;
    }
    @Override
    void run(int metre){
        if (metre <= 200)
            System.out.println(name + " ran " + metre + "m");
        else
            System.out.println(name + " is a cat, it cannot run more than 200m");
    }

    @Override
    void swim(int metre){
        System.out.println("Cats do not swim");
    }

    public void catInfo() {
        System.out.println("Cat's name: " + name + " color: " + color);
    }
}
