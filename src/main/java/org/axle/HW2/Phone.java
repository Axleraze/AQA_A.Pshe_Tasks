package org.axle.HW2;

/**
 * Задача 8. Класс "Телефон"
 * 1.	Создайте класс Phone с полями:
 *  	brand (бренд телефона, тип String),  *  	model (модель телефона, тип String),
 *  	price (цена телефона, тип double).
 * 2. 	    Реализуйте:  *  	Конструктор для всех полей.  *  	Геттеры и сеттеры.
 *  	Метод applyDiscount(double percentage), который уменьшает цену на заданный процент.
 *      Метод printPhoneDetails(), который выводит:
 * Телефон: <brand> <model>, Цена: <price>
 * 3.	В методе main создайте телефон, примените скидку и выведите его характеристики.
 */
public class Phone {
    private String brand;
    private String model;
    private double prise;

    public Phone(String brand, String model, double prise) {
        this.brand = brand;
        this.model = model;
        this.prise = prise;
    }


    protected void applyDiscount(double percentage){
        if(percentage >= 0){
        double newPrise = prise - (prise * percentage / 100);
        setPrise(newPrise);
        } else System.out.println("Incorrect percentage!");
    }

    public void printPhoneDetails(){
        String info = ("Телефон: " + getBrand() + " " + getModel() + ", Цена: " + getPrise());
        System.out.println(info);
    }



    // get set
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}
