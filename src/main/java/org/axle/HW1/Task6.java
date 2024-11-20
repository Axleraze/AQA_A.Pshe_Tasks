package org.axle.HW1;

/**
 * Задача 6: Сравнение двух чисел по модулю
 * Напишите функцию, которая принимает два числа и возвращает true, если модули чисел равны, и false в противном случае.
 */
public class Task6 {

      boolean isModEqual(int a, int b){
            a = Math.abs(a);
            b = Math.abs(b);
            if(a == b){
                  return true;
            }
            return false;
      }

      boolean isModEqual(long a, long b){
            a = Math.abs(a);
            b = Math.abs(b);
            if(a == b){
                  return true;
            }
            return false;
      }

      boolean isModEqual(double a, double b){
            a = Math.abs(a);
            b = Math.abs(b);
            if(a == b){
                  return true;
            }
            return false;
      }
}
