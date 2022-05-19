package ru.gb.lesson2;

public class hw2 {
    public static int generateRandomNumber(int num) {
        return (int)Math.round(Math.random() * (double)num);
    }

    public static void sumtf(int a, int b) {
        System.out.println("First number: " + a + "\nSecond number: " + b);
        if (a + b <= 20 && a + b >= 10) {
            System.out.println("True");
        } else System.out.println("False");
    }
    public static void numSign(int a) {
        System.out.print("The number is: " + a + ", ");
        if (a >= 0) {
            System.out.println("it is positive");
        }
        else System.out.println("it is negative");
        }

    public static boolean numSignBoolean(int a){
        return ( a < 0);

    }

    public static void printNumberOfStrings(String a, int b) {

        for (int i = 1; i <= b; i++) {
            System.out.print(a);
            System.out.println(i +"-я овца");
        }
    }

    public static boolean leapYear(int year){
        return ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0 ));
    }
    public static void main(String[] args) {

        int a = - generateRandomNumber(5);
        int b = generateRandomNumber(15);
        int c = generateRandomNumber(100) - 50;
        System.out.println("1st task:");
        sumtf(a, b);
        System.out.println("2nd task:");
        numSign(c);
        System.out.println("3rd task:");
        System.out.println(numSignBoolean(a));
        System.out.println(numSignBoolean(b));
        System.out.println("4th task:");
        printNumberOfStrings("Через забор прыгнула ", 4);
        System.out.println("5th task:");
        System.out.println(leapYear(800));
        System.out.println(leapYear(300));
        System.out.println(leapYear(812));
        System.out.println(leapYear(113));
    }
}






