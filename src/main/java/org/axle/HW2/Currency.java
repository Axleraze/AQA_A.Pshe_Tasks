package org.axle.HW2;

/**
 * Задача 7. Класс "Курс Валют"
 * 1.	Создайте класс Currency с полями:
 *  	name (название валюты, тип String),
 *  	rateToUSD (курс валюты к доллару США, тип double).
 * 2.	Реализуйте:
 *  	Конструктор для инициализации полей.
 *  	Геттеры и сеттеры.
 *  	Метод convertToUSD(double amount), который возвращает сумму в долларах для заданного количества валюты.
 * Метод printCurrencyInfo(), который выводит:
 * Валюта: <name>, Курс к USD: <rateToUSD>
 * 3.	В методе main создайте объект валюты, выведите курс и выполните конвертацию заданной суммы в USD.
 */
public class Currency {
    private String name;
    private double rateToUSD;


    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    double convertToUSD(double amount){
        return amount * rateToUSD;
    }

   void printCurrencyInfo(){
        String info = (" Валюта: " + getName() + ", Курс к USD:" + getRateToUSD());
   }


       // get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }
}
