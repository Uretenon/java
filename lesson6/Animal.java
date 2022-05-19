package ru.gb.lesson6;

public class Animal {
    protected String name;
    private static int animalCount;
    public Animal() {
        this.name = name;
        animalCount++;

    }
    public static int getAnimalCount(){
        return animalCount;
    }
    public void animalInfo() {
        System.out.println("Animal's name: " + name);
    }
    void run(int metre) {
        System.out.println(name + " ran " + metre + "m");
    }
    void swim(int metre) {
        System.out.println(name + " swam " + metre + "m");
    }
}

