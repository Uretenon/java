package ru.gb.lesson7;

public class hw7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Tom", 50, false);
        cats[1] = new Cat("Cherry", 35, false);
        cats[2] = new Cat("Jay", 40, false);
        cats[3] = new Cat("Simon", 90, false);
        cats[4] = new Cat("Norton", 60, false);
        Plate plate = new Plate(270);
        plate.info();
        int i;
        int hunger;
        int food;
        for (i = 0; i < 5; i++) {

            hunger = cats[i].getHunger();
            food = plate.getFood();
            cats[i].eat(plate);
            if (hunger > food) {
                cats[i].catHungerInfo();
            } else {
                cats[i].catHungerInfo();
                System.out.println();
                plate.info();

            }
        }

        plate.addFood(50);
        plate.info();
    }
}
