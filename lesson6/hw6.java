package ru.gb.lesson6;

public class hw6 {
    public static void main(String[] args) {
        Cat catSelem = new Cat ("Selem", "Black");
        catSelem.animalInfo();
        catSelem.catInfo();
        Dog dogRichie = new Dog ("Richie", "Golden");
        dogRichie.animalInfo();
        dogRichie.dogInfo();
        int swim1;
        catSelem.run(50);
        dogRichie.run(550);
        catSelem.swim(523);
        dogRichie.swim(swim1 = 7);
        dogRichie.swim(swim1 += 4);
        System.out.println("\nAnimal number: " + Animal.getAnimalCount() + "\nDog number: " + Dog.getDogCount() + "\nCat number: " + Cat.getCatCount());
    }

}
