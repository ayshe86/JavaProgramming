package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        short year = 2022;
        String make = "Toyota ",
                model = "Camry";
        long miles = 50000;
        String color = "Red";
        double price = 19000;

        String fullNameInfoOfCar = year + " " + make + model + "," + miles + " miles,"
                + color + ",$" + price;
        System.out.println(fullNameInfoOfCar);


    }


}
