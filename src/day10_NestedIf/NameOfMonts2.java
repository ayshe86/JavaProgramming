package day10_NestedIf;

public class NameOfMonts2 {
    public static void main(String[] args) {
        int number = 5;
        int n =5;
        String result = "" ; // temporary

        if(number>= 1 && number <= 12){ //if the number is valid (1~12)

            if(number == 1){
                result = "January";
            }else if(number == 2){
                result = "February";
            }else if(number == 3){
                result ="March";
            }else if(number == 4){
                result ="April";
            }else if(number == 5){
                result ="May";
            }else if(number == 6){
                result ="June";
            }else if(number == 7){
                result ="July";
            }else if(number == 8){
                result ="August";
            }else if(number == 9){
                result ="September";
            }else if(number == 10){
                result ="October";
            }else if(number == 11){
                result ="November";
            }else{
                result = "December";
            }

        }else{ //if the number is not valid
            result = "Invalid Number";
        }


        System.out.println(result);

        System.out.println("-------------");

        String result2 = (n==1)? "Jan" : (n==2)?"Feb" :(n==3)?"Mar":(n==4)? "Apr" :(n==5)? "May"
                :(n==6)?"Jun" :(n==7)? "July" :(n==8)? "Agu":(n==9)? "Sep"
                :(n==10)? "Oct" :(n==11)? "Nov" :"Dec" ;
        System.out.println(result2);
    }
}
