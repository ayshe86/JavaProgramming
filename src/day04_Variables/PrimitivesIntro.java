package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        //age: 37 years old

        byte age = 37;

        // weight:160 pounds
        // byte weight = 160; // 160 is out of byte' range
        // byte num = -129;  // -129 is out of byte' range
        short weight = 160; // 160 is within the range of short

        // salary = 100000 $
        // short salary= 100000; // 100000 is out of short' range
        int salary= 100_000;  // int is preferred data type for integer numbers

        long asset = 3_333_333_333L; // out of x range use L or l

        // tax: 0.26
        float tax = 0.26F; // you have use for float f or F

        double PI = 3.14; // we will use double all decimal numbers

       // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 =5000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'B';
        char yesNo ='Y';

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100 > 500;
        System.out.println("result = " + result);

        // String: sequences of character ""
        String employeeName = "Wooden Spoon";
        String city = "Bursa";
        String state ="";
        String country = "Turkey";

        String first_employeeName$ = "Ayshe";
        //int private = 5;
        /*
        Variable naming rules:
        1. Must be unique
        2. Camel case
        3. can not star with digits
        4. starts with lower case letter
        5. Can not be Java reserved words
        6. Can not have special characters other than _ and $
        7. Readable, understandable

         */
    }
 /*
        numerical primitives:
        double > float > long > int > short > byte
         */


}
