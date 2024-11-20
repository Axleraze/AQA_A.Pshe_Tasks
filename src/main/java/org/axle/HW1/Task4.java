package org.axle.HW1;

/**
 * Задача 4: Проверка последней цифры
 * Создайте функцию, которая принимает число и проверяет, заканчивается ли оно на 5.
 * Верните true, если заканчивается, и false, если нет.
 */
public class Task4 {

    boolean is5AtTheEnd(int num){
        if(num != 0){
            if(num % 5 == 0 && num % 10 != 0){
                return true;
            }
            return false;
        }
        return false;
    }


    boolean is5AtTheEnd(long num){
            if(num % 5 == 0 && num % 10 != 0){
                return true;
        }
        return false;
    }

// other posibility to convert non-Integer value and check
    boolean is5AtTheEnd(double num){
        Double objNum = num;
        String strNum = objNum.toString(); // convert number to string
        char lastChar = strNum.toCharArray()[strNum.toCharArray().length - 1]; // get last index from congerted to array string
        if(lastChar == '5'){
            return true;
        }
        return false;
    }

}

