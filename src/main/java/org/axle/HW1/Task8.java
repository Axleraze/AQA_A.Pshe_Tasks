package org.axle.HW1;

/**
 * Задача 8: Проверка делимости на 2 или 3
 * Напишите функцию, которая принимает число и возвращает true, если оно делится на 2 или на 3,
 * и false в противном случае.
 */
public class Task8 {
    boolean isDevideTo3or3 (int num){
        if(num != 0) {
            if (num % 2 == 0 || num % 3 == 0) {
                return  true;
            }
            return false;
        }
        return false;
    }

    boolean isDevideTo3or3 (long num){
        if (num % 2 == 0 || num % 3 == 0)  {
            return  true;
        }
        return false;
    }

}
