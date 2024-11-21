package org.axle.HW2;

/**
 * Задача 14. Класс "Компания"
 * 1.	Создайте класс Company с полями:
 *  	name (название компании, тип String),
 *  	employees (количество сотрудников, тип int),
 *  	revenue (доход, тип double).
 * 2.	Реализуйте:  	Конструктор для всех полей.  	Геттеры и сеттеры.
 * Метод printCompanyInfo(), который выводит:
 * Компания: <name>, Сотрудников: <employees>, Доход: <revenue>
 * 3.	В методе main создайте объект компании и выведите его данные.
 */
public class Company {
    private String name;
    private int emploees;
    private double revenue;


    public Company(String name, int emploees, double revenue) {
        this.name = name;
        this.emploees = emploees;
        this.revenue = revenue;
    }


    void printCompanyInfo(){
        String info = ("Компания: " + getName() + ", Сотрудников: " + getEmploees() + ", Доход: " + getRevenue());
        System.out.println(info);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmploees() {
        return emploees;
    }

    public void setEmploees(int emploees) {
        this.emploees = emploees;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
