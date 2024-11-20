package org.axle.HW1;

/**
 * Задача 13: Проверка на палиндромность числа
 * Создайте функцию, которая принимает целое число и проверяет, является ли оно палиндромом (например, 121 или 12321).
 * Верните true, если да, и false, если нет.
 */
public class Task13 {

    // 4554
    boolean isPalindrom(Integer num){
        String strNum = num.toString().toLowerCase();
        int strLenth = strNum.length();
        if(strLenth % 2 == 0){   // 456654
            String numPart1 = strNum.substring(0, strLenth / 2);
            StringBuilder numTmp = new StringBuilder(strNum.substring(strLenth / 2));
            String numPart2 = numTmp.reverse().toString();
            if(numPart1.equalsIgnoreCase(numPart2)){
                return  true;
                }
            return false;
            } else {    // 456212654
            String numPart1 = strNum.substring(0, (strLenth -1) / 2);
            StringBuilder numTmp = new StringBuilder (strNum.substring((strLenth-1) / 2 + 1));
            String numPart2 = numTmp.reverse().toString();
            if(numPart1.equalsIgnoreCase(numPart2)){
                return  true;
            }
            return false;
            }
        }

    boolean isPalindrom(Long num){
        String strNum = num.toString().toLowerCase();
        int strLenth = strNum.length();
        if(strLenth % 2 == 0){   // 456654
            String numPart1 = strNum.substring(0, strLenth / 2);
            StringBuilder numTmp = new StringBuilder(strNum.substring(strLenth / 2));
            String numPart2 = numTmp.reverse().toString();
            if(numPart1.equalsIgnoreCase(numPart2)){
                return  true;
            }
            return false;
        } else {    // 456212654
            String numPart1 = strNum.substring(0, (strLenth -1) / 2);
            StringBuilder numTmp = new StringBuilder (strNum.substring((strLenth-1) / 2 + 1));
            String numPart2 = numTmp.reverse().toString();
            if(numPart1.equalsIgnoreCase(numPart2)){
                return  true;
            }
            return false;
        }
    }
    }

