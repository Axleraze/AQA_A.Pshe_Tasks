package org.axle.HW2;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача 13. Класс "Клиент Интернет-магазина"
 * 1.	Создайте класс Customer с полями:
 *  	name (имя клиента, тип String),	email (почта, тип String), purchaseHistory (история покупок, тип List<String>).
 * 2.	Реализуйте:
 *  	Конструктор для имени и почты.
 *  	Методы:
 * addPurchase(String item), добавляет товар в историю покупок.
 * printPurchaseHistory(), выводит:  * Клиент: <name>, История покупок: <history>
 * 3.	В методе main создайте клиента, добавьте несколько покупок и выведите историю.
 */
public class Customer {
     String name;
     String email;
     List<String> purchaseHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

   void addPurchase(String item){
        purchaseHistory.add(item);
   }

   void printPurchaseHistory(){
        String info = ("Клиент: " + name + " , История покупок: " + purchaseHistory);
       System.out.println(info);
   }

}
