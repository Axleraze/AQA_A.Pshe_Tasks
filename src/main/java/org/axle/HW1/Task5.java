package org.axle.HW1;

import com.sun.source.tree.BreakTree;

import java.util.Iterator;

/**
 * Задача 5: Проверка, является ли сумма цифр четной
 * Реализуйте функцию, которая принимает число, суммирует его цифры и возвращает true, если сумма четная,
 * и false, если нечетная.
 */
public class Task5 {


    boolean isSummEven(int num){
        if(num == 0) {
            System.out.println("This is 0. Enter another value.");
            return false;
        } else {
        Integer objNum = Math.abs(num);
        String strNumber = objNum.toString();
        char[] charDigits = strNumber.toCharArray();
        int count = 0;
        for(Character charDig: charDigits){
            int digit = charDig;
            count += digit;
        }
        if (count % 2 == 0){
            return true;
            }
        }
        return false;
     }


    boolean isSummEven(long num){
        num = Math.abs(num);
        Long objNum = num;
        String strNumber = objNum.toString();
        char[] charDigits = strNumber.toCharArray();
        int count = 0;
        for(Character charDig: charDigits) {
            int digit = charDig;
            count += digit;
        }
        if (count % 2 == 0){
            return true;
        }
        return false;
    }

    //165.18
    boolean isSummEven(double num){
        num = Math.abs(num);
        Double objNum = num;
        String strNumber = objNum.toString();
        char[] charDigits = strNumber.toCharArray();
        int counter = 0;
        for(int i = 0; i < charDigits.length; i++){
            if(charDigits[i] != '.'){
               counter +=  Character.getNumericValue(charDigits[i]);
            }
        }
        if (counter % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}


