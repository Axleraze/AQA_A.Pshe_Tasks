package org.axle.HW2;

/**
 * Задача 15. Класс "Круг"
 * 1.	Создайте класс Circle с полями:
 *  	radius (радиус, тип double).
 * 2.	Реализуйте:
 *  	Конструктор с параметром radius.
 *  	Методы:
 * calculateCircumference(), возвращает длину окружности.
 * calculateArea(), возвращает площадь круга.
 * Метод printCircleInfo(), который выводит:
 * Круг: Радиус = <radius>, Площадь = <area>, Длина окружности = <circumference>
 * 3.	В методе main создайте круг и выведите его данные.
 */
public class Circle {
    private   double radius;
    final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateCircumference(){
        double lenth = 2 * pi * radius;
        return lenth;
    }

    double calculateArea(){
        double aria = pi * (radius * radius);
        return aria;
    }

    void printCircleInfo(){
        String info = ("Круг: Радиус = " + getRadius() + ", Площадь = " + calculateArea() + ", Длина окружности = " + calculateCircumference());
        System.out.println(info);
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
