package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String name = "Mohanad";
        String lastName = "Aabed";
        int age = 37;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 10000.25;

        String fullName = name + " " + lastName;
        System.out.println("Full name of the person is " + fullName);
        //___ is __ years old
        System.out.println(fullName + " is " + age + " years old." );

        //Full name is Job title, works at companyName
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + fullName + "'s salary is $" + salary  );
    }



}
