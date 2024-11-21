package org.axle.HW2;

/**
 * Задача 5. Класс "Студент"
 * 1.	Создайте класс Student с полями:
 *  	name (имя, тип String),   	studentId (идентификатор студента, тип int),
 *  	gpa (средний балл, тип double).
 * 2.	Реализуйте:
 *  	Конструктор для всех полей.  	Геттеры и сеттеры.
 * Метод printStudentDetails(), который выводит:
 * Студент: <name>, ID: <studentId>, GPA: <gpa>
 * 3.	В методе main создайте массив из объектов Student, заполните его, и выведите данные каждого студента.
 */
public class Student {
    private String name;
    private int studentId;
    private double dpa;

    public Student(String name, int studentId, double dpa) {
        this.name = name;
        this.studentId = studentId;
        this.dpa = dpa;
    }


    void printStudentDetails(){
        String info = ("Студент: " + getName() + ", ID: " + getStudentId() + ", GPA:" + getDpa());
        System.out.println(info);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getDpa() {
        return dpa;
    }

    public void setDpa(double dpa) {
        this.dpa = dpa;
    }
}
