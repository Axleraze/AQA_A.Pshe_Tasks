package org.axle.HW2;

/**
 * Задача 1. Создание класса "Книга"
 * 1.	Создайте класс Book с полями:
 * ○	title (название книги, тип String),
 * ○	author (автор, тип String),
 * ○	price (цена, тип double).
 * 2.	Реализуйте:
 * ○	Конструктор, который принимает все поля.
 * ○	Геттеры и сеттеры для каждого поля.
 * 3.	В методе main создайте объект класса Book, измените через сеттеры автора и цену,
 * а затем выведите в консоль информацию о книге.
 */
public class Book {
   private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
