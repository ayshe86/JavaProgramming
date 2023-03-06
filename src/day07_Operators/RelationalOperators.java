package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >,>=, <,<=

        boolean result = 120 > 40; //true
        System.out.println("result = " + result);


        boolean results2 = 300 >= 150;
        System.out.println("results2 = " + results2);

        boolean results3 = 100 >= 100; // true
        System.out.println("results3 = " + results3);
        boolean result4 = 300 >= 500; // false

        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan); // if the credit score is 720 or greater, then it's eligible for the loan


        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        int score = 75;
        boolean hasFailed = score <= 59; // false
        //                      75 <= 59

        System.out.println("hasFailed = " + hasFailed);


        boolean result7 = 45 <= 60;

        System.out.println("result7 = " + result7);


        System.out.println("------------------------------------------");

        int x = 100;
        int y = 200;
        boolean equal = x == y;//false
        //              100==200
        System.out.println("equal = " + equal);

        boolean results8 = "Muhtar" == "Good guy";
        System.out.println("results8 = " + results8);

        boolean results9 = "A" == "a"; //false
        System.out.println("results9 = " + results9);

        boolean results10 = "Java" == "Java";
        System.out.println("results10 = " + results10);

        //"Hello World" ==  "hello world" ==> false

        System.out.println("---------------------");

        boolean results11 = 100 != 200.5; //true
        System.out.println("results11 = " + results11);

        boolean result12 =  "Java" != "Break"; // true
        System.out.println("result12 = " + result12);




    }

}


