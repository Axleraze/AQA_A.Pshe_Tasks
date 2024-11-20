package org.axle.HW1;

/**
 * Задача 10: Определение числа, кратного и 4, и 6
 * Создайте функцию, которая проверяет, делится ли число на 4 и на 6 одновременно.
 * Верните true, если да, и false, если нет.
 */
public class Task10 {

        boolean isDevideTo4Or6(int num){
            if(num != 0) {
                if (num % 4 == 0 && num % 6 == 0) {
                    return  true;
                }
                return false;
            }
            return false;
        }

        boolean isDevideTo4Or6(long num){
            if (num % 4 == 0 && num % 6 == 0) {
                return  true;
            }
            return false;
        }
}
