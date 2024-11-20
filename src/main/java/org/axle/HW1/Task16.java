package org.axle.HW1;

/**
 * Задача 16: Проверка на делимость с остальным значением
 * Создайте функцию, которая принимает два числа и проверяет, делится ли первое число на второе с остатком равным 2.
 * Верните true, если делится с остатком 2, и false — если нет.
 */
public class Task16 {

    boolean isDevide1To2(int a, int b){
        try{
            if(a % b == 2){
                return true;
            }
        } catch (ArithmeticException e){
            System.out.println("Devision by 0 is not accessible! Enter another value.");
         } return false;
    }
}
