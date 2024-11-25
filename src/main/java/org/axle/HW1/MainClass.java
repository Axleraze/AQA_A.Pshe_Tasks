package org.axle.HW1;

public class MainClass {
    public static void main(String[] args) {

        // Task 1
        Task1 t1 = new Task1();
        boolean resultTask1 = t1.isDevideTo5And7(48);
//        System.out.println(resultTask1);

        // Task 2
        Task2 t2 = new Task2();
        boolean resultTask2 = t2.isInInterval10and20(9.99);
//        System.out.println(resultTask2);

        // Task 3
        Task3 t3 = new Task3();
        boolean resultTask3 = t3.isIsSquareOf(2.1, 4.42);
//        System.out.println(resultTask3);

        // TaskUpda 4
        Task4 t4 = new Task4();
        boolean resultTask4 = t4.is5AtTheEnd(6.358);
        boolean ressultMethod2 = t4.is5AtTheEndOtheMethod(6.3505);
        System.out.println(resultTask4);
        System.out.println(ressultMethod2);

        // Task 5
        Task5 t5 = new Task5();
        boolean resultTask5 =  t5.isSummEven(22.5464);
//        System.out.println(resultTask5);

        // Task 6
        Task6 t6 = new Task6();
        boolean returnTask6 = t6.isModEqual(5.023, -5.024);
//        System.out.println(returnTask6);

        // Task 7
        Task7 t7 = new Task7();
        String returnTask7 = t7.checkPosNegZer(0.00001);
    //    System.out.println(returnTask7);

    // Task 8
        Task8 t8 = new Task8();
        boolean resultTask8 = t8.isDevideTo3or3(700000004);
//        System.out.println(resultTask8);

    // Task 9
        Task9 t9 = new Task9();
        String resultTask9 = t9.sumOddorEven(2147483649l, 2147 );
//        System.out.println(resultTask9);


    // Task 10
    Task10 t10 = new Task10();
    boolean resultTask10 = t10.isDevideTo4Or6(48);
//        System.out.println(resultTask10);

    // Task 11
    Task11 t11 = new Task11();
    String resultTask11 = t11.checkEvenAndDivTo10(15, 2);
//        System.out.println(resultTask11);

   // Task 12
    Task12 t12 = new Task12();
    double resultTask12 = t12.findMax(8.5, 66, 1);
//    System.out.println(resultTask12);

    // Task 13
    Task13 t13 = new Task13();
    boolean resultTask13 = t13.isPalindrom(2223340433222l);
//        System.out.println(resultTask13);

    // Task 14
        Task14 t14 = new Task14();
//        System.out.println(t14.checkMultipleTo3(4,10));

    // Task 15
        Task15 t15 = new Task15();
        String category = t15.simplePersonCategory(-9);
//        System.out.println(category);

    // Task 16
        Task16 t16 = new Task16();
        boolean resultTask16 =  t16.isDevide1To2(8, 3);
//        System.out.println(resultTask16);

    }
}

