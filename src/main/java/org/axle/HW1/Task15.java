package org.axle.HW1;

/**
 *  Задача 15: Проверка возраста на категорию
 *  Напишите функцию, которая принимает возраст и возвращает категорию: Child (до 12 лет),
 *  Teenager (от 13 до 17 лет), Adult (от 18 до 64 лет) или Senior (от 65 лет и старше).
 */
public class Task15 {

    String simplePersonCategory(int old){
        if(old > 0){
            if(old > 0 && old <= 12){
                return "Child";
            } else if (old >= 13 && old <= 17) {
                return  "Teenager";
            } else if (old >= 18 && old <= 64) {
                return "Adult";
            }
            return "Senior";
        }
        return "Incorrect. Age can not be less then 0";
    }


}
