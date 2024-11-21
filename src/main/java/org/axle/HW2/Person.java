package org.axle.HW2;

/**
 * Задача 2. Класс "Человек"
 * 1.	Создайте класс Person с полями:
 * ○	name (имя, тип String),  * ○	age (возраст, тип int),  * ○	gender (пол, тип String).
 * * 2.	Реализуйте:
 * ○	Конструктор с параметрами name и age.
 * ○	Конструктор по умолчанию (без параметров).
 * ○	Геттеры и сеттеры.
 * Добавьте метод printInfo(), который выводит информацию о человеке в формате:
 * Имя: <name>, Возраст: <age>, Пол: <gender>
 * 3.	В методе main создайте несколько объектов класса Person, вызовите метод printInfo() для каждого объекта.
 */
public class Person {
    private    String name;
    private     int age;
    private     String gender;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }


    protected void printInfo(){
        String info = ("Имя: " + getName() + ",  Возраст: " + getAge() + ",  Пол: " + getGender());
        System.out.println(info);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
