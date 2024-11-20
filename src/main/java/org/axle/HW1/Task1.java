package org.axle.HW1;
/**
 * Задача 1: Проверка делимости на 5 и 7
 * Напишите функцию, которая принимает целое число и возвращает true, если оно делится на 5 и на 7 одновременно,
 * и false в противном случае.
 */
public class Task1 {

    boolean isDevideTo5And7(int num){
        if(num != 0) {
            if (num % 5 == 0 && num % 7 == 0) {
                return  true;
            }
            return false;
        }
    return false;
    }

    boolean isDevideTo5And7(long num){
            if (num % 5 == 0 && num % 7 == 0) {
                return  true;
            }
        return false;
    }


}