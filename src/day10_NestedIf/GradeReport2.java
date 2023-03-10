package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {


    int score = 13;

        if(score >= 0 && score <= 100){ // if the score is valid (0 ~ 100 )
        // 5 possibilities: A, B, C, D, F
        if(score>= 90 ){ //false:  score < 90
            System.out.println("Excellent");
        }else if(score >= 80 ){ // false: score < 80
            System.out.println("Great");
        }else if(score >= 70){ // false: score < 70
            System.out.println("Good");
        }else if(score >= 60){// false: score < 60
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }else{ // if the score is NOT valid
        System.out.println("Invalid Score");
    }

        System.out.println("------------------------------------------");

         /*
        // solution2: use ternaries ONLY
        int s =2 ;
        String result = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                        : (s >= 60) ? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);
         */
        System.out.println("---------------------------");
        System.out.println("-------------------------------------------");
        // solution3:
        int s =170 ;
        String result2 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )

            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid Score";
        }

        System.out.println(result2);
}
}
