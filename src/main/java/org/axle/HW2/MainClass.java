package org.axle.HW2;

public class MainClass {
    public static void main(String[] args) {

        // Task 1. Class Book
        System.out.println("\t-- Task 1 --");
        Book firstBook = new Book("'The Oldman and the Sea'", "Ernst Heminguey", 5.25);
        firstBook.setAuthor("Ernest Hemingway");
        firstBook.setPrice(6.00);
        System.out.println(firstBook.getTitle() + ", " + firstBook.getAuthor() + ", " + firstBook.getPrice());


        // Task 2. Class Person
        System.out.println("\n\t-- Task 2 --");
        Person firstPerson = new Person("John", 23);
        firstPerson.setGender("M");
        Person secondPerson = new Person("Maria", 35);
        secondPerson.setGender("F");
        firstPerson.printInfo();
        secondPerson.printInfo();


        // Task 3 Class Car
        System.out.println("\n\t-- Task 3 --");
        Car audiCar = new Car("Audi","T6", 2017);
        audiCar.setPrise(15020.00);
        Car bmwCar = new Car("BMW", "A8", 2018);
        bmwCar.setPrise(16500.00);
        audiCar.printCarInfo();
        bmwCar.printCarInfo();


        // Task 4 Class Product
        System.out.println("\n\t-- Task 4 --");
        Product tshirtEs = new Product("Esprit", "tshirt", 10, 5.20);
        tshirtEs.setQuantity(50);
        tshirtEs.printProductInfo();


        // Task 5 Class Student
        System.out.println("\n\t-- Task 5 --");
        Student [] students = new Student[5];
        students[0] = new Student("Lukas", 14, 9.8);
        students[1] = new Student("Marta", 17, 7.8);
        students[2] = new Student("Sabina", 21, 9.1);
        students[3] = new Student("Taras", 6, 8.3);
        students[4] = new Student("Jordan", 23, 6.8);
        for(Student s : students){
            s.printStudentDetails();
        }


        // Task 7 Class Currency
        System.out.println("\n\t-- Task 7 --");
        Currency hrn = new Currency("Hryvnia", 0.024);
        double converted100Hrn = hrn.convertToUSD(100);
        System.out.println("100 HRN is: " + converted100Hrn + " USD");


        // Task 8 Class Phone
        System.out.println("\n\t-- Task 8 --");
        Phone apple = new Phone("Apple", "S-12", 450);
        apple.applyDiscount(10);
        apple.printPhoneDetails();


        // Task 9 Class Empoyee
        System.out.println("\n\t-- Task 9 --");
        Empoyee richard = new Empoyee("Richard Stollman", "System Engeneer", 15000.00);
        Empoyee linus = new Empoyee("Linus Torwalsd", "System Engeneer", 16500.00);
        Empoyee vasia = new Empoyee("Vasilii Bespoleznyi", "Manager", 8400.00);
        richard.increaseSalary(25.0);
        linus.increaseSalary(48.0);
        richard.printEmployeeInfo();
        linus.printEmployeeInfo();
        vasia.printEmployeeInfo();


        // Task 10 Class Tiangle
        System.out.println("\n\t-- Task 10 --");
        Triangle cartman = new Triangle(5, 6, 7);
        cartman.printTriangleInfo();


        // Task 11 Class Player
        System.out.println("\n\t-- Task 11 --");
        Player redPlayer = new Player("Red Beast", 55, 1434);
        redPlayer.levelUp();
        redPlayer.addScore(1111);
        redPlayer.printPlayerInfo();


        // Task 12 Class Rectangle
        System.out.println("\n\t-- Task 12 --");
        Rectangle rkt = new Rectangle(8, 12);
        rkt.printRectangleInfo();


        // Task 13 Class Customer
        System.out.println("\n\t-- Task 13 --");
        Customer ivan = new Customer("Ivan Vasilievuch", "asd@gmail.rom");
        ivan.addPurchase("T-Shirt");
        ivan.addPurchase("Jeans");
        ivan.addPurchase("Shue");
        ivan.printPurchaseHistory();


        // Task 14 Class Company
        System.out.println("\n\t-- Task 14 --");
        Company alfa = new Company("Alfa", 55, 4243.00);
        alfa.printCompanyInfo();


        // Task 15 Class Circle
        System.out.println("\n\t-- Task 15 --");
        Circle circle = new Circle(58);
        circle.printCircleInfo();
    }
}
