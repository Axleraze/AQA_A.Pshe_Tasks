package org.axle.HW1;

/**
 * Задача 7: Проверка знака числа
 * Создайте функцию, которая принимает число и возвращает "Positive", если оно положительное,
 * "Negative", если оно отрицательное, и "Zero", если оно равно нулю.
 */
public class Task7 {
    String checkPosNegZer(int num){
        if(num > 0){
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        }
        return "Zero";
    }

    String checkPosNegZer(long num){
        if(num > 0){
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        }
        return "Zero";
    }


    String checkPosNegZer(double num){
        if(num > 0){
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        }
        return "Zero";
    }
}
