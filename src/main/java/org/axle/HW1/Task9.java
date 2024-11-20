package org.axle.HW1;

/**
 Задача 9: Четность суммы двух чисел
 Создайте функцию, которая принимает два числа и возвращает "Even", если сумма чисел четная, и "Odd", если нечетная.
 */
public class Task9 {

    String sumOddorEven(int a, int b){
        if((a + b) != 0){
            if((a + b) % 2 == 0){
                return "Even";
            }
            return "Odd";
        }  return "";
    }

    String sumOddorEven(long c, long d){
            if((c + d) % 2 == 0){
                return "Even";
            }
            return "Odd";
    }

    String sumOddorEven(int a, long c){
        if((a + c) % 2 == 0){
            return "Even";
        }
        return "Odd";
    }



}


