package org.axle.HW1;

/**
 * Задача 11: Проверка суммы на четность и кратность 10
 * Реализуйте функцию, которая принимает два числа и возвращает "Even and Divisible by 10", если их сумма четная
 * и делится на 10, "Even but not Divisible by 10", если сумма четная, но не делится на 10, и "Odd", если сумма нечетная.
 *
 */

public class Task11 {

    String checkEvenAndDivTo10 (int a, int b){
        int sumAB = a+b;
        if(sumAB % 2 != 0){
            return "Odd";
        } else {
            if(sumAB % 10 == 0){
                return "Even and Divisible by 10";
            }
            return "Even but not Divisible by 10";
        }
    }

    String checkEvenAndDivTo10 (long a, long b){
        long sumAB = a+b;
        if(sumAB % 2 != 0){
            return "Odd";
        } else {
            if(sumAB % 10 == 0){
                return "Even and Divisible by 10";
            }
            return "Even but not Divisible by 10";
        }
    }

}
