package org.axle.HW1;

/**
 *   Задача 2: Определение принадлежности числа интервалу
 * Создайте функцию, которая принимает число и проверяет, входит ли оно в интервал от 10 до 20 включительно.
 * Если число попадает в интервал, верните true, иначе — false.
 */
public class Task2 {

    boolean isInInterval10and20(int num){
            if(num >=10 && num <= 20){
                return true;
            }
        return false;
    }

    boolean isInInterval10and20(double num){
        if(num >=10.0 && num <= 20.0){
            return true;
        }
        return false;
    }

    boolean isInInterval10and20(float num){
        if(num >=10f && num <= 20f){
            return true;
        }
        return false;
    }
}
