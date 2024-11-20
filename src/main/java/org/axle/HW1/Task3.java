    package org.axle.HW1;
import java.lang.Math;
/**
 *
 * Задача 3: Проверка на квадрат числа
 * Напишите функцию, которая принимает два числа и возвращает true, если одно из чисел является квадратом другого,
 * и false в противном случае.
 */

public class Task3 {

    boolean  isIsSquareOf(int one, int two){
        if(one == Math.pow(two, 2) || two == Math.pow(one, 2)){
            return true;
        }
        return false;
    }

    boolean  isIsSquareOf(double one, double two){
        if(one == Math.pow(two, 2) || two == Math.pow(one, 2)){
            return  true;
        }
        return false;
    }

    boolean  isIsSquareOf(long one, long two){
        if((int) one == Math.pow((int) two, 2) || (int) two == Math.pow((int) one, 2)){
            return  true;
        }
        return false;
    }

}

