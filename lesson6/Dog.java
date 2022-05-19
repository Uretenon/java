package ru.gb.lesson6;

public class Dog extends Animal {
    String color;
    private static int dogCount;
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        dogCount++;
    }

    public static int getDogCount(){
        return dogCount;
    }
    @Override
    void run(int metre){
        if (metre <= 500)
            System.out.println(name + " ran " + metre + "m");
        else
            System.out.println(name + " is a dog, it cannot run more than 500m");
    }
    @Override
    void swim(int metre){
        if (metre <= 10)
            System.out.println(name + " swam " + metre + "m");
        else
            System.out.println(name + " is a dog, it cannot swim more than 10m");
    }

    public void dogInfo() {
        System.out.println("Dog's name: " + name + " color: " + color);
    }
}
