package org.axle.HW2;

/**
 * Задача 4. Класс "Товар"
 * 1.	Создайте класс Product с полями:
 *  	name (название товара, тип String),  *  	category (категория товара, тип String),
 *  	quantity (количество, тип int),  *  	pricePerUnit (цена за единицу, тип double).
 * 2.	Реализуйте:
 *  	Конструктор с параметрами для всех полей.  *  	Геттеры и сеттеры.
 *  	Метод calculateTotalPrice(), который возвращает общую стоимость товара (quantity * pricePerUnit).
 *       Метод printProductInfo(), который выводит:
 * Товар: <name>, Категория: <category>, Количество: <quantity>, Общая стоимость: <totalPrice>
 * 3.	В методе main создайте объект, измените количество через сеттер, а затем выведите полную информацию о товаре.
 */
public class Product {
    private String name;
    private String category;
    private int quantity;
    private double pricePerUnit;

// Constructor. Checks and restrictions for negative value are not implemented
    public Product(String name, String category, int quantity, double pricePerUnit) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    protected double calculateTotalPrice(int quantity, double pricePerUnit){
        double totalPrise = quantity * pricePerUnit;
        return totalPrise;
    }

   void printProductInfo(){
        String info = ("Товар: " + getName() + ",  Категория: " + getCategory() + ",  Количество: "  + getQuantity() +
                ", Общая стоимость:  " + calculateTotalPrice(quantity, pricePerUnit));
       System.out.println(info);
   }



    // Get-Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
