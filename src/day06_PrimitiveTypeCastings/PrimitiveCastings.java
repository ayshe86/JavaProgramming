package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a =100;
        short b = a;
        //short b =(short) a;
        //      (short)a

        int c = (int)b; //if it is gray color already done
        // int c = (int)b

        long d = c;
        //       (long)c

        float e =d;
        double f = e;


        System.out.println("---------------------");


        int x =55;
        short y= (short) x; // explicit casting

        System.out.println(x +":"+y);

        double l =2.5;
        float m = (float) l;
        System.out.println(l + " : "+ m);

        double n = 10.8;
        int s =(int) n;
        System.out.println(n + " : "+ s);

        System.out.println("---------------------");

        double dl =20.5;
        short sl = (short) dl;

        System.out.println(dl+ " : "+sl);

        float f1 =30.5F;
        long l1 = (long) f1;









    }




}
