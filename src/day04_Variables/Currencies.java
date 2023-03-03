package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
         int dollar = 1000;
         double lira = dollar * 18.90;
         double euro = dollar * 0.86;
         double jpy = dollar * 114.14;
         double pound = dollar * 0.73;
         double CAD = dollar * 1.24;

         //jpy, pound, peso, canadianDollar, riyal...
        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("CAD = " + CAD);
        System.out.println("pound = " + pound);
        System.out.println("jpy = " + jpy);

    }



}
