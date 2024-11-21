package org.axle.HW2;

/**
 * Задача 10. Класс "Треугольник"
 * 1.	Создайте класс Triangle с полями:
 *  	a (сторона A, тип double), 	b (сторона B, тип double), 	c (сторона C, тип double).
 * 2.	Реализуйте:
 *  	Конструктор для всех сторон.  	Геттеры и сеттеры.
 *  	Метод calculatePerimeter(), который возвращает периметр треугольника.
 *  	Метод calculateArea(), который возвращает площадь треугольника по формуле Герона.
 *  	Метод printTriangleInfo(), который выводит стороны, периметр и площадь.
 * 3.	В методе main создайте объект треугольника и выведите его данные.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculatePerimeter(){
        double perimeter = a + b + c;
        return perimeter;
    }

//формуле Герона: S = √(p * (p - a) * (p - b) * (p - c)),
// где a, b и c - длины сторон треугольника; p - полупериметр треугольника: p = (a + b + c) / 2.
    double calculateArea(){
        double p = calculatePerimeter() / 2;
        double aria = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return aria;
    }

    void printTriangleInfo(){
        String info = (" Side A:  " + getA() + ", Side B: " + getB() + ", Side C: " + getC() + "\n Prtimeter: "
                + calculatePerimeter() + ", Aria: " + calculateArea());
        System.out.println(info);
    }



// getters setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
