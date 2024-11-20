package org.axle.HW1;

/**
 *
 Задача 14: Кратность чисел и их сумма
 Реализуйте функцию, которая принимает два числа. Если оба числа кратны 3, верните их сумму;
 если одно из них кратно 3, верните удвоенное значение второго числа;
 если ни одно не кратно 3, верните null.
 */
public class Task14 {

    Object checkMultipleTo3 (int a, int b){
        if(a % 3 == 0 && b % 3 == 0){
            return a+b;
        } else if (a % 3 == 0 || b % 3 == 0) {
            return  b * b;
        } else {
            return null;
        }
    }

    Object checkMultipleTo3 (long a, long b){
        if(a % 3 == 0 && b % 3 == 0){
            return a+b;
        } else if (a % 3 == 0 || b % 3 == 0) {
            return  b * b;
        } else {
            return null;
        }
    }

}
