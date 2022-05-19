package ru.gb.lesson5;

public class hw5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan ", "Engineer ", "ivivan@mailbox.com ", "892312312 ", 30000, 30);
        employees[1] = new Employee("Kolesov Vasiliy ", "Accountant ", "kolesvasya@hotmail.com ", "89174432145 ", 40000, 42);
        employees[2] = new Employee("Arinova Arina ", "Lab worker ", "ariari@gmail.com ", "89841234231 ", 20000, 25);
        employees[3] = new Employee("Kotov Oleg ", "Director ", "kotovoleg1337@ya.ru ", "89371604607 ", 120000, 47);
        employees[4] = new Employee("Makov Alexey ", "Manager ", "maklexa234@mail.ru ", "89476547108 ", 60000, 34);
        for (int i = 0; i < 5; i++){
        if (employees[i].age >= 40) {
                employees[i].info();
            }
        }
    }
}
