package org.axle.HW2;

/**
 * Задача 3. Класс "Машина"
 * 1.	Создайте класс Car с полями:
 * ○	brand (бренд, тип String),  * ○	model (модель, тип String),
 * ○	year (год выпуска, тип int),  * ○	price (цена, тип double).
 * 2.	Реализуйте:
 * ○	Конструктор, который принимает параметры brand, model, year.
 * ○	Методы:  * ■	getBrand(), getModel(), getYear() и getPrice().  * ■	setPrice(double price).
 * Метод printCarInfo(), который выводит:
 * Бренд: <brand>, Модель: <model>, Год: <year>, Цена: <price>
 */
public class Car {
    private String brand;
    private String model;
    private int year;
    private double prise;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    protected void printCarInfo(){
        String info = ("Бренд: " + getBrand() + ", Модель: " + getModel() + ", Год: " + getYear() + ", Цена: " + getPrise()) ;
        System.out.println(info);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}
