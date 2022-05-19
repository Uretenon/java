package ru.gb.lesson5;

public class Employee {
    public String fullName;
    public String occupation;
    public String email;
    public String phoneNum;
    public int wage;
    public int age;

  public Employee(String fullName, String occupation, String email, String phoneNum, int wage, int age) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.email = email;
        this.phoneNum = phoneNum;
        this.wage = wage;
        this.age = age;
  }
    public void info() {
        System.out.println("\nФИО: " + fullName + "\nДолжность: " + occupation + "\nПочта: " + email + "\nНомер телефона: " + phoneNum + "\nЗарплата: " + wage + " \nВозраст: " + age);
    }
}
