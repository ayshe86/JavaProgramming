package day07_Operators;

public class Casting {
    public static void main(String[] args) {
        float averageScore = 20.5F;
        byte num1 = (byte) averageScore; // explicit casting if you needt to da it as mandatory
        short num2 = (short) averageScore;// explicit casting
        int num3 = (int) averageScore; // explicit casting
        float num4 = averageScore; // there is no casting
        double num5 = averageScore; // implicit casting
        long num6 = (long) averageScore;

        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);


        // implicit casting: casting smaller type to larger
        //implicit casting : casting the larger type to smaller type
    }


}
/*
1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */