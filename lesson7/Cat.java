package ru.gb.lesson7;

public class Cat {
    private String name;
    private int hunger;
    private static boolean satiety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        Cat.satiety = satiety;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public Cat(String name, int hunger, boolean satiety) {
        this.name = name;
        Cat.satiety = satiety;
        this.hunger = hunger;
    }
    public void eat(Plate p) {
        int food = Plate.getFood();
        if (food >= hunger) {
            p.eatFood(hunger);
            System.out.println(name + " ate " + hunger + "g of food");
            satiety = true;
            food -= hunger;
        }
        else {
            System.out.println(name + " needs to eat more than this amount");
            satiety = false;
        }
    }
    public void catHungerInfo() {
        System.out.println((satiety == false) ? name + " is still hungry" : name + " is sated");
    }
}
