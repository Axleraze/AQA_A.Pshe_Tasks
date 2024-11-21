package org.axle.HW2;

/**
 * Задача 9. Класс "Сотрудник"
 * 1.	Создайте класс Employee с полями:
 *  	name (имя сотрудника, тип String), position (должность, тип String), salary (зарплата, тип double).
 * 2.	Реализуйте:
 *  	Конструктор для всех полей.  	Геттеры и сеттеры.
 *  	Методs
 * 	increaseSalary(double percentage), который увеличивает зарплату на заданный процент.
 *     printEmployeeInfo(), который выводит:
 * Сотрудник: <name>, Должность: <position>, Зарплата: <salary>
 * 3.	В методе main создайте нескольких сотрудников, увеличьте их зарплату и выведите их данные.
 */
public class Empoyee {
    private String name;
    private String position;
    private double salary;

    // Constructor. Checks and restrictions for negative value are not implemented
    public Empoyee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    protected void increaseSalary(double percentage){
        if(percentage >= 0){
            double newSalary = salary + (salary * percentage / 100);
            setSalary(newSalary);
        } else System.out.println("Incorrect percentage!");
    }

    public void printEmployeeInfo(){
        String info = ("Сотрудник: " + getName() + ", Должность: " + getPosition() + ", Зарплата: " + getSalary());
        System.out.println(info);
    }



    // getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
