package ru.gb.lesson7;



public class Plate {
    private static int food;

    public static int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void eatFood(int amount) {
        if (food < amount)
            System.out.println("Plate has less food than needed");
        else food -= amount;
    }
    public void addFood(int amount){
        food +=amount;
        System.out.println(amount + "g to the plate added");
    }
    public void info() {
        System.out.println("plate has " + food + "g of food");
    }

}
