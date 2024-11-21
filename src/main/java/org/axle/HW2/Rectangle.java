package org.axle.HW2;

/**
 * Задача 12. Класс "Прямоугольник"
 * 1.	Создайте класс Rectangle с полями:
 *  	width (ширина, тип double),  	height (высота, тип double).
 * 2.	Реализуйте: Конструктор с параметрами для всех полей.  	Геттеры и сеттеры.
 *  	Методы:
 * 	calculateArea(), возвращает площадь прямоугольника.
 * 	calculatePerimeter(), возвращает периметр.
 *  printRectangleInfo(), который выводит:
 * Прямоугольник: Ширина = <width>, Высота = <height>, Площадь = <area>, Периметр = <perimeter>
 * 3.	В методе main создайте объект, выведите его площадь и периметр.
 */
public class Rectangle {
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    double calculateArea(){
        return width * height;
    }


    double calculatePerimeter(){
        return 2 * (width + height);
    }

    void printRectangleInfo(){
        String info = ("Прямоугольник: Ширина = " + getWidth() + ", Высота = " + getHeight() + ", Площадь = " + calculateArea() + ", Периметр = " + calculatePerimeter());
        System.out.println(info);
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
