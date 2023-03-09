package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 501;


        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber;// not even number

        if (evenNumber){ // even number
            System.out.println( number+ " is even number");
        }

        if (!evenNumber){ //not even number
            System.out.println(number+ " is odd number");
        }

        /* if (oddNumber) {
            System.out.println(number+ " is odd number");}
*/

        System.out.println("------------------");
        int n =0;
        if (n>0){
            System.out.println(n+" is positive");}
        if (n<0){
            System.out.println(n+ " is negative");}
        if (n == 0){
            System.out.println(n+" is zero");}




    }


}
