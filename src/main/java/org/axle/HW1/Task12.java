package org.axle.HW1;

/**
 * Задача 12: Максимум трех чисел
 * Напишите функцию, которая принимает три числа и возвращает наибольшее из них.
 */
public class Task12 {

    int findMax(int a, int b, int c){
        if(a > b){
            if(a > c){
                return a;
            }
            return c;
        } else if (b > c){
            return b;
        } return c;
    }

    long findMax(long a, long b, long c){
        if(a > b){
            if(a > c){
                return a;
            }
            return c;
        } else if (b > c){
            return b;
        } return c;
    }

//    long findMax(int a, long b, double c){
//        if(a > b){
//            if(a > c){
//                return a;
//            }
//            return c;
//        } else if (b > c){
//            return b;
//        } return c;
//    }

    double findMax(double a, double b, double c){
        if(a > b){
            if(a > c){
                return a;
            }
            return c;
        } else if (b > c){
            return b;
        } return c;
    }

}
