package day04_Variables;
/*
1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
						side

						area = side * side;
						perimeter = 4 * side
 */
public class Square {
    public static void main(String[] args) {
        int side = 5;


        int area = side * side;
        int perimeter = 4 * side;
        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
